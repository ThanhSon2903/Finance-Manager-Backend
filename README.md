# 💼 Finance Manager Backend (Spring Boot) 

1. ## Giới thiệu dự án
- Finance Manager Backend là hệ thống RESTful API được xây dựng bằng Spring Boot, phục vụ ứng dụng quản lý tài chính cá nhân.
- Dự án cung cấp các chức năng xác thực người dùng bằng JWT, quản lý thu – chi, phân loại danh mục, upload hình ảnh hóa đơn, xuất báo cáo tài chính ra    Excel/PDF và gửi thông báo nhắc nhở hằng ngày theo cài đặt của người dùng.

2. ## Các công nghệ sử dụng
- Java
- Spring Boot, Spring Security, Spring Data JPA
- MySQL, PostgreSQL
- Docker, Cloudinary, Apache POI.

3. ## Các chức năng
✅ Nhóm chức năng chính
 - Đăng ký / đăng nhập
 - CRUD thu – chi
 - Phân loại danh mục (category)
 - Phân trang & sắp xếp danh sách
📊 Báo cáo & thống kê
 - Thống kê thu – chi theo ngày / tháng
 - Tổng hợp số dư
 - Export Excel/PDF
🔔 Thông báo & nhắc nhở
 - Nhắc nhập chi tiêu hằng ngày
 - Thông báo theo giờ đã chọn
 - Gửi email thông báo
4. ## 📂 Project Structure
<img width="479" height="714" alt="cauTrucDuAn" src="https://github.com/user-attachments/assets/c8533aca-a3cc-43b8-8afd-a9a95359ddc9" />

5. ## 🚀 How to Run
## 🌐 Demo
- Backend API: https://finance-manager-backend-2.onrender.com/**
- Database Deloy: PostgreSQL
- Image Storage: Cloudinary
## 🚀Local
-  Clone repository
-  Cấu hình `application.yaml`
-  Run bằng Maven
