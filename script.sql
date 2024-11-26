use lien_lac_dtu

INSERT INTO subject (name_subject, description, credits, code) VALUES 
('Toán Học', 'Môn học về các phép toán và lý thuyết số', 4, 'MATH101'),
('Vật Lý', 'Môn học về các hiện tượng tự nhiên và quy luật vật lý', 3, 'PHYS101'),
('Hóa Học', 'Môn học về các chất và phản ứng hóa học', 3, 'CHEM101'),
('Sinh Học', 'Môn học về sự sống và sinh vật', 3, 'BIO101'),
('Ngữ Văn', 'Môn học về văn học và ngôn ngữ', 4, 'LIT101'),
('Lịch Sử', 'Môn học về các sự kiện và nhân vật lịch sử', 2, 'HIS101'),
('Địa Lý', 'Môn học về địa lý và môi trường tự nhiên', 2, 'GEO101'),
('Tiếng Anh', 'Môn học về ngôn ngữ và văn hóa tiếng Anh', 3, 'ENG101'),
('Tin Học', 'Môn học về công nghệ thông tin và ứng dụng máy tính', 3, 'IT101'),
('Giáo Dục Công Dân', 'Môn học về pháp luật và đạo đức', 2, 'CIV101');

INSERT INTO categories (name, description, icon, thread_count) VALUES 
('Thông Báo', 'Thông báo mới nhất', 'announcement_icon.png', 0),
('Thảo Luận Chung', 'Nơi thảo luận các chủ đề chung', 'general_discussion_icon.png', 0),
('Hỏi Đáp Môn Toán', 'Thảo luận và hỏi đáp về môn Toán', 'math_icon.png', 0),
('Hỏi Đáp Môn Vật Lý', 'Thảo luận và hỏi đáp về môn Vật Lý', 'physics_icon.png', 0),
('Hỏi Đáp Môn Hóa Học', 'Thảo luận và hỏi đáp về môn Hóa Học', 'chemistry_icon.png', 0),
('Hỏi Đáp Môn Sinh Học', 'Thảo luận và hỏi đáp về môn Sinh Học', 'biology_icon.png', 0),
('Hỏi Đáp Môn Ngữ Văn', 'Thảo luận và hỏi đáp về môn Ngữ Văn', 'literature_icon.png', 0),
('Hỏi Đáp Môn Tiếng Anh', 'Thảo luận và hỏi đáp về môn Tiếng Anh', 'english_icon.png', 0),
('Công Nghệ Thông Tin', 'Thảo luận về công nghệ thông tin và phần mềm', 'it_icon.png', 0),
('Thông Tin Nhà Trường', 'Thông tin cập nhật từ nhà trường', 'school_info_icon.png', 0);

INSERT INTO school (name_school, address, phone_number, email, logo) VALUES 
('Trường THPT A', '123 Đường ABC, Quận 1, TP. HCM', '0123456789', 'contact@thpta.edu.vn', 'logo1.png'),
('Trường THCS B', '456 Đường XYZ, Quận 2, TP. HCM', '0987654321', 'contact@thcsb.edu.vn', 'logo2.png'),
('Trường Tiểu Học C', '789 Đường DEF, Quận 3, TP. HCM', '0912345678', 'contact@tieuhocc.edu.vn', 'logo3.png'),
('Trường THPT D', '101 Đường GHI, Quận 4, TP. HCM', '0909876543', 'contact@thptd.edu.vn', 'logo4.png'),
('Trường THCS E', '102 Đường JKL, Quận 5, TP. HCM', '0971234567', 'contact@thcse.edu.vn', 'logo5.png'),
('Trường Tiểu Học F', '103 Đường MNO, Quận 6, TP. HCM', '0939871234', 'contact@tieuhocf.edu.vn', 'logo6.png'),
('Trường THPT G', '104 Đường PQR, Quận 7, TP. HCM', '0965432109', 'contact@thptg.edu.vn', 'logo7.png'),
('Trường THCS H', '105 Đường STU, Quận 8, TP. HCM', '0923456789', 'contact@thcsh.edu.vn', 'logo8.png'),
('Trường Tiểu Học I', '106 Đường VWX, Quận 9, TP. HCM', '0912123456', 'contact@tieuhoci.edu.vn', 'logo9.png'),
('Trường THPT J', '107 Đường YZ, Quận 10, TP. HCM', '0956789123', 'contact@thptj.edu.vn', 'logo10.png');

