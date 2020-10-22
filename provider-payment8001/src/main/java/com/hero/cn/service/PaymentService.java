package com.hero.cn.service;

import com.hero.cn.models.Payment;

/**
 * @author sucx
 * @projectName colud-parent
 * @description:
 * @date 2020/10/2116:45
 */
public interface PaymentService {
    int createPayment(Payment payment);

    Payment selectPaymentById(Long id);
}
