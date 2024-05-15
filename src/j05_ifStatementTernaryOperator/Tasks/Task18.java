package j05_ifStatementTernaryOperator.Tasks;

import java.util.Scanner;

public class Task18 {
    /* Koç Burcu : 21 Mart - 20 Nisan
       Boğa Burcu : 21 Nisan - 21 Mayıs
       İkizler Burcu : 22 Mayıs - 22 Haziran
       Yengeç Burcu : 23 Haziran - 22 Temmuz
       Aslan Burcu : 23 Temmuz - 22 Ağustos
       Başak Burcu : 23 Ağustos - 22 Eylül
       Terazi Burcu : 23 Eylül - 22 Ekim
       Akrep Burcu : 23 Ekim - 21 Kasım
       Yay Burcu : 22 Kasım - 21 Aralık
       Oğlak Burcu : 22 Aralık - 21 Ocak
       Kova Burcu : 22 Ocak - 19 Şubat
       Balık Burcu : 20 Şubat - 20 Mart

       switch-case kullanmadan yapınız. */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Hangi ay dogdunuz? (Sayiyla)");
        int month = scan.nextInt();
        System.out.print("Hangi gun dogdunuz? (Sayiyla)");
        int day = scan.nextInt();
        String star = "";

        if (month == 1) {
            if (day > 21) {
                star = "Kova";
            } else {
                star = "Oglak";
            }
        } else if (month == 2) {
            if (day > 19) {
                star = "Balık";
            } else {
                star = "Kova";
            }
        } else if (month == 3) {
            if (day > 20) {
                star = "Koc";
            } else {
                star = "Balik";
            }
        } else if (month == 4) {
            if (day > 20) {
                star = "Boğa";
            } else {
                star = "Koc";
            }
        } else if (month == 5) {
            if (day > 21) {
                star = "Ikizler";
            } else {
                star = "Boğa";
            }
        } else if (month == 6) {
            if (day > 22) {
                star = "Yengeç";
            } else {
                star = "Ikizler";
            }
        } else if (month == 7) {
            if (day > 22) {
                star = "Aslan";
            } else {
                star = "Yengeç";
            }
        } else if (month == 8) {
            if (day > 22) {
                star = "Başak";
            } else {
                star = "Aslan";
            }
        } else if (month == 9) {
            if (day > 22) {
                star = "Terazi";
            } else {
                star = "Başak";
            }
        } else if (month == 10) {
            if (day > 22) {
                star = "Akrep";
            } else {
                star = "Terazi";
            }
        } else if (month == 11) {
            if (day > 21) {
                star = "Yay";
            } else {
                star = "Akrep";
            }
        } else if (month == 12) {
            if (day > 21) {
                star = "Oğlak";
            } else {
                star = "Yay";
            }
        } else {
            star = "";
        }
        if (star.equals("")) {
            System.out.println("Geçersiz gün veya ay girdiniz.");
        } else {
            System.out.println("Burcunuz: " + star);
        }
    }
}
