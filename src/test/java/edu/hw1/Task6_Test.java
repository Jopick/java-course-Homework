package edu.hw1;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task6_Test {
    @Test
    @DisplayName("countK")
    void test_countK() {
        Task6 chislo;
        chislo = new Task6();
        assertEquals(5, chislo.countK(6621));
        assertEquals(4, chislo.countK(6554));
        assertEquals(3, chislo.countK(1234));
        assertEquals(0, chislo.countK(6174));
    }
}
