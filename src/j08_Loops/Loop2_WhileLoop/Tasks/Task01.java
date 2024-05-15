package j08_Loops.Loop2_WhileLoop.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // task-> Girilen sayıların toplamı 333'ü geçtiğinde girilen sayı adetini ve toplamını print eden code create edinz

        Scanner sc = new Scanner(System.in);
        int total = 0;
        int count = 0;

        while (total < 333) {
            System.out.println("Please enter a number: ");
            int number = sc.nextInt();
            total += number;
            count++;
        }
        System.out.println(count + " numbers were entered and their total is " + total);


    }
}
