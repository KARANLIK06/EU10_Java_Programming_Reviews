package week05_10_08_2022;

public class Task9 {
    public static void main(String[] args) {
        /*
        Task 9: Given a string password. Encrypt with "x" a given password and print.

    Hint: do with for loop

     * password: cydeo
     * encrypt with char :x
     * output:cxyxdxexox
         */
        String password = "cydeo";
        char encryptWith = 'x';
        String encryptedPassword = "";
        for (int i = 0; i < password.length(); i++) {
            encryptedPassword += "" + password.charAt(i) + encryptWith;
        }
        System.out.println(encryptedPassword);
    }

}
