package j03_ScannerClass_TypeCasting.tasks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        /*
         * TASK->
         *
         * Kullaniciya gunde kac saat uyudugunu alıp ayda yilda ve 40 yilda kac gununun uykuda
         * gectigini print eden code create ediniz
         *
         * Ornek : Input : 8
         *         Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Gunde kac saat uyuyorsunuz?: ");
        double saat = scan.nextDouble();

        int ayda = (int)(saat * 30)/24;
        int yilda = (int) ((saat * 365)/24);
        int kirkYilda = (int) ((saat * 365 * 40)/24);

        System.out.println("Ayda " + ayda + ", yilda " + yilda + ", kirk yilda " + kirkYilda + " gununuz uykuda geciyor.");


    }
}
