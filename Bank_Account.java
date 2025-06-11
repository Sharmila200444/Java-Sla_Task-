package com.Task;

import java.math.BigInteger;

public class Bank_Account {
	private BigInteger AccountNo;
	private double Balance;
	
	void setAcc(BigInteger AccountNo) {
		this.AccountNo=AccountNo;
	}
	BigInteger getAcc() {
		return AccountNo;
	}
	void setBal(double Balance) {
		this.Balance=Balance;
	}
	double getBal() {
		return Balance;
	}
	public static void main(String[] args) {
		
		Bank_Account obj=new Bank_Account();
		obj.setAcc(new BigInteger("42563786547"));
		System.out.println("Account Number is :"+obj.getAcc());
		obj.setBal(6000.57);
		System.out.println("Balance Amount : "+obj.getBal());
		
		
		// TODO Auto-generated method stub

	}

}
