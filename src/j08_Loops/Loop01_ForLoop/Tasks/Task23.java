package j08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {

    /*  task-> girilen tam sayıya kadar olan sayıların karelerinin toplamını
         print eden code create ediniz.


        Girilen sayı=4
        Kareler toplamı=30
     */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = input.nextInt();
        int total = 0;

        for (int i = 1; i <= number; i++) {
            total += (int) Math.pow(i, 2);
        }
        System.out.println("Total: " + total);
    }
}
