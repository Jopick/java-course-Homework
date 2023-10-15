package edu.hw1;

public class Task4 {

    private String swap;

    public Task4(String swap) {
        this.swap = swap;
    }

    public String fixString(String swap) {
        this.swap = swap;
        String answer = "";
        for (int i = 0; i < swap.length() - 1; i += 2) {
            answer += swap.charAt(i + 1);
            answer += swap.charAt(i);
        }
        if (swap.length() % 2 == 1) {
            answer += swap.charAt(swap.length() - 1);
        }
        return answer;
    }
}
