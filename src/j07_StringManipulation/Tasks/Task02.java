package j07_StringManipulation.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*  Task->
		 	Girilen passwordun aşagıdaki şartları sağlamasını kontrol eden coden create ediniz
		 	 a)Ilk karakteri buyuk harf olmalı
		 	 b)Son karakteri sayi olamlı
		 	 c)en az 6 karakter uzunlugunda olmalı
		 */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a password: ");
        String password = input.nextLine();

        char first = password.charAt(0);
        char last = password.charAt(password.length() - 1);
        int length = password.length();

        if (Character.isUpperCase(first)) {
            if (Character.isDigit(last)) {
                if (length >= 6) {
                    System.out.println("Your password is valid!");
                } else {
                    System.out.println("Your password must be at least 6 characters.");
                }
            }else {
                System.out.println("The last character of your password must be a number!");
            }

        } else {
            System.out.println("The first character of your password must be an uppercase letter!");
        }

    }
}
