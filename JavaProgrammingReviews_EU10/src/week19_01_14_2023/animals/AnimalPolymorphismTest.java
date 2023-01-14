package week19_01_14_2023.animals;

public class AnimalPolymorphismTest {
    public static void main(String[] args) {
        // implement polymorphism
        // ParenClass(Reference Type) reference = new SubClassConstructor();

        Animal animal= new Bird();
        animal.move();                  // upcasting
        animal=new Cow();
        animal.move();
        animal=new Fish();
        animal.move();
    //    ========================

        Animal animal1= new Bird();
                /*
                Reference type is deciding which methods are accessible
                Object is deciding which methods are implemented.

                 */

        // Reference type casting
        ((Bird) animal1).hunt();        // downcasting

    }
}
