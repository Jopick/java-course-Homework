package edu.hw1;

import java.util.Arrays;

class Task6 {

    public static final int MASSIV_SIZE = 4;

    public static final int TEN = 10;

    public static final int ANSWER = 6174;

    public int swap(Integer x) {

        Integer x1 = x;
        int[] massiv = new int[MASSIV_SIZE];
        for (int i = 0; i < MASSIV_SIZE; i++) {
            massiv[i] = x1 % TEN;
            x1 /= TEN;
        }
        Arrays.sort(massiv);
        // Сумма элементов
        Integer first = 0;

        //Отрицательная сумма

        Integer second = 0;

        first = massiv[MASSIV_SIZE - 1] * TEN * TEN * TEN + massiv[2] * TEN * TEN + massiv[1] * TEN + massiv[0];

        second = massiv[MASSIV_SIZE - 1] + massiv[2] * TEN + massiv[1] * TEN * TEN + massiv[0] * TEN * TEN * TEN;

        //Разность
        x1 = first - second;

        return countK(x1);

    }

    public int countK(Integer kaprekar) {

        if (kaprekar.equals(ANSWER)) {
            return 0;
        } else {
            return (1 + swap(kaprekar));
        }
    }

}
