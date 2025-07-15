package com.project.payment;

public class UPIPayment extends PaymentMethod
{
	public UPIPayment()
	{
		super("UPI");
	}
	@Override 
	public void pay()
	{
		System.out.println("Payment successdull by"+ methodName);
	}
}
