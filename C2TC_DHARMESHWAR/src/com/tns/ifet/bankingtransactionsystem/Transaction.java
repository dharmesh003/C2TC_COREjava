package com.tns.ifet.bankingtransactionsystem;

public final class Transaction {
	private final double transactionFee = 2.50;

    // Final method to perform a transaction
    public final void performTransaction(Account account, double amount, String type) {
        System.out.println("Transaction initiated: " + type);
        if (type.equals("deposit")) {
            account.deposit(amount);
        } else if (type.equals("withdraw")) {
            account.withdraw(amount + transactionFee);
        }
        account.showBalance();
        System.out.println("Transaction Fee: Rs." + transactionFee);
        System.out.println("Transaction completed.");
    }
}
