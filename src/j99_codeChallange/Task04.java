package j99_codeChallange;

import java.util.Scanner;

public class Task04 {

    /* Task->
     * Girilen  bir kelime 3 ve daha fazla harfden olusuyorsa son
     * iki harfini 3 kere yan yana  degil ise girilen kelimeyi print eden code create ediniz.
     *
     * ornek
     * input = Ali
     * output = lilili
     *
     * input = el
     * output = el
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("text giriniz: ");
        String text = scan.next();

        if (text.length() >= 3) {
            String aa = text.substring(text.length() - 2);
            System.out.println(aa + aa + aa);
        } else System.out.println(text + ": 3 harfli değildir");



    }
}
