package week05_10_08_2022;

import java.util.Scanner;

public class GetFirst2UpperCase {
    public static void main(String[] args) {
        /*
        Task 1: Given a string, print the string made of its first two chars, so the String "Hello" yields “HE".
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a word");
        String word=scan.next();
        word=word.toUpperCase();

        System.out.println(""+word.charAt(0)+word.charAt(1));
        scan.close();
    }
}
