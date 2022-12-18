package week05_10_08_2022;

public class ThreeCopyOfLastTwoChar {
    public static void main(String[] args) {
        /*
        Task 2: Create a logic print a new string made of 3 copies of the last 2 chars of the original string.

      Hint: The string length will be at least 2.
         */


        String word="Hello";

       // System.out.println((""+word.charAt(3)+word.charAt(4)).repeat(3));
        System.out.println((""+word.charAt(word.length()-2)+word.charAt(word.length()-1)).repeat(3));


    }
}