INSERT INTO notifications (user_id, title, content, type, link, is_read) VALUES 
(1, 'Thông báo hệ thống', 'Hệ thống sẽ bảo trì vào cuối tuần này.', 'SYSTEM', '/maintenance', false),
(2, 'Cập nhật điểm', 'Điểm thi cuối kỳ của bạn đã được cập nhật.', 'GRADE', '/grades', false),
(3, 'Thông báo điểm danh', 'Bạn đã vắng mặt trong tiết học sáng nay.', 'ATTENDANCE', '/attendance', false),
(1, 'Tin nhắn từ giáo viên', 'Giáo viên chủ nhiệm đã gửi bạn một tin nhắn.', 'MESSAGE', '/messages/teacher', false),
(2, 'Thông báo diễn đàn', 'Chủ đề mới đã được đăng trong diễn đàn lớp.', 'FORUM', '/forum/topics', false),
(3, 'Thông báo hệ thống', 'Có bản cập nhật mới cho ứng dụng.', 'SYSTEM', '/updates', true),
(3, 'Cập nhật điểm', 'Điểm kiểm tra giữa kỳ của bạn đã được cập nhật.', 'GRADE', '/grades/midterm', false),
(2, 'Thông báo điểm danh', 'Bạn đã vắng mặt trong tiết học chiều nay.', 'ATTENDANCE', '/attendance', true),
(1, 'Tin nhắn từ phụ huynh', 'Phụ huynh đã gửi bạn một tin nhắn.', 'MESSAGE', '/messages/parent', false),
(1, 'Thông báo diễn đàn', 'Chủ đề lớp học đã có bài đăng mới.', 'FORUM', '/forum/class', true);

INSERT INTO messages (sender_id, receiver_id, title, content, is_read, sent_at, read_at) VALUES 
(1, 4, 'Xin chào', 'Chào bạn, bạn có thể giúp mình bài tập toán không?', false, '2024-11-01 09:15:00', NULL),
(4, 3, 'Re: Xin chào', 'Chào bạn, mình sẽ cố gắng giúp bạn.', true, '2024-11-01 09:30:00', '2024-11-01 09:35:00'),
(1, 4, 'Thông báo họp lớp', 'Lớp mình sẽ họp vào chiều mai nhé.', false, '2024-11-02 10:00:00', NULL),
(4, 5, 'Re: Thông báo họp lớp', 'Cảm ơn bạn đã thông báo.', true, '2024-11-02 10:15:00', '2024-11-02 10:20:00'),
(5, 1, 'Câu hỏi về bài tập', 'Bạn đã hoàn thành bài tập lý chưa?', false, '2024-11-03 14:00:00', NULL),
(3, 5, 'Re: Câu hỏi về bài tập', 'Mình đã làm xong rồi, cần hỗ trợ không?', true, '2024-11-03 14:15:00', '2024-11-03 14:20:00'),
(2, 3, 'Nhắc nhở nộp bài', 'Nhớ nộp bài tập lịch sử trước thứ 5 nhé.', false, '2024-11-04 08:30:00', NULL),
(3, 2, 'Re: Nhắc nhở nộp bài', 'Mình sẽ nộp trước hạn.', true, '2024-11-04 08:45:00', '2024-11-04 08:50:00'),
(4, 1, 'Lịch kiểm tra cuối kỳ', 'Lịch kiểm tra sẽ diễn ra vào tuần sau.', false, '2024-11-05 16:30:00', NULL),
(1, 2, 'Re: Lịch kiểm tra cuối kỳ', 'Cảm ơn bạn đã thông báo.', true, '2024-11-05 16:45:00', '2024-11-05 16:50:00');

