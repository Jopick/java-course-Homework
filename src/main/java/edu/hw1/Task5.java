package edu.hw1;

public class Task5 {

    public static final int MAX_SIZE = 9;

    public boolean isPalindromeDescendant(Integer palindrom) {

        String ans = String.valueOf(palindrom);

        int half = ans.length() / 2;

        StringBuilder sb = new StringBuilder(ans.substring(half, ans.length()));
        if (ans.substring(0, half).equals(sb.reverse().toString())) {
            return true;
        } else {
            return (proverochka(palindrom));
        }

    }

    public static final int INDEX_CHAR = 48;

    private boolean proverochka(Integer x) {

        if (x > MAX_SIZE && (String.valueOf(x)).length() % 2 == 0) {
            String palindrom = String.valueOf(x);

            String ans = "";

            for (int i = 0; i < palindrom.length(); i += 2) {
                ans += String.valueOf(palindrom.charAt(i) + palindrom.charAt(i + 1) - 2 * INDEX_CHAR);
            }

            int half = ans.length() / 2;

            StringBuilder sb = new StringBuilder(ans.substring(half, ans.length()));
            if (ans.substring(0, half).equals(sb.reverse().toString())) {
                return true;
            } else {

                return (proverochka(Integer.valueOf(ans)));
            }
        } else {

            String ans = String.valueOf(x);

            int half = ans.length() / 2;

            StringBuilder sb = new StringBuilder(ans.substring(half, ans.length()));
            if (ans.substring(0, half).equals(sb.reverse().toString())) {
                return true;
            } else {
                return (false);
            }
        }
    }
}
