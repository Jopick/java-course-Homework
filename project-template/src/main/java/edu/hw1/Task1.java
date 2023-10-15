package edu.hw1;


public class Task1 {

    private String args;

    public Task1(String args) {

        this.args = args;
    }

    public static final int SECONDS_MINETS = 60;

    public int time(String args) {
        this.args = args;
        String minets = "";
        String seconds = "";
        int ch = 0;
        String lol = "";

        for (int i = 0; i < args.length(); i++) {

            if (args.charAt(i) == ':') {
                ch = 1;
            } else if (ch == 0) {
                minets += args.charAt(i);
            } else {
                seconds += args.charAt(i);
            }
        }
        int minet = Integer.parseInt(minets.trim());
        int second = Integer.parseInt(seconds.trim());
        // именно здесь String преобразуется в int
        if (second < SECONDS_MINETS) {
            return (minet * SECONDS_MINETS + second);
        } else {
            return (-1);
        }
        // выведем на экран значение после конвертации
    }
}
