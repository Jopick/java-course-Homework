package edu.hw1;

import java.util.Arrays;

class Task6 {

    private Integer kaprekar;


    public static final int MASSIV_SIZE = 4;

    public static final int SIZE_10 = 10;

    public static final int ANSWER = 6174;

    public Task6(Integer kaprekar) {
        this.kaprekar = kaprekar;
    }


    public int swap(Integer x) {
        this.kaprekar = kaprekar;
        Integer x1 = x;
        int[] massiv = new int[MASSIV_SIZE];
        for (int i = 0; i < MASSIV_SIZE; i++) {
            massiv[i] = x1 % SIZE_10;
            x1 /= SIZE_10;
        }
        Arrays.sort(massiv);

        x1 = massiv[MASSIV_SIZE - 1] * SIZE_10 * SIZE_10 * SIZE_10 + massiv[2] * SIZE_10 * SIZE_10 + massiv[1] * SIZE_10
            + massiv[0] - massiv[MASSIV_SIZE - 1] - massiv[2] * SIZE_10
            - massiv[1] * SIZE_10 * SIZE_10 - massiv[0] * SIZE_10 * SIZE_10 * SIZE_10;
        if (x1.equals(ANSWER)) {
            return 0;
        } else {
            return (1 + swap(x1));
        }
    }


    public int countK(Integer kaprekar) {

        this.kaprekar = kaprekar;

        if (kaprekar.equals(ANSWER)) {
            return 0;
        } else {
            return (1 + swap(kaprekar));
        }
    }

}
