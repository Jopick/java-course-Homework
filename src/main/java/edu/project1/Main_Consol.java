package edu.project1;

import java.util.Scanner;
import java.util.Arrays;

public class Main_Consol {
    public static final String Question = "Какая буква ещё не открыта?";

    public static final Integer Maximum_Mistake = 9;

    public static String Final_Phrase = "Ой, ой. Зря сдались, вы почти угадали слово";

    public static String Eror_Input = "Нужно ввести одну букву, а не слово";

    public static String Wrong_Answer = "Missed, mistake";

    public static String Game_Over = "Молодец ты победил";

    public static void main(String[] args) throws Exception {

        //Generate_Words Hidden;
        //Hidden = new Generate_Words();

        String HiddenWord;
        HiddenWord = Generate_Words.GenerateRandomWord();
        //System.out.println(HiddenWord.charAt(0));

        int quantity_mistake = 0;

        Scanner scanner = new Scanner(System.in);

        String[] Answer = new String[HiddenWord.length()];

        for (int i = 0; i < HiddenWord.length(); i++) {
            Answer[i] = "*";
        }

        int win = 0;

        while (Maximum_Mistake > quantity_mistake) {

            System.out.println(Question);

            String inputWord = scanner.nextLine();

            if (inputWord.equals("stop")) {
                System.err.println(Final_Phrase);
                System.exit(1);

            } else if (inputWord.length() != 1) {
                System.out.println(Eror_Input);

            } else {
                if (HiddenWord.contains(inputWord)) {
                    for (int i = 0; i < HiddenWord.length(); i++) {
                        if (HiddenWord.charAt(i) == inputWord.charAt(0)) {

                            if (!Answer[i].equals(String.valueOf(HiddenWord.charAt(i)))) {
                                win++;

                                Answer[i] = String.valueOf(HiddenWord.charAt(i));
                            }
                        }
                    }
                    System.out.println("Hit!");
                } else {
                    quantity_mistake++;
                    System.out.println(Wrong_Answer + " " + quantity_mistake + " of " + Maximum_Mistake);
                }

                for (int i = 0; i < Answer.length; i++) {
                    System.out.print(Answer[i]);
                }

                System.out.println();

                if (win == HiddenWord.length()) {
                    System.out.println(Game_Over);
                    System.exit(0);

                }
            }

        }
    }
}
