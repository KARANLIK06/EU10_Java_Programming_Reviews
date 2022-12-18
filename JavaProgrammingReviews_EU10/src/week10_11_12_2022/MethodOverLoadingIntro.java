package week10_11_12_2022;

public class MethodOverLoadingIntro {
    public static void main(String[] args) {
        //I wnt to add two number

        int i = 23;
        double d = 24.5;
        float f = 23.5f;// (float)23.5;

        sum(i, d);
        sum(d, f);
        sum(i, i, i);
        sum(i, i);

    }

    //if we change number of parameter we can implement method overloading
    public static void sum(int i, int i1) {

    }

    private static void sum(int i, int i1, int i2) {

    }

    //if we use different order for parameter also we can implement the method overlaoding

    public static void sum(double d, int i) {

    }

    //if we use different parameter data types also we can implement the method overloading
    private static int sum(double d, float f) {

        return 0;
    }

    public static double sum(int i, double d) {

        return 0;
    }
}
/*
//we can not use method overloading only changing return type
    public static void sum(int i, double d) {
    }
    public static double sum(int i, double d) {
return 0;
    }
 */




