package j07_StringManipulation.Tasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        /* TASK :
         * Girilen  isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olmasını control eden code create ediniz
         */

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen 3 harfli bir isim giriniz: ");
        String isim = input.next();

        if (isim.length() == 3) {
            System.out.println(isim.charAt(0) != isim.charAt(1)
                               && isim.charAt(0) != isim.charAt(2)
                               && isim.charAt(1) != isim.charAt(2) ? "Unique" : "Not unique");
        } else System.out.println("Lütfen 3 harfli isim giriniz");
    }
}