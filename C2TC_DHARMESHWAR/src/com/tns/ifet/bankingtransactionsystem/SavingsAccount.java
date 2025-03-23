package com.tns.ifet.bankingtransactionsystem;

public class SavingsAccount extends Account{
	private static final double INTEREST_RATE = 0.03;

    // Constructor to initialize balance and increment total accounts
    public SavingsAccount(double initialBalance) {
        this.balance = initialBalance;
        Bank.incrementTotalAccounts();
    }

    // Deposit method for SavingsAccount
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited Rs." + amount + " in Savings Account.");
    }

    // Withdraw method for SavingsAccount
    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew Rs." + amount + " from Savings Account.");
        } else {
            System.out.println("Insufficient funds in Savings Account.");
        }
    }

    // Get balance for SavingsAccount
    @Override
    public double getBalance() {
        return balance;
    }
}
