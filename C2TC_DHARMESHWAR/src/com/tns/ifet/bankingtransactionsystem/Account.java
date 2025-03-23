package com.tns.ifet.bankingtransactionsystem;

public abstract class Account {
	protected double balance;

    // Abstract methods for deposit, withdraw, and getBalance
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double getBalance();

    // Concrete method for showing balance
    public void showBalance() {
        System.out.println("Current balance: Rs." + balance);
    }
}
