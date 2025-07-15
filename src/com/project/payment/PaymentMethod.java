package com.project.payment;

public abstract class PaymentMethod implements Payment
{
	protected String methodName; //take every payment name 
	
	public PaymentMethod(String methodName)
	{
		this.methodName = methodName;
	}
	public abstract void pay();   //abstract method implement subclasses
}
