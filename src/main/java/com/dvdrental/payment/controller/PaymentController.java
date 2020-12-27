package com.dvdrental.payment.controller;

import com.dvdrental.payment.model.Payment;
import com.dvdrental.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/")
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @PostMapping("/payment")
    public void doPayment(@RequestBody Payment payment) {
        System.out.print(payment);
        paymentService.doPayment(payment);
        System.out.print(payment);
    }

}
