package j11_Arrays_;

import java.util.Arrays;

public class  C02_ArraysPractice {
    public static void main(String[] args) {
        String[] isimler = {"saim", "halit", "safvet", "abdurrahman", "yucel", "sema"};
        int sayiArr[] = {20, 32, 7, 58, 63, 59, 35, 17, 16, 21};

        //Task01-> sayıArr cift index elemanlarını print eden code create ediniz...

        for (int i = 0; i < sayiArr.length; i+=2) {
            System.out.println(i + ". index: "+sayiArr[i]);  // 20 7 63 35 16
        }

        //Task02-> isimArray de 5 karakterden fazla olan elemanları print eden code create ediniz...

        for (int i = 0; i < isimler.length; i++) {
            if (isimler[i].length() > 5) {
                System.out.println(isimler[i]);
            }
        }

        //Task03-> isimArray de 6 karakterden az olan elemanı depolayan(store eden) arrayı print eden code create ediniz..

        int yeniArrElemanSayisi = 0;
        for (int i = 0; i < isimler.length; i++) {
            if (isimler[i].length() < 6) {
                yeniArrElemanSayisi++;
            }
        }
        System.out.println("Yeniarr eleman sayisi: "+ yeniArrElemanSayisi);

        String[] yeniArr = new String[yeniArrElemanSayisi];
        int newIndex = 0;
        for (int i = 0; i < isimler.length; i++) {
            if (isimler[i].length() < 6) {
                yeniArr[newIndex] = isimler[i];
                newIndex++;
            }
        }
        System.out.println(Arrays.toString(yeniArr));
    }
}
