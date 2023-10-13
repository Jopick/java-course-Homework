package edu.hw1;

import java.util.Scanner;
import java.security.MessageDigest;
// ТУТ Я ПРОСТО ПРОВЕРЯЮ ВСЯКИЕ ФИЧИ И БАЛУЮСЬ ЭТО НЕ ДЗ!!!!!!!
public class Task_tochno1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        String substr1 = name.substring(5,6);
        System.out.println( "A" + ('\t' + '\u0003') );

        System.out.println( "A" + 12 );

        System.out.println( 'A' + "12" );

        System.out.println( 'А' + '1' + "2" );
        in.close();
    }
}

