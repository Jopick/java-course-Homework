package edu.hw1;

public class Task4 {

    public static final int INDEX_CHAR = 48;

    public String fixString(String swap) {

        StringBuilder answer = new StringBuilder("");
        for (int i = 0; i < swap.length() - 1; i += 2) {
            answer.append(swap.charAt(i + 1));
            answer.append(swap.charAt(i));
        }
        if (swap.length() % 2 == 1) {
            answer.append(swap.charAt(swap.length() - 1));
        }
        return answer.toString();
    }
}
