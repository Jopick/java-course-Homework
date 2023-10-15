package edu.hw1;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3_Test {
    @Test
    @DisplayName("Минуты и секунды")
    void test_isNestable() {
        Task3 massiv = new Task3(new int[] {1, 2, 3, 4}, new int[] {0, 6});
        assertEquals(true, massiv.isNestable(new int[] {1, 2, 3, 4}, new int[] {0, 6}));
        assertEquals(true, massiv.isNestable(new int[] {3, 1}, new int[] {4, 0}));
        assertEquals(false, massiv.isNestable(new int[] {9, 9, 8}, new int[] {8, 9}));
        assertEquals(false, massiv.isNestable(new int[] {1, 2, 3, 4}, new int[] {2, 3}));
        assertEquals(false, massiv.isNestable(new int[] {1, 4}, new int[] {4, 1}));
        assertEquals(false, massiv.isNestable(new int[] {1, 2, 3}, new int[] {5, 6}));
        assertEquals(false, massiv.isNestable(new int[] {1, 5}, new int[] {1, 6}));

    }
}
