package week09_11_05_2022;

public class Task7_in1020 {
    public static void main(String[] args) {
        /*
         Task 7 : Write a method that given 2 int values, return true if either of them is in the range 10..20 inclusive.
            multiple parameter  --- takes two integers
            return type --- boolean

             in1020(12, 99) → true
             in1020(21, 12) → true
             in1020(8, 99) → false
         */
        boolean result = in1020(8, 99);
        System.out.println(result);
    }

    public static boolean in1020(int number1, int number2) {
        boolean result;
       return  (number1 >= 10 && number1 <= 20) || (number2 >= 10 && number2 <= 20) ? true:false;

        }
    }
