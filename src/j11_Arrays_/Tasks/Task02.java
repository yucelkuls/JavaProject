package j11_Arrays_.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        //task-> girilen int array elemanları toplamını print eden code create ediniz.

        //task-> girilen int array elemanları toplamını print eden code create ediniz.
        Scanner scanner = new Scanner(System.in);
        System.out.println("kaç elemanlı bir array istersin: ");
        int boyut = scanner.nextInt();
        int[] arr = new int[boyut];
        System.out.println("lutfen istediğiniz elemanları giriniz: ");
        int toplam=0;
        for (int i = 0; i < boyut; i++) {
            arr[i] = scanner.nextInt();
            toplam+=arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(toplam);

    }
}
