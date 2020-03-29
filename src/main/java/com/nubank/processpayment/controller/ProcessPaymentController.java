package com.nubank.processpayment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nubank.processpayment.form.PaymentRequestForm;
import com.nubank.processpayment.service.ProcessPaymentService;

@RestController
public class ProcessPaymentController {
	
	@Autowired
	private ProcessPaymentService service;
	
	@PostMapping("process-payment")
    public ResponseEntity<String> authorizePayment(@RequestBody PaymentRequestForm payment)  {
		String custumer = service.processPayment(payment);
    	return ResponseEntity.ok().body(custumer);
    }

}
