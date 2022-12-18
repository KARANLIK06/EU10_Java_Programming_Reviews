package week09_11_05_2022;

public class Task6_swapFirstAndLastLetter {
    public static void main(String[] args) {
        /*
        Task 6 : Write a method that return a new string where the first and last chars have been exchanged.

             frontBack("code") → "eodc"
             frontBack("a") → "a"
             frontBack("ab") → "ba"
         */
        System.out.println(frontBack("group7"));
    }

    public static String frontBack(String word) {
        if (word.length()<2) {
            return word;
        }else {
            return (word.substring(word.length() - 1)
                    + word.substring(1, word.length() - 1)
                    + word.substring(0, 1));
        }
    }
}
