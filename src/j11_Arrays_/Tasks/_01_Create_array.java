package j11_Arrays_.Tasks;

import java.util.Arrays;

public class _01_Create_array {

    public static void main(String[] args) {
        /*
        String Array (Dizi) oluşturunuz.
        elemanları : Apple, Orange , Banana, Kiwi
        Array'leri tüm elemanları yazdırınız.
         */

        //Kodu aşağıya yazınız.

        String[] fruits = {"Apple", "Orange", "Banana", "Kiwi"};
        System.out.println(Arrays.toString(fruits)); // Heap memory arrays icini getiriyor.
        System.out.println(fruits);  // Stack memory deki referans degerini getiriyor.

    }
}
