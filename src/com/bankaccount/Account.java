package com.bankaccount;

public class Account {
	
	private int accountNumber;
	private double balance;
	
	//constructor
	public Account(int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public int getAccountNUmber() {
		return this.accountNumber;
	}
	
	public void setAccountNUmber(int account) {
		this.accountNumber = account;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void depositValue(double value) {
		this.balance += value;
		System.out.println("Depósito de R$" + value + " efetuado. Saldo R$" + this.balance);
	}
	
	public void withdrawal(double value) {
		if(this.balance - value < 0) {
			System.out.println("Saldo disponível R$" + this.balance + ", operação não processada!");
		} else {
			this.balance -= value;
			System.out.println("Saque de R$" + value + " realizado. Saldo restante R$"+ this.balance);
		}

	}
}	

