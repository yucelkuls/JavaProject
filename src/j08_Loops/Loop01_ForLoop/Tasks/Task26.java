package j08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        //task -> verilen bir tam sayinin rakamlari toplamini print eden code create ediniz

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = input.nextInt();
        int total = 0;
        for (int i = number; i > 0; i/=10) {
            total += i % 10;
        }
        System.out.println(total);
    }
}
