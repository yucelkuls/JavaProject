package j33_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class C04_Reduce {
    /*
 reduce()-->azaltmak ... bir cok datayi tek bir dataya(max min carp top vs islemlerde) cevirmek icin kullanilir.
 kullanımı yaygındır pratiktir.
 Bir Stream içerisindeki verilerin teker teker işlenmesidir. Teker teker işleme sürecinde, bir önceki adımda elde edilen sonuç
 bir sonraki adıma girdi olarak sunulmaktadır. Bu sayede yığılımlı bir hesaplama süreci elde edilmiş olmaktadır.
 reduce metodu ilk parametrede identity değeri, ikinci parametrede ise BinaryOperator türünden bir obj kullanılır.
 reduce işleminde bir önceki hesaplanmış değer ile sıradaki değer bir işleme tabi tutulmaktadır.
 İşleme başlarken bir önceki değer olmadığı için bu değer identity parametresinde tanımlanmaktadır.

 */
    public static void main(String[] args) {
        List<Integer> sayiList = new ArrayList<>(Arrays.asList(7, 58, 17, 35, 34, 25, 16, 6));
        System.out.println("****** Task01 *****");
        //Task01-> list çift elemanlarının karelerinin en
        // buyugunu print code create ediniz...
        printCiftKareMax(sayiList);  // Optional[3364]
        System.out.println("\n****** Task02 *****");
        //Task02-> list elemanlarının toplamını
        // print code create ediniz...
        System.out.println(printElTopla(sayiList)); // Optional[198]
        printElTopla1(sayiList); // 198
        System.out.println("\n****** Task03 *****");
        //Task03-> list'in çift elemanlarının çarpımını
        // print code create ediniz...
        printCiftElCarp(sayiList); // 189312

        System.out.println("\n****** Task04 *****");
        //Task04-> list elemanlarının en küçüğünü  print code
        // 4 farklı code create ediniz...
        printElMin(sayiList);
        System.out.println("\n****** Task05 *****");
        // Task05-> List elemanlarının 25'den buyuk en
        // kucuk tek elemanını print eden code create ediniz...
        printTek58BykMin(sayiList); // 35
    }

    private static void printTek58BykMin(List<Integer> sayiList) {
        System.out.println(sayiList
                .stream()
                .filter(t->t%2==1 && t>25)
                .reduce(Integer::min));
        // System.out.println(sayiList.stream().filter(t -> t > 25 && SeedMethods::ciftMi).reduce(Integer::min));
// Ahan da trick köşesinde böğün :) CTE-> exp ve meth. ref aynı pararmetrede tanımlanamaz
    }

    private static void printElMin(List<Integer> sayiList) {
        // 1.yol
        System.out.println(sayiList.stream().reduce(Math::min));
        // 2.yol
        System.out.println(sayiList.stream().reduce(Integer::min));
        // 3. yol
        System.out.println(sayiList.stream().reduce(SeedMethods::minBul));
        // 4/yol
        System.out.println(sayiList.stream().reduce(sayiList.getFirst(),(t, u)-> t < u?t:u));
        // 5.yol
        System.out.println(sayiList.stream().min(Integer::compareTo));
    }

    private static void printCiftElCarp(List<Integer> sayiList) {
        System.out.println(sayiList.
                stream().
                filter(SeedMethods::ciftMi).
                //reduce(Math::multiplyExact()
                reduce(1,(t,u)->t*u));
    }

    private static void printElTopla1(List<Integer> sayiList) {
        System.out.println(sayiList
                .stream()
                .reduce(0, (t, u) -> t + u));
        /*
a: ilk değerini her zaman  atanan identity değerden alır.
b: değerini her zaman Stream()'den alır
a: ilk değerden sonraki değerini action(işlem body)'den alır
  */

    }

    private static Optional<Integer> printElTopla(List<Integer> sayiList) {
        return sayiList
                .stream()
                .reduce(Math::addExact);
               // .reduce(Integer::sum);
    }

    private static void printCiftKareMax(List<Integer> sayiList) {
//        Optional<Integer> maxEl = sayiList
//                .stream()
//                .filter(SeedMethods::ciftMi)
//                .map(SeedMethods::kareAl)
//                .reduce(Math::max);
//        System.out.println("maxEl = " + maxEl);  // maxEl = Optional[3364]

        System.out.println(sayiList
                .stream()
                .filter(SeedMethods::ciftMi)
                .map(SeedMethods::kareAl)
                .reduce(Math::max));

    }
}
