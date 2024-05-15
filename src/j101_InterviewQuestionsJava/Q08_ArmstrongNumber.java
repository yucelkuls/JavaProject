package j101_InterviewQuestionsJava;

import java.util.Scanner;

public class Q08_ArmstrongNumber {
    /*  soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
        Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
            (0, 1, 153, 370, 371, 407)
            153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
            370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

          */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int num = input.nextInt();
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
        //  sum += (int) Math.pow(num % 10, 3)   boyle yazarsak digit tanimlamaya gerek yok.
            temp /= 10;
        }
        if (num == sum) {
            System.out.println(num + " Armstrong sayi");
        } else {
            System.out.println(num + " Armstrong sayi degildir.");
        }
    }
}
