package edu.hw1;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1_Test {
    @Test
    @DisplayName("Минуты и секунды")
    void test_time() {
        Task1 chek;
        chek = new Task1();
        assertEquals(60, chek.time("01:00"));
        assertEquals(836, chek.time("13:56"));
        assertEquals(-1, chek.time("10:60"));
        assertEquals(599999, chek.time("9999:59"));
        assertEquals(0, chek.time("00:00"));
        assertEquals(-1, chek.time("0:60"));
        assertEquals(606, chek.time("10:06"));
        assertEquals(606, chek.time("10:6"));

    }
}
