package week10_11_12_2022;

import java.util.ArrayList;

public class WrapperIntro {
    public static void main(String[] args) {
        int a=2;
        Integer b=122;
        Integer c=new Integer(12);
        //  ArrayList<int> ar = new ArrayList<int>();   // we can not put primitive
        //  ArrayList<Integer> arrayList = new ArrayList<>();

        String number1="100";
        String number2="200";
        String result=number1+number2;
        System.out.println(result);

        int result1=Integer.parseInt(number1);
        int result2=Integer.parseInt(number2);
        System.out.println(result1+result2);

    }
}
