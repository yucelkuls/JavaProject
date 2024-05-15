package j04_JavaOperators.j01_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

        /*Task->
         * Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin

         * Ornek : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5
         *          Girdiginiz sayinin yuzler basamagi : 8

         */
        Scanner input = new Scanner(System.in);

        System.out.println("Uc basamakli bir sayi giriniz: ");
        int myNum = input.nextInt();

        System.out.println("Girdiginiz sayinin birler basamagi : " + (myNum % 10));
        System.out.println("Girdiginiz sayinin onlar basamagi : " + ((myNum / 10) % 10)); // Onlar basamagi
        System.out.println("Girdiginiz sayinin yuzler basamagi : " + (myNum / 100));

        /*
        Benim cozumum!!!
        int sayi = 1234; // bir integer sayı tanımla
        String s = String.valueOf(sayi); // sayıyı bir stringe dönüştür
        char ilk = s.charAt(0); // stringin ilk karakterini al
        char son = s.charAt(s.length()-1); // stringin son karakterini al
        System.out.println("İlk basamak: " + ilk); // ilk basamağı yazdır
        System.out.println("Son basamak: " + son); // son basamağı yazdır
         */
        String s = String.valueOf(myNum); // sayıyı bir stringe dönüşturur.
        char yuzler = s.charAt(0);
        char onlar = s.charAt(s.length() - 2);
        char birler = s.charAt(s.length() - 1);
        System.out.println("Birler basamak: " + birler); // ilk basamağı yaz
        System.out.println("Onlar basamak: " + onlar); // son basamağı yaz
        System.out.println("Yuzler basamak: " + yuzler); // son basamağı yaz



    }
}
