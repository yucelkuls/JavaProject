package j33_Lambda.Tasks;

import j33_Lambda.SeedMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Q04 {
    //        3) "Ali", "John", "Ali", "Alexander", "Taylor", "Ali", "Jackson" öğelerini içeren bir Dize listesi oluşturun
//        4) "J" ile baslayan olan öğeleri almayın
//        5) Farklı öğeleri seçin
//        6)Karakter sayısına göre doğal sıraya koyun
//        7) Tüm öğeleri büyük harfe dönüştürün
//        8) Konsoldaki öğeleri yazdırın
//        9)Fonksiyonel Programlama'yı kullanın
//        */
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(Arrays.asList("Ali", "John", "Ali", "Alexander",
                "Taylor", "Ali", "Jackson"));
        jIleBaslamayacakFarkliOgeKrkSysSiraYaz(list);
    }

    public static void jIleBaslamayacakFarkliOgeKrkSysSiraYaz(List<String> list) {
        System.out.print(" SONUC == > \n");
        list
                .stream()
                .filter(t->!(t.startsWith("J")))
                // .filter(t -> !t.toLowerCase().startsWith("j"))
                .distinct()
                .sorted(Comparator.comparing(t->t.length()))
            //   .sorted(Comparator.comparing(String::length))
                .map(String::toUpperCase)
                .forEach(SeedMethods::strYazdir);
        
    }
}
