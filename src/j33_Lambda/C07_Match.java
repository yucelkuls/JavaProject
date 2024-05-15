package j33_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_Match {
    public static void main(String[] args) {
        //anyMatch() --> enaz bir eleman sarti saglarsa true aksi durumda false return eder
        //allMatch() --> tum  elemanlar sarti saglarsa true en az bir eleman sarti saglamazsa false return eder.
        //noneMatch()--> hic bir eleman sarti SAGLAMAZSA true en az bir eleman sarti SAGLARSA false return eder.
        List<String> yemahhh = new ArrayList<>(Arrays.asList("küşleme", "soğanlı", "trileçe", "bicibici", "büryan", "Melemen", "cacix", "kokereç", "yağlama", "güveç", "arabAşı", "tantuni"));
        System.out.println("\n****** Task01 *****");
        // Task01->  List elemanlarinin karakter sayisini 7 ve
        // 7 'den az olma durumunu kontrol eden code create ediniz.
        kontrolChar7Az(yemahhh);
        System.out.println(kontrolChar7AzTernary(yemahhh));

        System.out.println("\n****** Task02 *****");
        // Task02-> List elemanlarinin hicbirinin "W" ile baslamamasını
        // kontrol eden code create ediniz...->noneMatch
        System.out.println(kontrolWBaslamayan(yemahhh));
        System.out.println("\n****** Task03 *****");
// Task03-> List elemanlarinin "x" ile biten en az bir elemanın
// varlığını kontrol ediniz eden code create ediniz...->
        System.out.println(kontrolXBitenEnAz(yemahhh));
        System.out.println("\n****** Task04 *****");
    }

    private static String kontrolXBitenEnAz(List<String> yemahhh) {
        return yemahhh.stream().anyMatch(t->t.endsWith("x"))?
                "Menude x ile biten en az bir yemek var":
                "Menude x ile biten herhangi bir yemek yok";

    }

    private static String kontrolWBaslamayan(List<String> yemahhh) {
        return yemahhh.stream().noneMatch(t-> t.startsWith("W"))?
                "Menude W ile baslayan herhangi bir yemek yok":
                "Menude W ile baslayan en az bir yemek var";
    }

    private static String  kontrolChar7AzTernary(List<String> yemahhh) {
        return yemahhh.stream().allMatch(t->t.length()<=7)? "Yemek listesinin tum elemanlarinin uzunlugu 7 veya 7 den az karakterde":
                                                            "Yemek listesinin en az bir elemaninin uzunlugu 7 den fazla karakterde";
    }

    private static void kontrolChar7Az(List<String> yemahhh) {
        yemahhh
                .stream()
                .allMatch(t -> t.length() <= 7); // tum elemenlar kontrol edilir hepsi sarti sagliyorsa true doner
        if (yemahhh.stream().allMatch(t -> t.length() <= 7)) {
            System.out.println("Yemek listesinin tum elemanlarinin uzunlugu 7 veya 7 den az karakterde");
        } else {
            System.out.println("Yemek listesinin en az bir elemaninin uzunlugu 7 den fazla karakterde");
        }
    }
}
