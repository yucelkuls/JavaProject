package j33_Lambda;

import java.util.Arrays;

public class Q04 {
    public static void main(String[] args) {
        /* TASK :
 multidimensional arrayin iç array lerindeki tüm elemanların toplamını birer birer bulan
 ve herbir sonucu yeni bir arrayin elemanı yapan ve yeni array i ekrana yazdıran programı yaziniz.
 input {{10,20,30},{4},{6,7,20}}==> output={60,4,33}
*/
        int[][]arr= {{10,20,30},{4},{6,7,20}};
        System.out.println(Arrays.toString(Arrays.stream(arr).map(t->Arrays.stream(t).sum()).toArray()));
    }
}
