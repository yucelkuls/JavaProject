package j99_codeChallange.Challange06;

import java.util.Scanner;

public class Task08_AsalKontrol {
    /*
 Task->
  Girilen sayının asal olup olmadığını kontrol eden code create ediniz.
   */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int num = input.nextInt();
        boolean isPrime = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime ? " is a prime number": "is not a prime number" );

        int bolen = 2;
        while (num > bolen) {
            if (num % bolen == 0) {
                isPrime = false;
                break;
            }
            bolen++;
        }
        System.out.println(isPrime ? " is a prime number": "is not a prime number" );

    }
}
