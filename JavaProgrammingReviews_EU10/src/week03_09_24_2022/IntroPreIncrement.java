package week03_09_24_2022;

public class IntroPreIncrement {
    public static void main(String[] args) {

        int x=10;
        int number = x++ + 100;
        System.out.println("number = " + number);

        int number2 = ++x + 100;
        System.out.println("number2 = " + number2);
    }
}
