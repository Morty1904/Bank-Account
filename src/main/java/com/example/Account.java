package com.example;

public class Account {
    protected float balance;
    protected int deposits = 0;
    protected int withdrawals = 0;
    protected float annualRate;
    protected float monthlyFee = 0;

    public Account(float balance, float annualRate) {
        this.balance = balance;
        this.annualRate = annualRate;
    }

    public void deposit(float amount) {
        if (amount > 0) {
            this.balance += amount;
            deposits++;
        }
    }

    public void withdraw(float amount) {
        if (amount <= balance) {
            this.balance -= amount;
            withdrawals++;
        }
    }

    public void calculateMonthlyInterest() {
        balance += (balance * annualRate / 100) / 12;
    }

    public void generateMonthlyStatement() {
        calculateMonthlyInterest();
        balance -= monthlyFee;
    }

    public String printStatement() {
        return "Balance: " + balance + ", Monthly Fee: " + monthlyFee + ", Deposits: " + deposits + ", Withdrawals: " + withdrawals;
    }
}