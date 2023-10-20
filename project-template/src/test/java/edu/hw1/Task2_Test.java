package edu.hw1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class Task2_Test {

    @Test
    @DisplayName("Минуты и секунды")
    void test_countDigits() {
        Task2 lenn;
        lenn = new Task2();
        assertEquals(4, lenn.countDigits(4666));
        //rofle = new Task1 (0);
        assertEquals(3, lenn.countDigits(544));
        assertEquals(1, lenn.countDigits(0));
        assertEquals(8, lenn.countDigits(10000000));
        assertEquals(3, lenn.countDigits(123));
    }
}
