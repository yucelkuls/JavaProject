package j99_codeChallange;

import java.util.Scanner;

public class Task09 {
    /* Task->
      Girilen bir kelimede  tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
      * kelimenin ortasindaki karakteri print eden code create ediniz.
      */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Agıdeşşş  bi  kelime girive bakennn : ");
        String kelime = input.next();
        System.out.println("   ***  if cozum   ***   ");

        if (kelime.length() % 2 == 1 && kelime.length() >= 3) System.out.println(kelime.charAt(kelime.length() / 2));

        System.out.println("   ***  ternary cozum   ***   ");
        System.out.println((kelime.length() % 2 == 1 && kelime.length() >= 3) ?
                kelime.charAt(kelime.length() / 2) :
                "");
    }
}
