package j33_Lambda.Tasks;

import j33_Lambda.SeedMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Q06 {
    //task01->Fonksiyonel Programlama ile [12, 9, 13, 4, 6, 2, 4, 12, 15] listesindeki tüm tek sayıları yazdırın
    //task02->6 ile 14 arasindaki tum sayilarin karesini ekrana yazdiriniz
    //task03->Listteki tek tamsayilarin karekoklerinin toplamini ekrana yazdiriniz
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(12, 9, 13, 4, 6, 2, 4, 12, 15));
        System.out.println("***1***");
        printTekSayi(list);
        System.out.println("\n***2***");
        printKareAl(list);
        System.out.println("\n***3***");
        printTeklerinKokAlTopla1(list);
        System.out.println("printTeklerinKokAlTopla2(list) = " + printTeklerinKokAlTopla2(list));
    }

    //Task 03 --> Listteki tek tamsayilarin karekoklerinin toplamini ekrana yazdiriniz
    //1.yol
    private static void printTeklerinKokAlTopla1(List<Integer> list) {
        int toplam = list.stream()
                .filter(SeedMethods::tekMi)
                .mapToInt(t -> (int) Math.sqrt(t))
                .sum();
        System.out.println("printTeklerinKokAlTopla1(list) = " + toplam);
    }

    //2.yol
    private static Optional<Integer> printTeklerinKokAlTopla2(List<Integer> list) {
        return list.stream()
                .filter(SeedMethods::tekMi)
                .map(t -> (int) Math.sqrt(t))
                .reduce(Integer::sum);

    }

    // Task 02 --> 6 ile 14 arasindaki tum sayilarin karesini ekrana yazdiriniz
    private static void printKareAl(List<Integer> list) {
        list
                .stream()
                .filter(t -> t > 6 && t < 14)
              //  .map(t -> (t * t))
                .map(SeedMethods::kareAl)
                .forEach(SeedMethods::intYazdir);
    }


    // Task 01 -> //Fonksiyonel Programlama ile listedeki tüm tek sayıları yazdırın
    private static void printTekSayi(List<Integer> list) {
        list
                .stream()
                //.filter(t -> t % 2 == 1)
                .filter(SeedMethods::tekMi)
                .forEach(SeedMethods::intYazdir);
    }


}
