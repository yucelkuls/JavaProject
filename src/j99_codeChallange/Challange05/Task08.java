package j99_codeChallange.Challange05;

import java.util.Scanner;

public class Task08 {


    /*
    Task-> Girilen iki tamsayı arasındaki sayıların toplamını print eden code create ediniz.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1 = input.nextInt();
        System.out.println("Please enter second number");
        int num2 = input.nextInt();
        int total = 0;

        for (int i = (num1 > num2 ? num2 : num1); i <= (num1 > num2 ? num1 : num2); i++) {
            if (num1 != num2) {
                total += i;
            } else System.out.println("Numbers are equal");
        }
        System.out.println(total);
    }
}
