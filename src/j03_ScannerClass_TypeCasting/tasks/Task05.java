package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {


        // Task-> kullanicidan 2 tam sayinın  dort islem sonucunu print eden code create ediniz.

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int firstNumber = scan.nextInt();
        System.out.println("Enter second number : ");
        int secondNumber = scan.nextInt();

        System.out.println("Addition : " + (firstNumber + secondNumber));
        System.out.println("Substraction : " + (firstNumber - secondNumber));
        System.out.println("Multiplication : " + (firstNumber * secondNumber));
        System.out.println("Division : " + (firstNumber / secondNumber));



    }

}
