package j07_StringManipulation.Tasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

        /*
         Task->
         Girilen iki kelimeden ilki çift sayıda karakter içeriyorsa 2. kelimeyi 1. kelimenin ortasına print eden
         ilk kelime tek sayıda karakter içeriyorsa "kelime2 kelime1 eklenemez" print eden code create ediniz
         name1= Java
         name2= haluk
         Print ==> Jahalukva
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please first word: ");
        String name1 = scanner.next();
        System.out.println("Please second word: ");
        String name2 = scanner.next();

        if (name1.length() % 2 == 0) {
            System.out.println(name1.substring(0, name1.length() / 2) + name2 + name1.substring(name1.length() / 2));

        } else System.out.println("Name2 name1 e eklenemez");


    }
}
