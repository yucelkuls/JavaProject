package j33_Lambda.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Q02 {

    //        2) Bir class oluşturun, 'Q02' olarak adlandırın
//        3) 5 elemanlı bir tamsayı listesi oluşturun
//        4) Elemanlari doğal sıraya koyun
//        5)Konsoldaki son 3 elemanın karelerinin toplamını bulun.
//        6) Konsoldaki toplamı yazdırın
//        7) 'Fonksiyonel Programlama' kullanın

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 3, 7));
        printSoylenen(list);

        System.out.println("printSoylenen1(list) = " + printSoylenen1(list));
        System.out.println("printSoylenen2(list) = " + printSoylenen2(list));
    }

    private static Optional<Integer> printSoylenen2(List<Integer> list) {
       return list
                .stream()
                .sorted()
                .skip(list.size() - 3)
                //  .map(SeedMethods::kareAl)
                // .map(t->t*t)
                .map(t -> (int) (Math.pow(t, 2)))
                //   .reduce(0, Math::addExact);
                .reduce(Integer::sum);//seim hocaya neden idendty kabul etmedi neden ?

    }

    private static int printSoylenen1(List<Integer> list) {
        return list
                .stream()
                .sorted()
                .skip(list.size() - 3)
                //  .map(SeedMethods::kareAl)
                // .map(t->t*t)
                .map(t -> (int) (Math.pow(t, 2)))
                //   .reduce(0, Math::addExact);
                .reduce(0, Integer::sum);
    }

    private static void printSoylenen(List<Integer> list) {
        int toplam = list
                .stream()
                .sorted()
                .skip(list.size() - 3)
                //  .map(SeedMethods::kareAl)
                // .map(t->t*t)
                .map(t -> (int) (Math.pow(t, 2)))
                //   .reduce(0, Math::addExact);
                .reduce(0, Integer::sum);
        System.out.println(toplam);
        System.out.println("******2");
        System.out.println(
                list
                        .stream()
                        .sorted()
                        .skip(list.size() - 3)
                        //  .map(SeedMethods::kareAl)
                        // .map(t->t*t)
                        .map(t -> (int) (Math.pow(t, 2)))
                        //   .reduce(0, Math::addExact);
                        .reduce(0, Integer::sum)
        );


    }
}
