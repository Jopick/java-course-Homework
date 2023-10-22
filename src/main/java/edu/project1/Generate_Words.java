package edu.project1;

import java.util.Random;

public class Generate_Words{

    public static String GenerateRandomWord(){
        String [] dictionary = new String[] {"рюкзак"};

        Random random = new Random();
        int Word_for_Gallows = random.nextInt(1);
        String ans = dictionary[Word_for_Gallows];
        return ans;
    }
}
