package edu.hw1;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task7_Test {

    @Test
    @DisplayName("kkfkfk")
    void test_rotate() {
        Task7 rotate;
        rotate = new Task7(8, 1);
        assertEquals(4, rotate.rotateRight(8, 1));
        assertEquals(1, rotate.rotateLeft(16, 1));
        assertEquals(6, rotate.rotateLeft(17, 2));
    }
}
