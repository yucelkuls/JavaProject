package j08_Loops.Loop2_WhileLoop.Tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /*
    task -> 0 (sıfır) girilene kadar girilen tum sayıların adedini ve toplamını print eden code create edinz.
    */
        Scanner scanner = new Scanner(System.in);
        int count = 0, sum = 0, number;
        while (true) {
            System.out.println("Please enter a number");
            number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            sum += number;
            count++;
        }
        System.out.println("Entered number : " + count + " Total : " + sum);
    }
}
