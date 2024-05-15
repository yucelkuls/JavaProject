package j100_javaProjects.P01;

import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        /*
Sayı tahmin etme oyunu....
Bilgisayardan rastle(random Class kullanılarak) 0-100 arasında bir sayı alıp kullanıcının
tahminini her defasından büyük-kücük yönlendirerek rastgele sayiyi en fazla 3 tekrarda bulmasını sağlayan code create ediniz .
*/
        Scanner scanner = new Scanner(System.in);
        int sayi =0;
        int hak = 3;
        int count = 0;

        int rastgeleSayi = (int) (Math.random() * 100);
        System.out.println(rastgeleSayi);


        while(hak>0) {
            System.out.println("Bir sayi tahmin et");
            sayi = scanner.nextInt();
            if (sayi > rastgeleSayi) {
                System.out.println("Tahmininiz yuksek");
            } else if (sayi < rastgeleSayi) {
                System.out.println("Tahmininiz küçük");
            } else {
                System.out.println("Buldunuz!");
            }
            count++;
            hak--;
            System.out.println("Kalan hakkiniz: "+ hak);
        }
        System.out.println("Tahmin sayısı: " + count);
    }
}
