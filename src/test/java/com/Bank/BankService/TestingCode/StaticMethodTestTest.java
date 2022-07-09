package com.Bank.BankService.TestingCode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StaticMethodTestTest {
    @Test
    void testSum() {
        int expected_val = 300;// failed test case
        //    int expected_val = 35;/// pass test case
        // we can test static method, by calling static method with help of class in which it's declared
        int actual_val = StaticMethodTest.Sum(15,20);
        assertEquals(expected_val, actual_val);
    }
}
