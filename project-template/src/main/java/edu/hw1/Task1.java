package edu.hw1;
public class Task1 {
    public static int countDigits(int args) {
        int ch = 0;

        while (args > 9) {
            ch += 1;
            args /= 10;

        }
        ch += 1;
        return ch;
    }
}
