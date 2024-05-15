package j33_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C09_Skip {
    public static void main(String[] args) {
        /*
        skip(1) => atlama demek. Akışın ilk n elemanını attıktan sonra bu akışın kalan elemanlarından oluşan bir akış döndürür.
        Bu akış n'den daha az öğe içeriyorsa, boş bir akış döndürülür. Bu, durum bilgisi olan bir ara işlemdir.
        skip(list.size()-1) => List'in uzunluğunun 1 eksiğini yazarsak son elemanı yazdırırız.

    */
        List<String> yemahhh = new ArrayList<>(Arrays.asList("küşleme", "soğanlı", "trileçe", "bicibici", "büryan", "Welemen", "cacix", "kokereç", "yağlama", "güveç", "arabAşı", "tantuni"));
        // skip(n) => atlama demektir. Akışın ilk n elemanını attıktan sonra bu akışın kalan elemanlarından oluşan bir akış return eder.
        // akıs n den daha az eleman içeriyorsa  skip(n) meth dan sonra boş akıs return eder.skip(n) ara işlemdir.

        System.out.println("****** Task01 *****");
        // Task : list elemanlarini son harfine göre siralayıp
        // ilk iki eleman hariç kalan elemanlari print eden code create ediniz.

        printIlk2HaricSonHarfSirala(yemahhh); // trileçe bicibici tantuni büryan Welemen cacix kokereç güveç soğanlı arabAşı

    }

    private static void printIlk2HaricSonHarfSirala(List<String> yemahhh) {
        System.out.println("***** Version 01 *****");
yemahhh
        .stream()
        .sorted(Comparator.comparing(t->t.charAt(t.length()-1)))
        .skip(2)
        .forEach(SeedMethods::strYazdir);
        System.out.println("***** Version 02 *****");
        System.out.println(Arrays.toString(
                yemahhh
                        .stream()
                        .sorted(Comparator.comparing(t->t.charAt(t.length()-1)))
                        .skip(2)
                        .toArray()
        )); // [trileçe, bicibici, tantuni, büryan, Welemen, cacix, kokereç, güveç, soğanlı, arabAşı]

        System.out.println("***** Version 03 *****");
        System.out.println(Arrays.asList(
                yemahhh
                        .stream()
                        .sorted(Comparator.comparing(t->t.charAt(t.length()-1)))
                        .skip(2)
                        .toArray()
        )); // [trileçe, bicibici, tantuni, büryan, Welemen, cacix, kokereç, güveç, soğanlı, arabAşı]

    }
}
