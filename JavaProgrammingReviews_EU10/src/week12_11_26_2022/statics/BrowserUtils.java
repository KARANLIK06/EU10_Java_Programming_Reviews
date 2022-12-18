package week12_11_26_2022.statics;

public class BrowserUtils {

    public static String staticVariable;
    public static void navigateUrl(String url){
        System.out.println("go to "+url);
    }
    public static void search(String word){
        System.out.println(word+" is searching");
    }
}
