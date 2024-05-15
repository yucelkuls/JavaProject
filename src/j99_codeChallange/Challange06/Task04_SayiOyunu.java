package j99_codeChallange.Challange06;

import java.util.Scanner;

public class Task04_SayiOyunu {

    /*
    Task->Girilen sayıların toplamını print eden ve girilen sayı toplamı 100'den buyuk ise
    girilen sayı adetini print eden code create ediniz.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();
        int sumNumber = 0;
        int count = 0;

        while(sumNumber <= 100){
            count++;
            sumNumber += number;
            }
        System.out.println("count = " + count);
        System.out.println("sumNumber = " + sumNumber);
    }







    }

