package j08_Loops.Loop3_DoWhileLoop;

import java.util.Scanner;

public class C02_DoWhileLoop {
    public static void main(String[] args) {

        // task-> girilen sayı 13 den kucuk ise "olaaa kazandınız :) " değilse sayı girişi isteyen code create ediniz...

        Scanner scanner = new Scanner(System.in);

        int number;

        do {
            System.out.println("Please enter a number");
            number = scanner.nextInt();

        }while (number >= 13);
        System.out.println("olaaa kazandınız :)");


    }
}
