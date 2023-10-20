package edu.hw1;

public class Task7 {

    public static final int LAST_ELEMENT = 10;

    public Integer rotateRight(Integer m, Integer shift) {

        String number = Integer.toBinaryString(m);

        int lenn = number.length();

        Integer n = Integer.valueOf(number);

        int[] sdvig = new int[lenn];

        for (int i = lenn - 1; i > -1; i--) {
            sdvig[i] = n % LAST_ELEMENT;
            n /= LAST_ELEMENT;
        }

        for (int i = 0; i < shift; i++) {
            int last = sdvig[lenn - 1];

            for (int j = lenn - 1; j > 0; j--) {
                sdvig[j] = sdvig[j - 1];
            }
            sdvig[0] = last;
        }
        String ans = "";
        for (int i = 0; i < lenn; i++) {
            ans += sdvig[i];
        }
        return (Integer.parseInt(ans, 2));
    }

    public Integer rotateLeft(Integer m, Integer shift) {

        String number = Integer.toBinaryString(m);

        Integer n = Integer.valueOf(number);

        int lenn = number.length();

        int[] sdvig = new int[lenn];

        for (int i = lenn - 1; i > -1; i--) {
            sdvig[i] = n % LAST_ELEMENT;
            n /= LAST_ELEMENT;
        }

        for (int i = 0; i < shift; i++) {
            int last = sdvig[0];

            for (int j = 0; j < lenn - 1; j++) {
                sdvig[j] = sdvig[j + 1];
            }
            sdvig[lenn - 1] = last;
        }
        String ans = "";
        for (int i = 0; i < lenn; i++) {
            ans += sdvig[i];
        }
        return (Integer.parseInt(ans, 2));
    }
}
