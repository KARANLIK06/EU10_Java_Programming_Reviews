package week12_11_26_2022.statics;

public class EatingCake {
    public static void main(String[] args) {
        /*
        EatCake.eatCake(1);
        EatCake.eatCake(1);
        EatCake.eatCake(1);

         */
        EatCake person1= new EatCake();
        EatCake person2= new EatCake();
        EatCake person3= new EatCake();

        person1.eatCake(1);
        person2.eatCake(1);
        person3.eatCake(1);

    }
}
