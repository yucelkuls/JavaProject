package j08_Loops.Loop3_DoWhileLoop.Tasks;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
        //Task-> girilen baslangic ve bitis karakterleri dahil
        // aradaki tum karakterleri pirnt eden code create ediniz
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a starting character");
        char start = input.next().charAt(0);
        System.out.println("Please enter an ending character");
        char end = input.next().charAt(0);

        do {
            System.out.print(start + " ");
            start++;
        }
        while (start <= end);
    }
}
