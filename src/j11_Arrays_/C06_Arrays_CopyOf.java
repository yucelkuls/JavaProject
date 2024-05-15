package j11_Arrays_;

import java.util.Arrays;

public class C06_Arrays_CopyOf {
    public static void main(String[] args) {
        // Arrays.copyOf(arr,int);-> girilen arr'yin istenen elelman sayısı kadar ilk elemanı kopyalar.
        int arr1[] = {2, 5, 13, 65, 49, 38, 33, 58, 27};
        int arr2[] = Arrays.copyOf(arr1, 5);
        System.out.println("Arrays.toString(arr1) = " + Arrays.toString(arr1)); //[2, 5, 13, 65, 49, 38, 33, 58, 27]
        System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2)); //[2, 5, 13, 65, 49]

        // arr'in son 3 elamanını store(depolayan) arrayi print eden code create ediniz...

        int arr3[] = Arrays.copyOfRange(arr1, arr1.length - 3, arr1.length);
        System.out.println("Arrays.toString(arr3) = " + Arrays.toString(arr3)); //[33, 58, 27]

        // Array'i belirli bir eleman ile set-update (fill(value)) etme.

        System.out.println("arr1 in fill oncesi: "+ Arrays.toString(arr1));
        Arrays.fill(arr1, 10);
        System.out.println("arr1 in fill sonucu: "+ Arrays.toString(arr1));


        // task-> arr 3 ile 7 index arası(3-4-5-6) elamanları 35 ile update eden code create ediniz...

        Arrays.fill(arr1, 3,7, 35);
        System.out.println("arr1 in fill sonucu: "+ Arrays.toString(arr1));
    }
}
