package j08_Loops.Loop2_WhileLoop.Tasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // task ->  Girilen bir sayıya kadar  olan tek sayıları print eden code create ediniz.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scanner.nextInt();

        int count = 1;

        while (count <= number){
            System.out.print(count%2==1? count + " ": "");
            count++;
        }
    }
}
