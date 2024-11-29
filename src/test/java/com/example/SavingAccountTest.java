package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SavingAccountTest {

    private SavingAccount savingAccount;

    @BeforeEach
    void setUp() {
        savingAccount = new SavingAccount(15000, 12);
    }

    @Test
    void testDeposit() {
        savingAccount.deposit(1000);
        assertEquals(16000, savingAccount.balance);
    }

    @Test
    void testWithdraw() {
        savingAccount.withdraw(500);
        assertEquals(14500, savingAccount.balance);
    }

    @Test
    void testActiveAccount() {
        savingAccount.deposit(5000);
        assertTrue(savingAccount.isActive);
    }
}