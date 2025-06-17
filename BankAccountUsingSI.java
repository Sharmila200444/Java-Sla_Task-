package com.Task;

class BankAccountl1 {
	double Balance;
	
	BankAccountl1(double initial_balance){
		Balance=initial_balance;
	}
	 void deposit(double amount) {
		 if(amount>0) {
			 Balance+=amount;
			 System.out.println("Deposited: ₹" + amount);
		 }
		 else {
			 System.out.println("Invalid deposit amount");
		 }
	 }
	 void withdraw(double amount) {
		 if(amount>0 && amount<=Balance) {
		 Balance-=amount;
		 System.out.println("Withdrawn: ₹" + amount);
	 }
	 else {
		 System.out.println("Insufficient balance or invalid amount.");
	 }
	 }
	 void display() {
		 System.out.println("Current Balance:"+Balance);
	 }
}

class SavingAccount extends BankAccountl1{
	SavingAccount(double initialbalance){
		super(initialbalance);
	}
		 void withdraw(double amount) {
			 if (amount > 0) {
		            if (Balance - amount >= 100) {
		                Balance -= amount;
		                System.out.println("Withdrawn from Savings: ₹" + amount);
		            } else {
		                System.out.println("Withdrawal denied. Minimum balance ₹100 must be maintained.");
		            }
		        } else {
		            System.out.println("Invalid withdrawal amount.");
		        }

		 }
		
		
	}

	


public class BankAccountUsingSI {

	public static void main(String[] args) {
		SavingAccount obj=new SavingAccount(5000.7);
		obj.deposit(300.89);
		obj.withdraw(5300.8);
		obj.display();
		
	
		
		// TODO Auto-generated method stub

	}

}
