package week02_09_17_2022;

public class SumTwoNumber {
    public static void main(String[] args) {

        /*
        1. Create a class named SumTwoNumber, write a Java program to print the sum of two numbers.
         */

        int firstNumber = 10;

        int secondNumber = 20;

        int sum = firstNumber + secondNumber;

        System.out.println("sum = " + sum);
        System.out.println(firstNumber + "+" + secondNumber + "=" + sum);
        System.out.println(firstNumber + "+" + secondNumber + "=" + firstNumber + secondNumber);
        System.out.println(firstNumber + "+" + secondNumber + "=" + (firstNumber + secondNumber));

        int a = 30;
        String s = "30";
        System.out.println(s + a);

        String res = s + a;
        //s+a; Automatically assign for window ALT+ENTER+ENTER



    }
}
