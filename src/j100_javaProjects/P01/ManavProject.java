package j100_javaProjects.P01;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ManavProject {  //Class level


    static ArrayList<String> urunListesi = new ArrayList<>(Arrays.asList("tomaten -> 1", "aubergine -> 2", "appel -> 3", "aardbei -> 4", "bananen -> 5"));
    static ArrayList<Double> fiyatListesi = new ArrayList<>(Arrays.asList(20.5, 35.3, 40.2, 50.0, 85.7));
    static double toplamOdenecekTutar = 0;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) { // main level


        /* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         *            istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         *            Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
         *
         * */

        System.out.println("Welkom bij Jumbo \n"+ urunListesi + "\n"+ fiyatListesi);
        musteriSecim();


    } // main sonu

    private static void musteriSecim() {
        System.out.println("Hangi urun istersiniz : ");
        int secim = input.nextInt();
        if (secim < 6 && secim > 0) {
            System.out.println("Secilen urunden kac kilo istersiniz : ");
            double kilo = input.nextDouble();
            toplamOdenecekTutar += kilo * fiyatListesi.get(secim - 1);
            System.out.println("Secilen urun : "+ urunListesi.get(secim - 1) + "\n"+
                               "Secilen urun fiyati : "+ fiyatListesi.get(secim - 1) + "\n"+
                               "Istenen kilo : "+ kilo + "\n"+
                               "Toplam odeme : "+ toplamOdenecekTutar);
            System.out.println("Devam etmek icin 1'e kasaya gitmek icin 2 ye basiniz: ");
            int karar = input.nextInt();
            if (karar == 1) {
                musteriSecim();
            } else if (karar == 2) {
                kasa();
            }else System.out.println("Hatali giris!");

        }else {System.out.println("Lutfen seciminizi kontrol ediniz");

        musteriSecim();
        }
    }
    private static void kasa() {
        System.out.println("Toplam odemeniz : "+ toplamOdenecekTutar + "\nYine bekleriz");
    }
} // Class sonu
