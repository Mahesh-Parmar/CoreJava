package oops_concepts;

public class Bank_Account {
	
	/**
	 * ***Exercise***
	 * 1. Create a Bank_Account class
	 * 2. Create private member variable for Account Number, Account Name and Account Balance
	 * 3. Create methods to deposit and withdraw the amount and to display the current Balance
	 * 4. Create an constructor with arguments for Account Number,Name and Balance
	 * 5. Create a class BankAccount_Main with a main method
	 * 6. Create an object of Bank_Account
	 * 6. Call the methods to deposit and withdraw the money from Bank Account and Display the current Balance.
	 */
	private long acNo;
	private String acName;
	private double acBalance;
	
	public void diposit(double amt) {
		if (amt>0) {
			acBalance = acBalance + amt;
			System.out.println("Successfully deposited ruppes $ " + amt);
		} else {
			System.out.println("Cannot deposit "+ amt);
		}
	}
	
	public void withdraw(double amt) {
		if (amt>0) {
			acBalance = acBalance - amt;
			System.out.println("Successfully withdraw ruppes $ " + amt);
		} else {
			System.out.println("Cannot withdraw "+ amt);
		}
	}
	
	public void displayCurrentBalance() {
		System.out.println("Your current balance is ruppes $ "+ acBalance);
	}
	
	public Bank_Account(long acNo, String acName, double acBalance) {
		this.acNo = acNo;
		this.acName = acName;
		this.acBalance = acBalance;
	}
}
