package com.nubank.processpayment.service;

import com.nubank.processpayment.form.PaymentRequestForm;

public interface ProcessPaymentService {

	String processPayment(PaymentRequestForm payment);

}
