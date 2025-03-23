package com.tns.ifet.bankingtransactionsystem;

public class Bank {
	private static int totalAccounts = 0;

    // Static method to get total accounts
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    // Method to increment totalAccounts when a new account is created
    public static void incrementTotalAccounts() {
        totalAccounts++;
    }
}
