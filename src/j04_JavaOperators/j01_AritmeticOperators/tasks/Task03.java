package j04_JavaOperators.j01_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {

        /* Task->
         * Kullanicinin girdigi 3 basamakli sayinin ilk ve son rakamlarinin toplamini veren programi yaziniz.
         */

        Scanner dp = new Scanner(System.in);
        System.out.println("Uc basamakli bir sayi giriniz: ");
        int myNum = dp.nextInt();
        int birler = myNum % 10;
        int yuzler = myNum / 100;

        System.out.println("Toplam = "+ (birler + yuzler));


    }

}
