package j10_MethodCreation;

import java.util.Scanner;

public class C02_MethodCreation {  // class

    public static void main(String[] args) {  // main
        // task-> girilen 3 sayının ortalamasını print eden METHOD create ediniz.

//        Scanner scanner = new Scanner(System.in);
//        int total = 0;
//        for (int i = 1; i <=3 ; i++) {
//            System.out.println(i + ". sayiyi giriniz");
//            int sayi = scanner.nextInt();
//            total += sayi;
//        }
        average(topla());

    } // main sonu

    private static int topla() {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        for (int i = 1; i <=3 ; i++) {
            System.out.println(i + ". sayiyi giriniz");
            int sayi = scanner.nextInt();
            total += sayi;
        }
        return total;
    }

    private static void average(int total) {
        System.out.println("Average = "+ (total / 3));
    }

}// class sonu
