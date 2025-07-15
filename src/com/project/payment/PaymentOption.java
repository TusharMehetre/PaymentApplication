package com.project.payment;

import java.util.HashMap;
import java.util.Map;

public class PaymentOption {
	
	private Map<Integer, PaymentMethod> paymentOptions; 
	private Map<Integer, PaymentType> paymentTypes;
	
	public PaymentOption()
	{
		paymentOptions = new HashMap<>();
		paymentOptions.put(1, new CardPayment("CreditCard"));
		paymentOptions.put(2, new CardPayment("DebitCard"));
		paymentOptions.put(3, new UPIPayment());
		
		paymentTypes = new HashMap<>();
		paymentTypes.put(1, PaymentType.CREDIT_CARD);
		paymentTypes.put(2, PaymentType.DEBIT_CARD);
		paymentTypes.put(3, PaymentType.UPI);
	}
	public Map<Integer, PaymentMethod> getPaymentOptions()
	{
		return paymentOptions;
	}
	public Map<Integer, PaymentType> getPaymentTypes()
	{
		return paymentTypes;
	}
}
