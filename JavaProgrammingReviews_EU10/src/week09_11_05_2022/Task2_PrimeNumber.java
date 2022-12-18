package week09_11_05_2022;

public class Task2_PrimeNumber {
    public static void main(String[] args) {


       boolean result = isPrime(50);
        System.out.println(result);



    }

    public static boolean isPrime(int number) {
        boolean isPrimeNumber=true;

        if (number<2){
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number%i==0){
                isPrimeNumber=false;
                break;
            }

        }
        return isPrimeNumber;
    }


}
/*
Task 2 :   Write a method that can check if a number is prime or not

                Note : Prime numbers are special numbers, greater than 1, that have exactly two factors, themselves and 1
 */