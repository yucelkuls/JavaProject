package j101_InterviewQuestionsJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Q10_FibonacciListNumber {

    /* Task-!
     Girilen bir tamsayı kadar FIBONACCI dizisini print eden code create ediniz.
     1-1-2-3-5-8-13-21-34....
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter a number for the fibonacci sequence:");
        int n = scanner.nextInt();

        int a = 0, b = 1;

        for (int i = 0; i < n; ++i) {
            System.out.print(a + " ");

            int next = a + b;
            a = b;
            b = next;
        }
    }
}
