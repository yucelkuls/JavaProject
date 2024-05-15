package j11_Arrays_.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //Task-> girilen bir int array elemanlarını buyukten kucuge  print eden code create ediniz.

        Scanner scanner = new Scanner(System.in);
        System.out.println("kaç elemanlı bir array istersin: ");
        int arrayLength = scanner.nextInt();
        int[] arr = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            System.out.println("lutfen "+ (i+1) + ". elemani giriniz: ");
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int [] buyuktenKucuk = new int [arr.length];
        int index = 0;
        for (int i = arrayLength-1 ; i >=0 ; i--) {
            buyuktenKucuk[index] += arr[i];
            index++;
        }
        System.out.println(Arrays.toString(buyuktenKucuk));
    }
}
