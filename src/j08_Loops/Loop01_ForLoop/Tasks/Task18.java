package j08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task18 {

    /*
    task-> Girilen bir tamsayının  3 üssü olup olmadığınıkontrol eden code create ediniz.
        Örnek 1:
        Girdi: 27
        Çıktı: true
        Açıklama: 3*3*3 =27
        Sonuç= true

        Örnek 2:
        Girdi: 0
        Çıktı: false
        Örnek 3:
        Girdi: 9
        Çıktı: true
        Açıklama: 3*3 = 9
        Sonuç= true

        Örnek 4:
        Girdi: 45
        Çıktı:: false
        Açıklama: 3*3*3*3 =81
        Sonuç= false
        45, 3ün üssü (kuvveti) değildir.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayi = scan.nextInt();
        boolean katiMi = false;

        int carpim = 1;

        for (int i = 1; i < sayi ; i++) {
            carpim *=3;
            if(carpim == sayi){
                katiMi = true;
                break;
            }
            if(carpim > sayi){
                break;
            }
        }
        if(katiMi){
            System.out.println(sayi + " 3'un üssüdur.");
        }else{
            System.out.println(sayi + " 3'un üssü degildir.");
        }

        System.out.println("*** 2. YOL ***");

        for (int i = 3; i < sayi; i*=3) {

            katiMi = sayi % i == 0 ? true : false;
        }
        System.out.println("katiMi = " + katiMi);
    }
}
