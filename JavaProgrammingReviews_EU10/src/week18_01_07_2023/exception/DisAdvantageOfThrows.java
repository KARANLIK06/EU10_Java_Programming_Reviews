package week18_01_07_2023.exception;

public class DisAdvantageOfThrows {
    public static void main(String[] args) throws InterruptedException {
        //ma:c command + alt + T
        //windows: ctrl+alt+T

        waitFor(3);
        sleep(4);
    }

    private static void sleep(int seconds) {
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {


        }
    }

    public static void methodB(){
        sleep(4);
    }

    private static void waitFor(int second) throws InterruptedException {
        sleep(second*1000);
    }
    public static void methodA()throws InterruptedException{
        waitFor(4);
    }

}
