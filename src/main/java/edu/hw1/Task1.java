package edu.hw1;

public class Task1 {

    public static final int SECONDS_MINETS = 60;

    public int time(String args) {

        StringBuilder minets = new StringBuilder("");
        StringBuilder seconds = new StringBuilder("");
        int ch = 0;

        for (int i = 0; i < args.length(); i++) {

            if (args.charAt(i) == ':') {
                ch = 1;
            } else if (ch == 0) {
                minets.append(args.charAt(i));
            } else {
                seconds.append(args.charAt(i));
            }
        }
        int minet = Integer.parseInt(String.valueOf(minets));
        int second = Integer.parseInt(String.valueOf(seconds));
        // именно здесь String преобразуется в int
        if (second < SECONDS_MINETS) {
            return (minet * SECONDS_MINETS + second);
        } else {
            return (-1);
        }
        // выведем на экран значение после конвертации
    }
}
