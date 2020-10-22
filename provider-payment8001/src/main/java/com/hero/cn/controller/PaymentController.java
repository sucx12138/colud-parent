package com.hero.cn.controller;

import com.hero.cn.models.CommonModel;
import com.hero.cn.models.Payment;
import com.hero.cn.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author sucx
 * @projectName colud-parent
 * @description:
 * @date 2020/10/2116:43
 */
@RestController
@RequestMapping(value = "/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @GetMapping(value = "select/{id}")
    public CommonModel<Payment> selectPayment(@PathVariable("id")Long id){
        Payment payment = paymentService.selectPaymentById(id);
        return  new CommonModel<>(200,"查询成功",payment);
    }
    @PostMapping(value = "add")
    public CommonModel<Integer> createPayment(@RequestBody Payment payment){
        int createCount = paymentService.createPayment(payment);
        return  new CommonModel<>(200,"操作成功",createCount);
    }

}
