package j101_InterviewQuestionsJava;

import java.util.Scanner;

public class Q09_ArmstrongNumber_4Digits {
   /*
    Armstrong sayi:herhangi bir sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
        (0, 1, 153, 370, 371, 407, 1634)
        153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
        370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
        1634 = 1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1634

        5 basamakli : 54748
         soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
         gösteren program yazınız*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a number: ");
        int n = sc.nextInt();
//        int digit = String.valueOf(n).length(); 2.meth basamak sayisini bulma

        for (int i = 1; i <= n; i++) {
            int digit = (int) Math.floor(Math.log10(i) + 1);  //  1.meth basamak sayisini bulma
            int total = 0;
            int temp = i;
            while (temp > 0) {
                total += (int) Math.pow(temp % 10, digit);
                temp/= 10;
            }
            System.out.println(i == total ? i + " is armstrong": i + " is not armstrong");
        }



    }//main sonu

}//Class sonu