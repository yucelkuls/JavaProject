package j12_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        // Task-> Girilen sayıların içinde ortalamadan buyuk olanları print eden METHOD create ediniz.
        List<Integer> sayiList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Listeye atamak istediginiz elemanlari giriniz \n Yeterli sayiya ulasinca negatif bir deger giriniz");
        Integer islem = 0;
        int toplam = 0;

        while (islem >= 0) {
            System.out.println("Bir sayi giriniz");
            islem = scan.nextInt();
            if (islem > 0) {
                sayiList.add(islem);
                toplam +=islem;
            }
        }
        System.out.println("sayiList = "+sayiList);
        System.out.println("toplam = "+toplam);
        int ort=toplam/sayiList.size();
        System.out.println("ortalama = "+ort);
        for (int i = 0; i < sayiList.size(); i++) {
            if (sayiList.get(i) > ort) {
                System.out.print(sayiList.get(i) + " ");
            }
        }
    }
}
