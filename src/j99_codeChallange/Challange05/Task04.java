package j99_codeChallange.Challange05;

import java.util.Scanner;

public class Task04 {
   /* task-> girilen sayıdan 1'e kadar olan tamsıyalrın karelerinin toplamını print eden code create ediniz..
	    Örnek Ekran Çıktısı
	    Girilen sayı=4               1 -> 1  2-> 4  3->9
	    Kareler toplamı=14
	     */


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = input.nextInt();
        int square = 0;
        for (int i = number; i >= 1; i--) {
            square += i * i;
        }
        System.out.println("square = " + square);


    }// main sonu
}// class sonu

