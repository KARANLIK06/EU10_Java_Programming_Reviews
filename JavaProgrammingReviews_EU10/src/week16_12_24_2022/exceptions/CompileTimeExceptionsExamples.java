package week16_12_24_2022.exceptions;

public class CompileTimeExceptionsExamples {
    public static void main(String[] args) {
        System.out.println("Adam");
        waitFor(3);
        System.out.println("Ersin");
    }

    private static void waitFor(int second) {
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {

        }
    }
}
