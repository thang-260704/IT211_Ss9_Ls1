package com.example.it211_ss9_ls1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class FlashSaleService {

    private static final Logger logger = LoggerFactory.getLogger(FlashSaleService.class);

    public void applyDiscount(String userId, String code) {
        logger.info("Đang xử lý mã giảm giá: {} cho user: {}", code, userId);

        try {
            // Giả lập logic xử lý mã giảm giá
            if (code == null || code.isBlank()) {
                throw new RuntimeException("Mã giảm giá không hợp lệ");
            }

            logger.info("Áp dụng mã giảm giá thành công. userId={}, code={}", userId, code);

        } catch (Exception e) {
            logger.error("Áp dụng mã giảm giá thất bại. userId={}, code={}", userId, code, e);
        }
    }
}