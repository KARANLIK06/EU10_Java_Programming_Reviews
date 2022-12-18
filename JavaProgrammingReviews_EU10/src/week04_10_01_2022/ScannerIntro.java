package week04_10_01_2022;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter one integer number");
        int intvalue = scan.nextInt();
        System.out.println("intvalue = " + intvalue);

        System.out.println("Please enter one double number");
        double doubleValue=scan.nextDouble();
        System.out.println("doubleValue = " + doubleValue);

        scan.close();
    }
}
