/* Assignment No. 15
* Date : 04/12/2022
* Program-2
* Design the Account class which contain id, accountNumber and
balance.
Design another class called as SavingAccount extends Account that
contain withdrawAmount.
Design class AccountDetails class in which below methods.
Public void getAccountDetails ()
public static int getWithdrawDetails(Account account)
*/

package com.velocity.assignment15;

public class Account {
	
	// Declare
	private int id;
	private long accountNumber;
	private int balance;
	
	// Use Getter Setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
 }
