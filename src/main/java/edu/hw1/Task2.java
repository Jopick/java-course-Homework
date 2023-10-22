package edu.hw1;

public class Task2 {

    public static final int MINN = 9;

    public static final int NEXT_NUMBER = 10;

    public int countDigits(int args) {

        int r = args;
        int ch = 0;

        while (r > MINN) {
            ch += 1;
            r /= NEXT_NUMBER;

        }
        ch += 1;
        return ch;
    }
}
