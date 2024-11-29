package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CheckingaccountTest {

    private CheckingAccount checkingAccount;

    @BeforeEach
    void setUp() {
        checkingAccount = new CheckingAccount(2000, 12);
    }

    @Test
    void testDeposit() {
        checkingAccount.deposit(1000);
        assertEquals(3000, checkingAccount.balance);
    }

    @Test
    void testDepositWithOverdraft() {
        checkingAccount.deposit(600);  
        assertEquals(0, checkingAccount.overdraft);
    }
}