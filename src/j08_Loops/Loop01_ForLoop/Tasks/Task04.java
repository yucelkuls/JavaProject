package j08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
        // task-> girilen iki tamsayı arasındaki çift sayıları print eden code create ediniz... 10     20

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int first = input.nextInt();
        System.out.println("Enter second number");
        int second = input.nextInt();

        if (first < second) {
            for (int i = first + 1 ; i < second; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            for (int i = second + 1; i < first; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }// for (int i = (first < second ? first : second); i <= (first > second ? first :second); i++) {
    //      if ( i % 2 == 0) {
    //          System.out.print(i + " ");
    //      }
}
