package com.example;

public class CheckingAccount extends Account {
    public float overdraft;

    public CheckingAccount(float balance, float annualRate) {
        super(balance, annualRate);
        overdraft = 0;
    }

    @Override
    public void deposit(float amount) {
        super.deposit(amount);
        if (overdraft > 0) {
            if (amount >= overdraft) {
                overdraft = 0;
            } else {
                overdraft -= amount;
            }
        }
    }

    @Override
    public void withdraw(float amount) {
        if (amount <= balance + overdraft) {
            if (amount <= balance) {
                balance -= amount;
            } else {
                overdraft -= (amount - balance);
                balance = 0;
            }
            withdrawals++;
        }
    }

    @Override
    public void generateMonthlyStatement() {
        super.generateMonthlyStatement();
    }

    @Override
    public String printStatement() {
        return "Balance: " + balance + ", Monthly Fee: " + monthlyFee + ", Transactions: " + (deposits + withdrawals) + ", Overdraft: " + overdraft;
    }
}