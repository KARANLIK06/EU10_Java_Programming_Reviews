package week18_01_07_2023.exception;

import week18_01_07_2023.exception.CustomArithmeticException;

public class CustomExceptionExample {


    public static void main(String[] args) {
        //ArithmeticException

        try {
            System.out.println(3/0);
        } catch (Exception e) {
            //throw new CustomArithmeticException();
            throw new CustomArithmeticException("you have an error");
        }

    }
}
