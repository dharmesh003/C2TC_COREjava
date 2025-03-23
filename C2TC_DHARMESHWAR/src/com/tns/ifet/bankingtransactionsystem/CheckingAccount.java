package com.tns.ifet.bankingtransactionsystem;

public class CheckingAccount extends Account{
	private static final double OVERDRAFT_LIMIT = 100.00;

    // Constructor to initialize balance and increment total accounts
    public CheckingAccount(double initialBalance) {
        this.balance = initialBalance;
        Bank.incrementTotalAccounts();
    }

    // Deposit method for CheckingAccount
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited Rs." + amount + " in Checking Account.");
    }

    // Withdraw method for CheckingAccount with overdraft limit
    @Override
    public void withdraw(double amount) {
        if (amount <= balance + OVERDRAFT_LIMIT) {
            balance -= amount;
            System.out.println("Withdrew Rs." + amount + " from Checking Account.");
        } else {
            System.out.println("Exceeded overdraft limit in Checking Account.");
        }
    }

    // Get balance for CheckingAccount
    @Override
    public double getBalance() {
        return balance;
    }
}
