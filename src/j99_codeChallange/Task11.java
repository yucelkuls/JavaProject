package j99_codeChallange;

import java.util.Scanner;

public class Task11 {
    // Task-> Girilen  isim ve soyismini  hangisinin daha uzun oldugunu print eden code create ediniz.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.next();
        System.out.println("Enter your surname");
        String surname = scanner.next();

        if (name.length() > surname.length()){
            System.out.println(name + " is too long");
        }else if (name.length() < surname.length()) {
            System.out.println(surname + " is too long");
        }else System.out.println("Name and surname are of equal length");


    }

}