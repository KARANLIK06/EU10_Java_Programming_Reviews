package week05_10_08_2022;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /*
        Task 4: Given a string, if the string begins with "red" or "blue" print that color string, otherwise print the empty string.

     *                 input :"redxx" → "red"
     *                 input :"xxred" → ""
     *                 input :"blueTimes" → "blue"
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a word");
        String sentence = input.next();


        if (sentence.startsWith("red")) {
            System.out.println("red");
        } else if (sentence.startsWith("blue")) {
            System.out.println("blue");
        } else {
            System.out.println("");
        }
        input.close();
    }
}

