package j03_ScannerClass_TypeCasting.tasks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /* TASK ->
        Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter isim : ");
        String isim = scan.nextLine();
        System.out.println("Enter soyisim : ");
        String soyisim = scan.nextLine();
        System.out.println("Enter yas : ");
        int yas = scan.nextInt();
        System.out.println("Enter kilo : ");
        int kilo = scan.nextInt();
        System.out.println("Enter boy : ");
        int boy = scan.nextInt();
        System.out.println("Enter kac ay : ");
        int kacAy = scan.nextInt();

        System.out.print("Isim : " + isim + "\nSoyisim : " + soyisim + "\nYas : " + yas + "\nKilo : " + kilo + "\nBoy : " + boy + "\nSure (ay) : " + kacAy + "\nToplam ucret : "+ kacAy * 20);




    }
}
