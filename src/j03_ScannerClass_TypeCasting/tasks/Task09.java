package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;


public class Task09 {

    public static void main(String[] args) {

    /*  Task->
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz

        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333
        */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a : ");
        double a = scan.nextInt();
        System.out.println("Enter b : ");
        double b = scan.nextInt();
        System.out.println("Enter c : ");
        double c = scan.nextInt();

        System.out.println("a sayisini giriniz : " + a + "\nb sayisini giriniz : " + b + "\nc sayisini giriniz" + "Sonuc = " + (Math.pow(a, 2) - Math.pow(b, 2))/(c * 3));





    }
}
