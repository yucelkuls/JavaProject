package j08_Loops.Loop3_DoWhileLoop.Tasks;

import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {
  /*
  Task-> Girilen sayıyı 0 olmadıgı sürece girilen sayıların toplamını print eden code create ediniz.
   */

        Scanner input = new Scanner(System.in);
        int number;
        int sum = 0;
        do {
            System.out.println("Please enter a number");
            number = input.nextInt();
            System.out.println("The current total = " + (sum += number));
        } while (number != 0);
        System.out.println("The final total = " + sum);












    }
}
