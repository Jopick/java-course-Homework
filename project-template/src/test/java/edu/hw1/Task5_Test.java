package edu.hw1;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task5_Test {
    @Test
    @DisplayName("палиндром")
    void test_isPalindromeDescendant() {
        Task5 palindrom;
        palindrom = new Task5(11211230);
        assertEquals(true, palindrom.isPalindromeDescendant(11211230));
        assertEquals(true, palindrom.isPalindromeDescendant(13001120));
        assertEquals(true, palindrom.isPalindromeDescendant(23336014));
        assertEquals(true, palindrom.isPalindromeDescendant(11));
        assertEquals(true, palindrom.isPalindromeDescendant(123321));
        assertEquals(false, palindrom.isPalindromeDescendant(123322));
        assertEquals(false, palindrom.isPalindromeDescendant(11211231));
        //assertEquals(true, palindrom.isPalindromeDescendant(1223542312));
    }
}
