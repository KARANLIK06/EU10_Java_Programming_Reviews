package week09_11_05_2022;

public class Task3_ArmstrongNumber {
    public static void main(String[] args) {

        System.out.println(armstrong(370));

    }

    public static boolean armstrong(int number) {

        int temp = 0,
                result = 0,
                copy = number;

        for (int i = 0; i < 3; i++) { // 3 represents the step number

            temp = number % 10; // this gets the last step of the number

            result += temp * temp * temp; // this adds the third power of the number to a variable

            number /= 10; // this removes the last step

        }

        return copy == result;

    }

}
/*
Task 3 :   Write a method that can check if a number is Armstrong number

                Note: if I have a 3-digit number then each of the digits is raised to the power of three and added to obtain a number. If the number obtained equals the original number then, we call that armstrong number.

                Armstrong numbers are     === 153 370 371 407 === for 3 digits
 */