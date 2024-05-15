package j08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {

        // task-> girilen  bir char karakterden sonra gelen 10 karakteri print eden code create ediniz

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a character");
        char character = scanner.next().charAt(0);
        for (int i = character + 1 ; i <= character + 10; i++) {
            System.out.print((char) i + " ");
        }


    }
}
