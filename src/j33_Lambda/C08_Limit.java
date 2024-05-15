package j33_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class C08_Limit {
    public static void main(String[] args) {
        /*
        Limit(n)
Elimizde var olan bir veri kaynağını, göstermek istediğimiz kadarını göstermemize yarayan,
sınırlandıran bir metoddur. Parametre olarak vereceğimiz rakamla aslında
Stream içerisinde dönen çok sayıda veri var
ancak sen bize şu kadarını göster diyoruz.
         */
        //limit(a) akısdan cıkan elemanları a parametresine gore ilk a elamanı alır.

        List<String> yemahhh = new ArrayList<>(Arrays.asList("küşleme", "soğanlı", "trileçe", "bicibici", "büryan", "Welemen", "cacix", "kokereç", "yağlama", "güveç", "arabAşı", "tantuni"));
        System.out.println("****** Task01 *****");
        // Task-> list elemanlarının karakter sayısı en buyuk olanı
        // print code create ediniz...
        printEnBykCharSayisi(yemahhh);

        System.out.println("\n****** Task02 *****");

    }

    private static void printEnBykCharSayisi(List<String> yemahhh) {
        System.out.println("***** Version 01 *****");
        System.out.println(
                yemahhh
                        .stream()
                        .sorted(Comparator.comparing(String::length).reversed())
                        .limit(1)); // java.util.stream.SliceOps$1@27973e9b
/*
limit(a)-> return typ bir Stream oldg için yani yeni bir eleman akışı oldg için birden çok eleman return edebilir.
dolayısıyla limit() meth. çıktısı doğrudan sout parametre olamaz(print edilemez) .
limit() meth cıktısı array veya List gibi bir collectiona atanmalı.
 */
        System.out.println("***** Version 02 *****");
        List<String> list = yemahhh
                .stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .limit(1).collect(Collectors.toList());
        System.out.println(list); // [bicibici]

        System.out.println("***** Version 03 *****");
        Object[] arr = yemahhh
                .stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .limit(1).toArray();
        System.out.println(Arrays.toString(arr)); // [bicibici]

        System.out.println("***** Version 04 *****");
        System.out.println(
                yemahhh
                        .stream()
                        .sorted(Comparator.comparing(String::length).reversed())
                        .findFirst()); // Optional[bicibici]

        System.out.println("***** Version 05 *****");
                yemahhh
                        .stream()
                        .sorted(Comparator.comparing(String::length).reversed())
                        .limit(1)
                        .forEach(SeedMethods::strYazdir); // bicibici



    }
}
