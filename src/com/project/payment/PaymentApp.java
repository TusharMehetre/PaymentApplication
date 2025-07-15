package com.project.payment;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class PaymentApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		List<String> paymentHistory = new ArrayList<>(); 
		
		PaymentOption option = new PaymentOption(); //maps define 	in this class 
		
		System.out.println("Select payment method: ");
		System.out.println("1. Credit Card");
		System.out.println("2. Debit Card");
		System.out.println("3. UPI");
		System.out.print("Enter a choice (1/2/3): ");
	
	try
	{
		int choice = scan.nextInt();
		if(option.getPaymentOptions().containsKey(choice))
		{
			PaymentMethod payment = option.getPaymentOptions().get(choice); //getting object from map and call its pay()
			payment.pay();
			paymentHistory.add(option.getPaymentTypes().get(choice).toString());
		}
		else
		{
			throw new InvalidPaymentChoiceException("Invalid choice, please enter value beterrn 1 -3");
		}
		System.out.println("\nPayment history: "+paymentHistory);
	}
	catch(InvalidPaymentChoiceException ex)
	{
		System.out.println("Error : "+ ex.getMessage());
	}
	catch(InputMismatchException ex)
	{
		System.out.println("Error : Please enter a valid number");
	}
	finally
	{
		System.out.println("Thank you for using payment Application");
	}
  }
}
