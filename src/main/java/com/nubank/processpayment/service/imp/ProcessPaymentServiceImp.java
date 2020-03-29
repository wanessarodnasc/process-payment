package com.nubank.processpayment.service.imp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.nubank.processpayment.form.PaymentRequestForm;
import com.nubank.processpayment.service.ProcessPaymentService;

@Service
public class ProcessPaymentServiceImp implements ProcessPaymentService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ProcessPaymentServiceImp.class);

	@Override
	public String processPayment(PaymentRequestForm payment) {
		LOGGER.info("Process paymento to cpf : " + payment.getCpf());
		return "DONE";
	}
}
