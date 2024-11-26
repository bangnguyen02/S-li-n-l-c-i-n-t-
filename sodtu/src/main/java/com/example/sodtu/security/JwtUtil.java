package com.example.sodtu.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

@Component
public class JwtUtil {
    private final Key secretKey = Keys.secretKeyFor(SignatureAlgorithm.HS256);
    private final long accessTokenExpirationTime = 1000 * 60 * 60;
    public String extractUsername(String token){
        return extractClaim(token, Claims::getSubject);
    }
    public Date extractExpiration(String token){
        return extractClaim(token, Claims::getExpiration);
    }
    public <T> T extractClaim(String token, Function<Claims, T> claimsResolver){
        final Claims claims = extractAllClaims(token);
        return claimsResolver.apply(claims);
    }
    private Claims extractAllClaims(String token){
        return Jwts.parserBuilder().setSigningKey(secretKey).build().parseClaimsJws(token).getBody();
    }
    private Boolean isTokenExpired(String token){
        return extractExpiration(token).before(new Date());
    }
    public String generateToken(UserDetails userDetails){
        Map<String, Object> claims = new HashMap<>();
        return createToken(claims, userDetails.getUsername(), accessTokenExpirationTime);
    }
    private String createToken(Map<String, Object> claims, String subject, Long expirationTime){
        return Jwts.builder().setClaims(claims).setSubject(subject).setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + expirationTime))
                .signWith(secretKey).compact();
    }
    public Boolean validateToken(String token, UserDetails userDetails){
        final String username = extractUsername(token);
        if (userDetails == null) {
            return !isTokenExpired(token);
        }
        return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));
    }
    public UsernamePasswordAuthenticationToken getAuthentication(String token, UserDetails userDetails, HttpServletRequest request) {
        return new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
    }
}
