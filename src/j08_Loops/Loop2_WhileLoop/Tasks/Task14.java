package j08_Loops.Loop2_WhileLoop.Tasks;

import java.util.Scanner;

public class Task14 {

    //Task-> Girilen iki sayının EBOB ve EKOK değerlerini "While Döngüsü" prnt eden code create ediniz.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1 = scanner.nextInt();
        System.out.println("Please enter second number");
        int num2 = scanner.nextInt();
        int ebob = 1;
        int i = 1;
        while (i <= num1 && i <= num2) {
            if (num1 % i == 0 && num2 % i == 0) {
                ebob = i;
            }
            i++;
        }
        int ekok = (num1 * num2) / ebob;
        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }
}
