package j08_Loops.Loop2_WhileLoop.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while lopp
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int first = scanner.nextInt();
        System.out.println("Please enter another number");
        int second = scanner.nextInt();

        for (int i = (first < second ? first : second) + 1; i < (first > second ? first : second); i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("**** While Loop ****");

        int i = (first < second ? first : second) + 1;
        while (i < (first > second ? first : second)) {
            System.out.print(i + " ");
            i++;
        }
    }
}
