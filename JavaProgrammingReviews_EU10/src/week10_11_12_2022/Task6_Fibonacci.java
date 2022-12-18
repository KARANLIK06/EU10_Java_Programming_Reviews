package week10_11_12_2022;

import java.util.Scanner;

public class Task6_Fibonacci {
    /*
Task 6 :  Fibonacci
				Create a method that will give you the Fibonacci numbers up to the x value. Where x is the given parameter.
				Fibonacci is a sequence of number starting from 0, 1 where the following numbers are the sum of the previous 2 numbers
				Note: Fibonacci numbers are read as index values, so the 0th Fibonacci is 0, 1st value is 1, 2nd value is 1, etc
				    Ex:
				        Input:
				            8
				        Output:
				            0, 1, 1, 2, 3, 5, 8, 13, 21
				            1- Create one method and only print the numbers
				            2- You will return the numbers
				            3- Yuo will put that numbers into the array then you will return it
				         */


    public static void main(String[] args) {
        fibonacci(8);


    }

    public static void fibonacci(int index) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir Sayi Giriniz : ");
        int input = scan.nextInt();

        int sayi1 = 1;
        int sayi2 = 1;


        System.out.println(input + " Sayisinin Fibonacci Serisi : ");

        for (int i = 1; i <= input; i++) {
            System.out.print(sayi1 + ", ");
            int toplam = sayi1 + sayi2;
            sayi1 = sayi2;
            sayi2 = toplam;

        }
        scan.close();

    }
}


