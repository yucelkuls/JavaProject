package j101_InterviewQuestionsJava;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Q02_MergeCertainCharacters {
    /* Task->
     * Girilen  Stringin ilk ve son harfini yine girilen  sayi kadar
     * return eden metod create ediniz.
     *
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay

     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir String giriniz");
        String str = scanner.next();
        System.out.println("Bir sayı giriniz");
        int count = scanner.nextInt();
        System.out.println("ilkVeSonHarfYazdir(str, count) = " + ilkVeSonHarfYazdir(str, count));

    }//main sonu
    private static String ilkVeSonHarfYazdir(String str, int count) {
        String output= "";
        for (int i = 0; i < count; i++) {
            output += ""+str.charAt(0) + str.charAt(str.length()-1);
        }
        return output;
    }

}//class sonu
