package com.project.payment;

public class InvalidPaymentChoiceException extends Exception
{
	public InvalidPaymentChoiceException(String message)
	{
		super(message);
	}
}
