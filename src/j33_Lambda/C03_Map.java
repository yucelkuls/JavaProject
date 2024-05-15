package j33_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_Map {
    /*
    Map :Stream içerisinde erişilen her bir eleman üzerinde işlem yapmamıza
    ve başka elemanlara dönüştürmemize imkan sağlayar
     */
    public static void main(String[] args) {
        List<Integer> sayiList = new ArrayList<>(Arrays.asList(7, 58, 17, 54, 33, 3, 13, 35, 65, 18, 61, 46, 25, 16, 6));
        System.out.println("****** Task01 *****");
        // Task01-> listin çift elemanlarının karelerini aynı
        // satıra aralarına bosluk bırakarak
        // print eden code create ediniz.
        printCiftKare(sayiList);  // 3364 2916 324 2116 256 36
        System.out.println("\n****** Task02 *****");
        // Task02 : Functional Programming ile listin
        // tek elemanlarinin  kuplerinin bir fazlasini
        // ayni satirda aralarina bosluk birakarak
        // print eden code create ediniz.
        printTekKup1Fazla(sayiList);  // 344 4914 35938 28 2198 42876 274626 226982 15626
        System.out.println("\n****** Task03 *****");
        // Task03-> Functional Programming ile listin cift elemanlarinin
        // karekoklerini ayni satirda aralarina bosluk birakarak
        // print eden code create ediniz.
        printCiftKarekok(sayiList);  // 7 7 4 6 4 2

    }

    private static void printCiftKarekok(List<Integer> sayiList) {
        sayiList.
                stream().
                filter(SeedMethods::ciftMi).
                map(t->(int)Math.sqrt(t)).
                forEach(SeedMethods::intYazdir);
    }

    private static void printTekKup1Fazla(List<Integer> sayiList) {
        sayiList.
                stream().
                filter(t->t%2==1).
                map(t->(int)Math.pow(t,3)+1).
                forEach(SeedMethods::intYazdir);
    }

    private static void printCiftKare(List<Integer> sayiList) {
        sayiList.
                stream().
                filter(SeedMethods::ciftMi).
                //map(t->t*t).
                map(t->(int)Math.pow(t,2)).
                forEach(SeedMethods::intYazdir);
        //map()--> Stream içerisindeki elemanları başka tiplere dönüştürmek veya üzerlerinde işlem yapmak (update) için map kullanılmaktadır.
    }
}
