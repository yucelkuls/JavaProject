package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {


        /* Task->
         * Kullanicidan bir character girmesini isteyin ve
         * girilen karakteri ve ascii degerini yazin
         *
         * Ornek : Input  : a
         *         Output : Girdiginiz ‘a’ karakterinin ascii degeri : 95
         *
         *
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir karakter giriniz : ");
        char character = scanner.next().charAt(0);
        System.out.print("Girilen : "+ character + " karakterinin ascii degeri : " + (int) character);




    }


}
