package j33_Lambda;

import java.util.Arrays;
import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        /*
kullanıcıdan aldıgınız bir array'in en buyuk ve en kucuk elemanlarının farkını hesaplayınız
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Array boyutu giriniz: ");
        int boyut = scan.nextInt();
        int[] arr = new int[boyut];
        for (int i = 0; i < boyut; i++) {
            System.out.println(i + 1 + ". elemani giriniz = ");
            arr[i] = scan.nextInt();
        }
        int max=Arrays.stream(arr).reduce(arr[0],Integer::max);
        int min=Arrays.stream(arr).reduce(arr[0],Integer::min);
        System.out.println("Max eleman ile min eleman farki : "+(max-min));    }
}
