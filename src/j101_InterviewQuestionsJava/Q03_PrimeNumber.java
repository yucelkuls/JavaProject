package j101_InterviewQuestionsJava;

import java.util.Scanner;

public class Q03_PrimeNumber {
    /* Task->
    Ask user enter a positive number and check if it is prime or not
    Girilen  pozitif bir sayı asal olmasını kontrol eden code create ediniz.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi = input.nextInt();
        boolean isPrime = true;
        if(sayi >= 2) {
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.println(isPrime? sayi + " is a prime number" : sayi + " is not a prime number");
        }else System.out.println("Girilen sayi asal degildir!");
    }
}
