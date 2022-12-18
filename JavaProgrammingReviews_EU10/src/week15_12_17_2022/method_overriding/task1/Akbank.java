package week15_12_17_2022.method_overriding.task1;

public class Akbank extends Bank{

    @Override
    public void calculateTheInterest() {
        super.calculateTheInterest();
        System.out.println(getCapital()*7/100);
    }
}
