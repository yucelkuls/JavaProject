package j04_JavaOperators.j01_AritmeticOperators.tasks;

import java.util.Scanner;

public class _02_ArithmeticOperator_sum2 {

    public static void main(String[] args) {

     /*   Verilen 4 tane int vardır.
        Int'lerin toplamlarını yazdırın  */
        Scanner dp = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = dp.nextInt();
        System.out.println("Enter second number: ");
        int num2 = dp.nextInt();
        System.out.println("Enter third number: ");
        int num3 = dp.nextInt();
        System.out.println("Enter fourth number: ");
        int num4 = dp.nextInt();

        //Kodu aşağıya yazınız.

        System.out.println("Toplam = " + (num1 + num2 + num3 + num4));




    }
}
