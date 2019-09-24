package com.company;

import java.util.Scanner;

public class Utils {

    private static Scanner scanner = new Scanner(System.in);

    public static void display(String str){
        System.out.println(str);
    }

    public static String ask(String question){
        display(question);
        return scanner.nextLine();
    }

}
