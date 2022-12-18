package week13_12_03_2022.inheritance;

public class Instagram extends MobileApp{


    public Instagram(double version) {
        super("Instagram", version);
    }

    public void postPhoto(){
        System.out.println("The user is posting photo");
    }
}
