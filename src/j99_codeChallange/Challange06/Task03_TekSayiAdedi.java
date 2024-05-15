package j99_codeChallange.Challange06;

import java.util.Scanner;

public class Task03_TekSayiAdedi {

    /* Task->
    Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ve adedini print eden code create ediniz.

   */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("count = " + count);
    }
}
