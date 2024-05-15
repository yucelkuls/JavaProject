package j101_InterviewQuestionsJava;

import java.util.Scanner;

public class Q21_CountFactors {
    /* Task->
      Type java code by using while loop,
     Write a program to count the factors of an integer which is entered by user.
     Girilen sayının pozitif tam bolen sayısını print eden code create ediniz.
     Factors of 12 = 1, 2, 3, 4, 6, 12 ==> 6
     Factors of 8  = 1, 2, 4, 8 ==> 4
*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int num = scan.nextInt();
        int count = 0;
        int divide = 1;
        while (num >= divide) {
            if (num % divide == 0) {
                count++;
                System.out.print(divide + " ");
            }
            divide++;
        }
        System.out.println();
        System.out.println(num + " sayisinin "+count+ " adet boleni vardir");
     }
}
