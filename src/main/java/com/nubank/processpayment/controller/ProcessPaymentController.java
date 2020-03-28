package com.nubank.processpayment.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nubank.processpayment.service.ProcessPaymentService;

@RestController
public class ProcessPaymentController {
	
	@Autowired
	private ProcessPaymentService service;
	
	@GetMapping("process-payment")
    public ResponseEntity<String> authorizePayment(@Valid @RequestParam String cpf)  {
		String custumer = service.processPayment(cpf);
    	return ResponseEntity.ok().body(custumer);
    }

}
