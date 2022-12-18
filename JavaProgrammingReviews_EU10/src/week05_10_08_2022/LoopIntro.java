package week05_10_08_2022;

public class LoopIntro {
    public static void main(String[] args) {
        //if we repeat one action more than one we can use loop in here we will learn for loop
        String str = "0123456";
        for (int index = 0; index < str.length(); index++) {
            System.out.print(str.charAt(index));
        }
        for (int i = 0; i <= 100; i += 2) {
            System.out.print(i);

        }
    }
}
