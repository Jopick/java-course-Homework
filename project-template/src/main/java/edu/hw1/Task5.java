package edu.hw1;

public class Task5 {

    private Integer palindrom;

    public Task5(Integer palindrom) {
        this.palindrom = palindrom;
    }

    public static final int MAX_SIZE = 9;

    public boolean isPalindromeDescendant(Integer palindrom) {
        this.palindrom = palindrom;
        String y = String.valueOf(palindrom);

        String ans = String.valueOf(palindrom);

        int lenn = ans.length() / 2;

        StringBuilder sb = new StringBuilder(ans.substring(lenn, ans.length()));
        if (ans.substring(0, lenn).equals(sb.reverse().toString())) {
            return true;
        } else {
            return (proverochka(palindrom));
        }

    }

    public static final int INDEX_CHAR = 48;

    public boolean proverochka(Integer x) {

        if (x > MAX_SIZE && (String.valueOf(x)).length() % 2 == 0) {
            String y = String.valueOf(x);

            String ans = "";

            for (int i = 0; i < y.length(); i += 2) {
                ans += String.valueOf(y.charAt(i) + y.charAt(i + 1) - 2 * INDEX_CHAR);
            }

            int lenn = ans.length() / 2;

            StringBuilder sb = new StringBuilder(ans.substring(lenn, ans.length()));
            if (ans.substring(0, lenn).equals(sb.reverse().toString())) {
                return true;
            } else {

                return (proverochka(Integer.valueOf(ans)));
            }
        } else {
            String y = String.valueOf(x);

            String ans = String.valueOf(x);

            int lenn = ans.length() / 2;

            StringBuilder sb = new StringBuilder(ans.substring(lenn, ans.length()));
            if (ans.substring(0, lenn).equals(sb.reverse().toString())) {
                return true;
            } else {
                return (false);
            }
        }
    }
}
