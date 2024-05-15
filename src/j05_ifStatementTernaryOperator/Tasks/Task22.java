package j05_ifStatementTernaryOperator.Tasks;

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        /*
                Sifreyi kontrol etmek için ternary yaziniz.
                8'den fazla karakter iceriyorsa, baş harfi 'i' olmalidir.
                8 karakterden fazla icermiyorsa, baş harfi 'K' olmalidir.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a password");
        String password = scan.next();

        if (password.length() > 8) {
            System.out.println(password.charAt(0) == 'i' ? "bas harfi i" : "bas harfi i degil!!");
        } else {
            System.out.println(password.charAt(0) == 'K' ? "bas harfi K" : "bas harfi K degil!!");
        }

    }

}
