package week03_09_24_2022;

public class NumberPositiveOrNegative {
    public static void main(String[] args) {
        /*
        Task 4: Create a class which is "NumberPositiveOrNegaive" and create
         a variable if the variable is positive print "POSITIVE" if not "NON-POSITIVE"
         */
        int a=10;
        boolean aIsPositive=a>0;

        if(aIsPositive){
            System.out.println("POSITIVE");
        }else{
            System.out.println("NON-POSITIVE");
        }


        System.out.println("-------------------");


        if(true)
            System.out.println("if block is working");
    }
}
