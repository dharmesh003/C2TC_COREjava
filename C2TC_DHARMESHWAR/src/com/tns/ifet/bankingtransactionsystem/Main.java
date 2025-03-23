package com.tns.ifet.bankingtransactionsystem;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Creating accounts
        SavingsAccount savings = new SavingsAccount(500.00);
        CheckingAccount checking = new CheckingAccount(300.00);

        // Display total accounts created
        System.out.println("Total Accounts: " + Bank.getTotalAccounts());

        // Performing transactions
        Transaction transaction = new Transaction();
        transaction.performTransaction(savings, 100.00, "deposit");
        transaction.performTransaction(checking, 50.00, "withdraw");
    }
	}


