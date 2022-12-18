package week10_11_12_2022;

public class TaskFibo {
    static int fibo(int n) {
        if(n==1 || n==2)
            return 1;
        return fibo(n-1)+ fibo(n-2);
    }

    public static void main(String[] args) {
        // Fibonacci sayılar
        // 1 1 2 3 5 8 13 21 34 ......
        System.out.println(fibo(8));
    }
}
