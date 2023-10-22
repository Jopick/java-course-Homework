package edu.project1;

public class find {

    public static int count_element(String element, String str){
        int count = 0;

        for(int j = 0; j < str.length(); j ++){

            if (str.charAt(j) == element.charAt(0) ){

                count ++;
            }
        }
        return count;
    }
}