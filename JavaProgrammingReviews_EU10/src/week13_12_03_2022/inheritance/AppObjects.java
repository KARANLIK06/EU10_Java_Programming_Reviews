package week13_12_03_2022.inheritance;

public class AppObjects {
    public static void main(String[] args) {
        // Let's creat an Instagram object

        Instagram instagram = new Instagram(5.6);
        System.out.println(instagram);
        instagram.useTheApp(30);

        System.out.println("============================================");

        Discord discord = new Discord(4.5);
        System.out.println(discord);
        discord.useTheApp(25);
    }
}