INSERT INTO classes (name_class, academic_year, school_id, teacher_id) VALUES 
('Lớp 10A1', '2024-2025', 1, 5),
('Lớp 10A2', '2024-2025', 2, 4),
('Lớp 11A1', '2024-2025', 2, 4),
('Lớp 11A2', '2024-2025', 2, 5),
('Lớp 12A1', '2024-2025', 3, 5),
('Lớp 12A2', '2024-2025', 3, 4),
('Lớp 10B1', '2024-2025', 4, 4),
('Lớp 10B2', '2024-2025', 4, 5),
('Lớp 11B1', '2024-2025', 5, 5),
('Lớp 12B2', '2024-2025', 5, 4);

INSERT INTO attendaces (students_id, classes_id, attendance_date, present, reason, note) VALUES 
(1, 1, '2024-11-01', TRUE, NULL, 'Có mặt đúng giờ'),
(2, 1, '2024-11-01', FALSE, 'Bị ốm', 'Nghỉ có phép'),
(3, 3, '2024-11-01', TRUE, NULL, 'Đi học đầy đủ'),
(1, 4, '2024-11-01', FALSE, 'Lý do gia đình', 'Nghỉ không phép'),
(3, 5, '2024-11-01', TRUE, NULL, 'Đến muộn 5 phút'),
(2, 6, '2024-11-02', TRUE, NULL, 'Có mặt đúng giờ'),
(1, 7, '2024-11-02', FALSE, 'Bị đau đầu', 'Nghỉ có phép'),
(3, 8, '2024-11-02', TRUE, NULL, 'Có mặt từ tiết 2'),
(2, 9, '2024-11-03', TRUE, NULL, 'Đi học đủ các tiết'),
(2, 10, '2024-11-03', FALSE, 'Lý do gia đình', 'Nghỉ không phép');

INSERT INTO grades (score, semester, academic_year, comment, grade_type, student_id, subject_id, classes_id) VALUES 
(85.5, 'Semester 1', '2024-2025', 'Good performance', 'MIDTERM', 1, 1, 1),
(90.0, 'Semester 1', '2024-2025', 'Excellent work', 'FINAL', 1, 2, 1),
(78.0, 'Semester 1', '2024-2025', 'Needs improvement', 'ASSIGNMENT', 2, 1, 1),
(88.0, 'Semester 1', '2024-2025', 'Well done', 'QUIZ', 2, 2, 1),
(92.0, 'Semester 1', '2024-2025', 'Outstanding project', 'PROJECT', 3, 1, 2),
(75.0, 'Semester 1', '2024-2025', 'Average score', 'MIDTERM', 3, 2, 2),
(85.0, 'Semester 2', '2024-2025', 'Good participation', 'FINAL', 1, 3, 2),
(80.0, 'Semester 2', '2024-2025', 'Decent effort', 'ASSIGNMENT', 2, 3, 2),
(95.0, 'Semester 2', '2024-2025', 'Excellent group work', 'PROJECT', 1, 1, 3),
(88.5, 'Semester 2', '2024-2025', 'Very good performance', 'QUIZ', 2, 2, 3);

INSERT INTO scheduals (classes_id, subject_id, teacher_id, day_of_week, start_time, end_time, room, semester, academic_year) VALUES 
(1, 1, 4, 'MONDAY', '08:00:00', '09:30:00', 'Room A1', 'Semester 1', '2024-2025'),
(1, 2, 5, 'TUESDAY', '10:00:00', '11:30:00', 'Room A2', 'Semester 1', '2024-2025'),
(2, 3, 5, 'WEDNESDAY', '09:00:00', '10:30:00', 'Room B1', 'Semester 1', '2024-2025'),
(2, 4, 4, 'THURSDAY', '13:00:00', '14:30:00', 'Room B2', 'Semester 1', '2024-2025'),
(3, 5, 4, 'FRIDAY', '08:00:00', '09:30:00', 'Room C1', 'Semester 1', '2024-2025'),
(3, 6, 5, 'MONDAY', '10:30:00', '12:00:00', 'Room C2', 'Semester 1', '2024-2025'),
(1, 7, 5, 'TUESDAY', '14:00:00', '15:30:00', 'Room A1', 'Semester 2', '2024-2025'),
(2, 8, 4, 'WEDNESDAY', '11:00:00', '12:30:00', 'Room B1', 'Semester 2', '2024-2025'),
(3, 9, 4, 'THURSDAY', '09:00:00', '10:30:00', 'Room B2', 'Semester 2', '2024-2025'),
(2, 10, 5, 'FRIDAY', '15:00:00', '16:30:00', 'Room C1', 'Semester 2', '2024-2025');

