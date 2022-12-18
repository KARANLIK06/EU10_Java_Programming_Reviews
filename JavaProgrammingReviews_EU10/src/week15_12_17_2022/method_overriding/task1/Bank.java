package week15_12_17_2022.method_overriding.task1;

public class Bank {

    private int capital = 10000;

    public int getCapital() {
        return capital;
    }

    // How we can get the class name?
    //The answer is getClass().getSimpleName()

    public void calculateTheInterest() {
        System.out.println("Interest of the " + getClass().getSimpleName());
    }
}