package com.hero.cn.service.impl;

import com.hero.cn.mappers.PaymentMapper;
import com.hero.cn.models.Payment;
import com.hero.cn.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author sucx
 * @projectName colud-parent
 * @description:
 * @date 2020/10/2116:47
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentMapper paymenyMapper;
    @Override
    public int createPayment(Payment payment) {
        return paymenyMapper.insert(payment);
    }

    @Override
    public Payment selectPaymentById(Long id) {
        return paymenyMapper.selectById(id);
    }
}
