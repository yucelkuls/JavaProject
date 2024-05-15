package j04_JavaOperators.j01_AritmeticOperators.tasks;

import java.util.Scanner;

public class _04_ArithmeticOperator_subtract2 {

    public static void main(String[] args) {

        /*
        Verilen 4 tane int (num 1, num2 , num3 , num4),
        Int'leri birbirinden çıkarın.
        Sonucu yazdırın.
        Örneğin;
        num1 = 90
        num2 = 40
        num3 = 10
        num4 = 10
        Sonuc 30 olmalı.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter third number: ");
        int num3 = scanner.nextInt();
        System.out.println("Enter fourth number: ");
        int num4 = scanner.nextInt();

        System.out.println("Fark = " + (num1 - num2 - num3 - num4));

    }
}
