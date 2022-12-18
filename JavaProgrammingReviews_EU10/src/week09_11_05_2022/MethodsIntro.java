package week09_11_05_2022;

import static java.lang.Integer.sum;

public class MethodsIntro {
    public static void main(String[] args) {

printHello5Times();

            //we want to add two number
        int result = sum(5,6);

        multiplyWith2AndPrint(result);

        System.out.println(sum(20,30));



    }

    public static void multiplyWith2AndPrint(int result) {
        System.out.println(result*2);
    }

    private static int sum(int num1,int num2) {
        return num1+num2;
    }


    public static void printHello5Times(){
        for (int i = 0; i <5 ; i++) {
            System.out.println("Hello");

        }
    }
}
