package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    public Account account;

    @BeforeEach
    void setUp() {
        account = new Account(10000, 12);
    }

    @Test
    void testDeposit() {
        account.deposit(500);
        assertEquals(10500, account.balance);
    }

    @Test
    void testWithdraw() {
        account.withdraw(2000);
        assertEquals(8000, account.balance);
    }
}