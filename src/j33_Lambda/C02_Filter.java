package j33_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//    Filter:
//    Dizimiz veya Collection'ımız üzerinde bizim belirteceğimiz koşullar doğrultusunda
//    filtreleme işlemi yapmamıza yarayan bir yapıdır.
//    Bu işlem sonrası belirttiğimiz koşula uygun olmayan elemanlar bir sonraki aşamada kullanılamazlar.
//    Artık elimizde filtrelenmiş/süzülmüş/elenmiş bir veri vardır

public class C02_Filter {
    public static void main(String[] args) {
        List<Integer> sayiList = new ArrayList<>(Arrays.asList(7, 58, 17, 54, 33, 3, 13, 35, 65, 18, 61, 46, 25, 16, 6));
        System.out.println("****** Task01 *****");
        //Task01->"Structured Programming"--> AMELE Programming kullanarak
        // listin çift elemanlarını aynı satırda
        // aralarında bosluk ile print ediniz
        printCiftStructured(sayiList); // 58 54 18 46 16 6
        System.out.println("\n****** Task02 *****");
        //task02-> "Functional Programming"--> CINCIX Programming kullanarak
        // listin çift elemanlarını aynı satırda aralarında bosluk ile
        // print ediniz
        printCiftFunctional(sayiList);  // 58 54 18 46 16 6

        System.out.println("\n****** Task03 *****");
        //task03-> "Functional Programming"--> CINCIX Programming kullanarak
        // listin 35'den kucuk çift elemanlarını aynı satırda
        // aralarında bosluk ile print ediniz
        print35KckCiftFunctional(sayiList);  // 18 16 6
        System.out.println("\n****** Task04 *****");
        //task04-> "Functional Programming"--> CINCIX Programming kullanarak
        // listin 34'den buyuk yada  tek elemanlarını
        // aynı satırda aralarında bosluk ile print ediniz
        print34BykTekFunctional(sayiList);  // 7 58 17 54 33 3 13 35 65 61 46 25



    }

    private static void print34BykTekFunctional(List<Integer> sayiList) {
        sayiList.stream().filter(t->t>34||t%2==1).forEach(SeedMethods::intYazdir);
    }

    private static void print35KckCiftFunctional(List<Integer> sayiList) {
        sayiList.stream().filter(SeedMethods::ciftMi).filter((t)-> t<35).forEach(SeedMethods::intYazdir);
    }

    private static void printCiftFunctional(List<Integer> sayiList) {
//        sayiList.stream().filter((t) ->t%2==0).forEach(SeedMethods::intYazdir);
        sayiList.stream().filter(SeedMethods::ciftMi).forEach(SeedMethods::intYazdir);
    }

    private static void printCiftStructured(List<Integer> sayiList) {
        for (Integer each : sayiList){
            if (each%2==0) {
                System.out.print(each +" ");
            }
        }
    }
}
