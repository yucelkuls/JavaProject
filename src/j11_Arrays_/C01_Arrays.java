package j11_Arrays_;

import java.util.Arrays;

public class C01_Arrays {

    /*
Array (Dizi): Java'da birden fazla aynı type variable depolamak (store etmek) icin kullanilan bir objedir.
Array tanımlamak için:
1- data type (Bir array'in icerisinde sadece ayni data tipinden variable olmalıdır.)
2- length (length array'e depolanacak  max eleman sayisini belirtir ve length'den  fazla eleman  koyulursa RTE verir)

 Array'de primitive datalar veya non-primitive datalarin referanslari store edilebilir
 isimler array'inin icinde isim degerleri degil, isimlerin referanslari saklanır
 */
    public static void main(String[] args) {
        // Array declaration

        int a; // deklere edildi ama atama yapilmadi!
        int arr[]; // deklere edilen ama atama yapilmayan bir non-primitive int datatype array tanimlandi!
        // Trick -> tanimlanan ancak deger atanmayan array hic bir isleme tabi tutulamaz ve CTE hatasi verir.
        String[] isimler = {"saim", "halit", "safvet", "abdurrahman", "yucel", "sema"};
        int sayiArr[] = new int[5];   // eleman sayisi belli, ama elemanlar atanmamis.
        int sayiArr1[] = new int[7];  // eleman sayisi belli, ama elemanlar atanmamis.
        arr = new int [2];
        arr[0] = 2;
        arr[1] = 3;

        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        // Array' e eleman girisi -> update
        sayiArr[3] = 61;
        sayiArr[4] = 58;
        sayiArr[0] = 55;
        sayiArr[3] = 58; // 3.index eleman 61 iken 58 olarak degistirildi.

        // Array'in eleman sayisi -> length
        System.out.println(sayiArr.length); // 5
        System.out.println("isimler.length = " + isimler.length); // 6

        // Array'in elemanlarini yazdirma -> toString(arrayAdi)
        System.out.println(Arrays.toString(isimler)); // [saim, halit, safvet, abdurrahman, yucel, sema]
        System.out.println(Arrays.toString(sayiArr)); // [55, 0, 0, 58, 58]
//        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr)); CTE !!!!!
        System.out.println(Arrays.toString(sayiArr1)); // [0, 0, 0, 0, 0, 0, 0]
        // Array'in son index i print etme
        System.out.println(sayiArr[sayiArr.length - 1]); // 58
        // Array de olmayan index i print etme
//        System.out.println("sayiArr[42] = " + sayiArr[42]);  // RTE -> ArrayIndexOutOfBoundsException

        // Array'in elemanlarini print etme -> bad practice
        System.out.println("Arrays.toString(isimler) = " + Arrays.toString(isimler));
        for (int i = 0; i < isimler.length; i++) {
            System.out.print(isimler[i] + " ");
        }
        System.out.println();

        // Array'in elemanlarini natural dogal siralama kucukten buyuge veya alfabetik.
        System.out.println("Sort oncesi isimler : " + Arrays.toString(isimler)); //[saim, halit, safvet, abdurrahman, yucel, sema]
        Arrays.sort(isimler);
        System.out.println("Sort sonrasi isimler : " + Arrays.toString(isimler)); //[abdurrahman, halit, safvet, saim, sema, yucel]

        System.out.println("Sort oncesi sayiArr : " + Arrays.toString(sayiArr)); //[55, 0, 0, 58, 58]
        Arrays.sort(sayiArr);
        System.out.println("Sort sonrasi sayiArr : " + Arrays.toString(sayiArr)); //[0, 0, 55, 58, 58]
        System.out.println();


//
//        int [] random = {6, -4, -10, 12, 0};    OCA sorusu
//        int x  = 12;
//        int y = Arrays.binarySearch(random, x);
//        System.out.println(y);
    }
}
