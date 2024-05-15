package j07_StringManipulation;

import java.util.Scanner;

public class C04_Contains {
    public static void main(String[] args) {
        /*
    String içersinde istenen stringinin varlığını kontrol eder boolean değer return eder..
    char parametre -> CTE
     */

        String str1 = "Basari gayrete asiktir";
        System.out.println("str1 = " + str1);
        System.out.println("str1.contains(\"gayrete\") = " + str1.contains("gayrete"));
        // str1.contains('a'); // CTE hatasi
        System.out.println("str1.contains(\"a\") = " + str1.contains("a"));


        // Task-> girilen bir metinde istenen kelimenin varlığını kontrol eden code create ediniz...

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz: ");
        String metin = scanner.nextLine();
        System.out.println("Hangi kelimeyi ariyorsunuz: ");
        String kelime = scanner.next();
        System.out.println("metin.contains(kelime) = " + metin.contains(kelime)); // true
        System.out.println("kelime.contains(metin) = " + kelime.contains(metin)); // false
        System.out.println(metin.contains(kelime)? "Metin "+kelime+" kelimesini icermektedir." : "Metinde "+kelime+ " kelimesi bulunamadı");


    }
}
