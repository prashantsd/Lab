package lab;
//Create an abstract class called "BankAccount" with attributes such as account number and balance, 
//and abstract methods called "deposit" and "withdraw". Create a subclass called "CheckingAccount" 
//that inherits from BankAccount and implements the "deposit" and "withdraw" methods. 
//Create an object of the CheckingAccount class and call both the "deposit" and "withdraw" methods.

import java.util.Scanner;

import basic.Bank;

abstract class BankAccount
{
	int accountNumber;
	double balance;
	
	
	

	
	public BankAccount(int accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	abstract void deposit(double deposit);
	abstract void withdraw(double withdrawl);
	
}

class CheckingAccount extends BankAccount{

	

	

	public CheckingAccount(int accountNumber, double balance) {
		super(accountNumber, balance);
	}

	@Override
	void deposit(double deposit) {
		Scanner sc = new Scanner(System.in);
		if(500<=deposit)
		{
			System.out.println("Select Time Duration ?");
			System.out.println("Choose option : 1) 6 Month 2) 12 Month");
			int ch = sc.nextInt();
			String s = ch == 1 ? "6 Month":"12 Month";
			System.out.println("Amount "+deposit+" are Deposit the for duration of "+s);
			System.out.println("Total Balance : "+(deposit+balance));
			System.out.println("Deposit Successful!!");	
		}
		else {
			System.out.println("Invalid Amount");
		}
		
	}

	@Override
	void withdraw(double withdrawl) {
		
		if(withdrawl < balance)
		{
			if(withdrawl % 100 == 0)
			{
				double new_bal = balance-withdrawl;
				System.out.println("Withdrawl Successful!!");
				System.out.println("Balance : "+new_bal);	
			}
			else {
				System.out.println("Please enter amount that is multiplication of 100/500");
			}
			
		}
		else
		{
			System.out.println("Insufficient Balance!!");
		}
		
	}
	
	
	
}
public class BackAccountLab {

	public static void main(String[] args) {
		
		float balance,deposit,withdrawl;

		CheckingAccount ck = new CheckingAccount(123456789, 15000);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to RBI");
		
		System.out.println("Choose option 1) Withdraw 2) Deposit 3) Exit");
		
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("Enter the amount to withdraw : ");
			withdrawl = sc.nextFloat();
			ck.withdraw(withdrawl);
			break;
		case 2:
			System.out.println("Minimum amount should be at least Rs. 500 : ");
			System.out.println("Enter the amount to Deposit : ");
			deposit = sc.nextFloat();
			ck.deposit(deposit);
			break;
		case 3:
			System.out.println("Thak you ");
			System.out.println("Visit Again...");
			break;
		}

	}

}