INSERT INTO documents (title, `description`, grade_level, file_url, file_type, file_size, document_type, uploader_id, subject_id, upload_date)
VALUES
    ('Thông báo điểm kiểm tra giữa kỳ', 'Kết quả điểm kiểm tra giữa kỳ của học sinh lớp 10A', '10', 'http://example.com/documents/midterm_grade_10A.pdf', 'PDF', 1024, 'DOCUMENTATION', 1, 1, NOW()),
    ('Bảng điểm cuối kỳ', 'Kết quả học tập cuối kỳ của học sinh lớp 10A', '10', 'http://example.com/documents/final_grade_10A.pdf', 'WORD', 2048, 'DOCUMENTATION', 1, 1, NOW()),
    ('Thông báo nghỉ học', 'Thông báo nghỉ học do thời tiết xấu', '10', 'http://example.com/documents/school_closure.pdf', 'PDF', 512, 'DOCUMENTATION', 2, 2, NOW()),
    ('Hướng dẫn ôn tập', 'Tài liệu ôn tập cho kỳ thi giữa kỳ', '10', 'http://example.com/documents/review_material.pdf', 'WORD', 1024, 'DOCUMENTATION', 2, 2, NOW()),
    ('Điểm danh lớp 11B', 'Danh sách điểm danh lớp 11B', '11', 'http://example.com/documents/attendance_11B.pdf', 'PDF', 768, 'DOCUMENTATION', 3, 3, NOW()),
    ('Lịch thi cuối kỳ', 'Lịch thi cuối kỳ cho các lớp khối 12', '12', 'http://example.com/documents/final_exam_schedule.pdf', 'PDF', 1024, 'DOCUMENTATION', 3, 4, NOW()),
    ('Đề thi thử', 'Đề thi thử môn Toán khối 12', '12', 'http://example.com/documents/mock_exam_math_12.pdf', 'PP', 1536, 'EXAMJUBJECT', 4, 4, NOW()),
    ('Bài tập về nhà', 'Bài tập về nhà môn Vật lý lớp 11', '11', 'http://example.com/documents/homework_physics_11.pdf', 'PDF', 256, 'DOCUMENTATION', 5, 5, NOW()),
    ('Kết quả kiểm tra', 'Kết quả kiểm tra 1 tiết môn Hóa lớp 11', '11', 'http://example.com/documents/chemistry_test_11.pdf', 'PP', 512, 'DOCUMENTATION', 5, 6, NOW()),
    ('Thư mời họp phụ huynh', 'Thư mời họp phụ huynh học sinh lớp 10B', '10', 'http://example.com/documents/parent_meeting_invitation.pdf', 'PDF', 512, 'DOCUMENTATION', 1, 1, NOW());

INSERT INTO forum_threads (title, content, category_id, author_id, comment_count, pinned, created_at)
VALUES 
('Thread Title 1', 'This is the content for thread 1.', 1, 1, 5, false, '2024-11-10 08:00:00'),
('Thread Title 2', 'This is the content for thread 2.', 2, 2, 3, false, '2024-11-10 09:00:00'),
('Thread Title 3', 'This is the content for thread 3.', 4, 3, 10, true, '2024-11-10 10:00:00'),
('Thread Title 4', 'This is the content for thread 4.', 3, 1, 0, false, '2024-11-10 11:00:00'),
('Thread Title 5', 'This is the content for thread 5.', 5, 2, 7, true, '2024-11-10 12:00:00'),
('Thread Title 6', 'This is the content for thread 6.', 6, 1, 2, false, '2024-11-10 13:00:00'),
('Thread Title 7', 'This is the content for thread 7.', 7, 3, 8, true, '2024-11-10 14:00:00'),
('Thread Title 8', 'This is the content for thread 8.', 8, 1, 1, false, '2024-11-10 15:00:00'),
('Thread Title 9', 'This is the content for thread 9.', 9, 2, 4, false, '2024-11-10 16:00:00'),
('Thread Title 10', 'This is the content for thread 10.', 10, 3, 6, true, '2024-11-10 17:00:00');
