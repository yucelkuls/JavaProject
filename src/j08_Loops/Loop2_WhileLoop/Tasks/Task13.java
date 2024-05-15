package j08_Loops.Loop2_WhileLoop.Tasks;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        /*
        task -> x karakteri girilene kadar "javaCAN" x karakteri girildiğinde "javaTAR" print eden code create ediniz.
        do-while lopp
       */
        Scanner scanner = new Scanner(System.in);
        char ch;
        do {
            System.out.println("Please enter a character");
            ch = scanner.next().toLowerCase().charAt(0);
            if (ch != 'x') {
                System.out.println("javaCAN");
            }
        } while (ch != 'x');
        System.out.println("javaTAR");
    }
}
