package week15_12_17_2022.method_overriding;

public class ChildClass extends ParentClass{

    //Access modifier should be more visible or same
    //Return type should be same
    //Method Name should be same
    // Parameters should be same


    @Override
    public void move() {
        System.out.println("Bird is flying");
    }
}
