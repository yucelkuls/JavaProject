package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task12 {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {
        /*
        Task-> girilen meyılın doğrulugunu aşağıdaki şartlarda  control eden METHOD create ediniz.
        1- @ karakteri olmalı
        2- . (nokta) karakteri olmalı
        3- @ karakterinden önce mutlaka en az bir karakter olmalı.
        Example:
        "@gmail.com"-> false
        "@gmailcom"-> false
        "gmail.com"-> false
        "ebıkGabık@gmail.com"-> true
         */

        System.out.println("controlToEmail(email) = " + controlToEmail());

    }//main sonu

    private static boolean controlToEmail() {
        System.out.println("Please enter your email address : ");
        String email = input.next();
        return (email.contains("@") && email.contains(".") && !email.startsWith("@"));
    }

}//Class sonu
