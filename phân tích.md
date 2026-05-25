# PHÂN TÍCH BÀI 1 - TỪ BỎ System.out.println()

## 3 lý do không dùng System.out.println() trên Production

- Không có cấu trúc log rõ ràng: System.out.println() không cho biết log thuộc level nào như INFO, WARN, ERROR, cũng không thể hiện rõ class, thread hoặc thời điểm sinh log.

- Không lưu vết ổn định: Khi server restart, output trên console có thể bị mất, gây khó khăn khi cần điều tra lỗi sau sự cố.

- Khó debug lỗi nghiêm trọng: e.printStackTrace() chỉ in lỗi thô ra console, không kiểm soát được format, không dễ gom log, tìm kiếm hoặc phân tích trên hệ thống production.

## Cách xử lý mới

Thay System.out.println() bằng SLF4J Logger:

- Dùng logger.info() để ghi nhận hành vi xử lý bình thường.
- Dùng logger.error(..., e) để ghi lỗi kèm đầy đủ stack trace.
- Log có thể được cấu hình để ghi ra console, file hoặc hệ thống giám sát tập trung.

## Kết luận

Sử dụng SLF4J giúp hệ thống dễ theo dõi, dễ debug, phân loại được mức độ lỗi và phù hợp hơn với môi trường Production.