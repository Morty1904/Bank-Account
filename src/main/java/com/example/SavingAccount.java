package com.example;

public class SavingAccount extends Account {
    public boolean isActive;

    public SavingAccount(float balance, float annualRate) {
        super(balance, annualRate);
        updateStatus();
    }

    private void updateStatus() {
        isActive = balance >= 10000;
    }

    @Override
    public void deposit(float amount) {
        if (isActive) {
            super.deposit(amount);
        }
    }

    @Override
    public void withdraw(float amount) {
        if (isActive) {
            super.withdraw(amount);
        }
    }

    @Override
    public void generateMonthlyStatement() {
        super.generateMonthlyStatement();
        if (withdrawals > 4) {
            monthlyFee += 1000 * (withdrawals - 4);
        }
        updateStatus();
    }

    @Override
    public String printStatement() {
        return "Balance: " + balance + ", Monthly Fee: " + monthlyFee + ", Transactions: " + (deposits + withdrawals) + ", Active: " + isActive;
    }
}