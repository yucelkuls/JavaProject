package j99_codeChallange.Challange06;

import java.util.Scanner;

public class Task06 {

    /*Task->
     Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
     ve x girildiğinde ise "Program bitti" print eden code create ediniz
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char ch ;

        do {
            System.out.println("Please enter anything : ");
            ch = scanner.next().charAt(0);
            System.out.println("The program is running...");
        }while(ch != 'x');
        System.out.println("The program is done!");


    }
}
