package edu.hw1;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4_Test {

    @Test
    @DisplayName("Исправление строки")
    void test_fixString() {
        Task4 fix;
        fix = new Task4();
        assertEquals("214365", fix.fixString("123456"));
        assertEquals("This is a mixed up string.", fix.fixString("hTsii  s aimex dpus rtni.g"));
        assertEquals("abcde", fix.fixString("badce"));
        assertEquals("21435", fix.fixString("12345"));
    }
}
