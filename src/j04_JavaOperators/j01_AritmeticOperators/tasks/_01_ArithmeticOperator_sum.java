package j04_JavaOperators.j01_AritmeticOperators.tasks;

import java.util.Scanner;

public class _01_ArithmeticOperator_sum {
    public static void main(String[] args) {

    /*    Verilen iki tane int  (num1 , num2),
        Bu iki Integer'in toplamını yazdırın. */

        Scanner dp = new Scanner(System.in);

        //Kodu aşağıya yazınız.

        System.out.println("Enter first number: ");
        int num1 = dp.nextInt();
        System.out.println("Enter second number: ");
        int num2 = dp.nextInt();


        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println(num1 + num2);



    }
}
