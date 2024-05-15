package j29_Collection.p01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /*
   Task->
   Node değerleri "Murat","javaCAN","javaTAR","Musa bey" olan bir linkedList create ediniz.
   Girilen bir String değeri linkedListte varlığını kontrol edip varsa silip "Agam eleman halledildi"
   yoksa "Agam aradığınız kişiye ulaşılamadı" print eden code create ediniz.

    */

        LinkedList<String> ll1 = new LinkedList<>(Arrays.asList("Murat","javaCAN","javaTAR","Musa bey"));

        Scanner scan = new Scanner(System.in);
        System.out.println("Silinecek elemani giriniz");
        String eleman = scan.next();

        System.out.println(ll1.remove(eleman) ? "Agam eleman halledildi" : "Agam aradığınız kişiye ulaşılamadı");
    }
}
