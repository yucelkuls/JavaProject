package j33_Lambda.Tasks;

import j33_Lambda.SeedMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q01 {
    /*    2) "Q01" olarak adlandırılan bir class oluşturun
          3) 5 String öğesi içeren bir String list oluşturun.
          4) 3 tanesi "A" harfi ile başlayacak
          5) Elemanlar "A" harfi ile başlıyorsa ve elemanların uzunlukları
          5'ten küçükse, konsolda list olarak buyuk harflerle yazdırın.

     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(Arrays.asList("Aslan", "Kaplan", "Adnan", "Can", "Veli", "Asim", "akif", "Ali"));
        printIstenilenler(list);

    }

    private static void printIstenilenler(List<String> list) {
        list
                .stream()
                .filter(t -> t.startsWith("A") && t.length() < 5)
                .map(String::toUpperCase)
                .forEach(SeedMethods::strYazdir);

    }

}
