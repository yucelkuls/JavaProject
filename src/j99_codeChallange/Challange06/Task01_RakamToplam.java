package j99_codeChallange.Challange06;

import java.util.Scanner;

public class Task01_RakamToplam {
    // Task-> girilen sayının basamaklarındaki rakamların toplamını print eden code create ediniz.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();
        int sumNumber = 0;

        while (number > 0) {
            sumNumber += number % 10;
            number /= 10;
        }
        System.out.println("sumNumber = " + sumNumber);


    }// main sonu
}// Class sonu

