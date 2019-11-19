package io;

import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {

    private static Scanner userInput = new Scanner(System.in);
    private static PrintStream output = System.out;

    public static void printWelcome(){
        print("" +
                "**************************************************\n" +
                "***           Welcome and Bienvenue            ***\n" +
                "***                    to                      ***\n" +
                "***          ZipCo Inventory Manager           ***\n" +
                "**************************************************");

        prinln("");
        prinln("");
    }

    public static void print (String val, Object...args){
        output.format(val,args);
    }

    public static void prinln (String output, Object...args){
         print(output + "\n",args);
    }

    public static Integer getIntegerInput(String prompt){
        Integer userSelection = 0;

        prinln(prompt);
        try {
            userSelection = userInput.nextInt();
            return userSelection;
        } catch (InputMismatchException e){
            prinln("[ %s ] is an invalid value!");
            prinln("Try again!");
            return getIntegerInput(prompt);
        }
    }

}
