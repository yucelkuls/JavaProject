package j08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task36 {

    public static void main(String[] args) {
	//  Java ile girilen sayının harmonik serisini bulan program yazacağız.

        Scanner scan = new Scanner(System.in);
        System.out.print("bir sayı giriniz: ");
        int num = scan.nextInt();

        double toplam = 0.0;

        for (int i = 1; i <= num; i++) {
            toplam += 1.0 / i;
        } System.out.println(toplam + " ");

        // Harmonik seri, bir sayının kendisi dahil olmak üzere kendisinden küçük olan
        // tüm pozitif tam sayıların terslerinin toplamıdır.
        // Örneğin, 4’ün harmonik serisi 1 + 1/2 + 1/3 + 1/4 = 2.0833’tür.
    }
}
