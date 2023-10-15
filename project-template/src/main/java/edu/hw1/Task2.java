package edu.hw1;

public class Task2 {
    private int args;

    //public countDigits(int args) {
    public Task2(int args) {
        this.args = args;
    }

    public static final int MINN = 9;

    public static final int NEXT_NUMBER = 10;

    public int countDigits(int args) {
        this.args = args;
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
