package edu.project1;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Map;

public class Main_Consol {
    public static final String Question = "Какая буква ещё не открыта?";

    public static final Integer Maximum_Mistake = 9;

    public static String Final_Phrase = "Ой, ой. Зря сдались, вы почти угадали слово";

    public static String Eror_Input = "Нужно ввести одну букву, а не слово";

    public static String Repeat_Word = "Вы уже вводили эту буку";

    public static String Wrong_Answer = "Missed, mistake";

    public static String Game_Over = "Ахаха слабо, слабо, проиграл.";

    public static String Game_Win = "Молодец, ты победил!";

    public static String More_Try = "Дать тебе ёще 5 попыток?";


    public static void main(String[] args) throws Exception {


        Map<String, String> dictionary = new HashMap<String, String>();

        String HiddenWord;
        HiddenWord = Generate_Words.GenerateRandomWord();

        int quantity_mistake = 0;

        Scanner scanner = new Scanner(System.in);

       // String[] Answe = new String[HiddenWord.length()];

        for (int i = 0; i < HiddenWord.length(); i++) {
            dictionary.put(String.valueOf(HiddenWord.charAt(i)), "*");
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

                    if (dictionary.get(inputWord).equals("*")) {
                        win += find.count_element(inputWord, HiddenWord);

                        System.out.println("Hit!");
                    } else {
                        System.out.println(Repeat_Word);
                    }

                    if (dictionary.containsKey(inputWord)) {
                        dictionary.put(inputWord, inputWord);
                    }


                    if (dictionary.containsKey(inputWord)) {
                        dictionary.put(inputWord, inputWord);
                    }

                } else {
                    quantity_mistake++;
                    System.out.println(Wrong_Answer + " " + quantity_mistake + " of " + Maximum_Mistake);
                }

                for (int i = 0; i < HiddenWord.length(); i++) {
                    System.out.print(dictionary.get(String.valueOf(HiddenWord.charAt(i))));

                }

                System.out.println();

                if (win == HiddenWord.length()) {
                    System.out.println(Game_Win);
                    System.exit(0);

                }
            }
            if (quantity_mistake == Maximum_Mistake) {

                System.out.println(More_Try);
                String input = scanner.nextLine();

                if (input.equals("да")) {
                    quantity_mistake -= 5;
                }
            }

        }
        if (Maximum_Mistake == quantity_mistake) {
            System.out.println(Game_Over);

        }
    }

}
