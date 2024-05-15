package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
        /*Task->
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter vize1 : ");
        double vize1 = scan.nextInt();
        System.out.println("Enter vize2 : ");
        double vize2 = scan.nextInt();
        System.out.println("Enter final : ");
        double finalNot = scan.nextInt();

        System.out.println("Ortalama : " + (vize1 * 0.3 + vize2 * 0.3 + finalNot * 0.7));


    }
}
