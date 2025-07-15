package com.project.payment;

public class CardPayment extends PaymentMethod
{
	public CardPayment(String methodName)
	{
		super(methodName);  //parent constructor call
	}
	@Override
	public void pay()
	{
		System.out.println("Payment Successful by "+methodName);
	}
}
