package j99_codeChallange;

import java.util.Scanner;

public class Task01 {

    //Task-> Girilen ismini ve soyisimi  buyuk harfler ile print eden code create ediniz.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scanner.next();
        System.out.print("Please enter your surname: ");
        String surname = scanner.next();
        System.out.println(name.toUpperCase() +" "+ surname.toUpperCase());



    }

}
