package com.velocity.assignment15;

import java.util.Scanner;

public class AccountDetails {
	
	// Create Method
	public void getAccountDetails() {
		
	 System.out.println(" Enter Account Details >>>");
	 
	 // Create Scanner Object
	 Scanner scan = new Scanner(System.in);
	 
	  System.out.println(" Enter id >>> ");
	  int id = scan.nextInt();
	  
	  System.out.println(" Enter account number >>> ");
	  long accountNumber = scan.nextLong();
	  
	  System.out.println(" Enter balance >>> ");
	  int balance = scan.nextInt();
	  
	  // Create an Object of Account Class
	  Account account = new Account();
	  
	  // Set Values From Users
	  account.setId(id);
	  account.setAccountNumber(accountNumber);
	  account.setBalance(balance);
	  
	  getWithdrawDetails(account);
	}
	
	// Create Return type static method
	private static int getWithdrawDetails(Account account) {
		
		int currentBalance = 0;
		
		// Create Scanner Object
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the amount for withdrawal >>>");
		int withdrawAmount = sc.nextInt();
		
		if(account.getBalance() > withdrawAmount) {
			
			currentBalance = account.getBalance() - withdrawAmount;
		}
		
		System.out.println(" Your current account balance is >>> " + currentBalance);
		
		return currentBalance;
		
	}
 }
