package week03_09_24_2022;

public class CalculateCarTax {
    public static void main(String[] args) {
        /*
        Task 5: Create a class which is "CalculateCarTax"
        if the price between $20000 and $39999 taxRate=0.2
        if the price between $40000 and $59999 taxRate=0.3
        if the price between $60000 and $80000 taxRate=0.4
         */
        int carPrice = 25000;

        boolean taxRate1= carPrice>=20000 & carPrice<40000;
        boolean taxRate2= carPrice>=40000 & carPrice<60000;
        boolean taxRate3= carPrice>=60000 & carPrice<=80000;

        if (taxRate1){
            System.out.println("taxRate = " +carPrice*0.2);
        }else if (taxRate2){
            System.out.println("taxRate = " +carPrice*0.3);
        }else if (taxRate3){
            System.out.println("taxRate = " +carPrice*0.4);
        }else{
            System.out.println("You entered the wrong value");
        }
    }
}
