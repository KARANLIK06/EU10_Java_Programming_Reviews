package week10_11_12_2022;

public class VoidReturnRecap {
    public static void main(String[] args) {
        add(3,4);

        int result=   add(3,4,5);
    }

    //can we use void method without printMethod? and can we use printMethod in return methods?
    public static int add(int i, int i1, int i2) {
        System.out.println(i+i1+i2);

        return i+i1+i2;
    }
    public static void add(int i, int i1) {
        int result=i+i1;

    }
}

