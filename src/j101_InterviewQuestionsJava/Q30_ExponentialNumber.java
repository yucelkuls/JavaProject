package j101_InterviewQuestionsJava;

import java.util.Scanner;

public class Q30_ExponentialNumber {
    //Task->
    // Get 2 numbers from the user.
    //first number base
    //second number Top
    //Write a code that calculates the prime of a number.
    // Girilen taban ve us değerleri için sayının kuvvetini print eden code create ediniz.
    // 2, 3 --> 2^3 = 2*2*2= 8

    // 4, 3 --> 4^3= 4*4*4 = 64
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter base number : ");
        int base = input.nextInt();
        System.out.println("Please enter top number : ");
        int top = input.nextInt();

        int total = 1;

        for (int i = 0; i < top; i++) {
            total *= base;
        }
        System.out.println(base + "'in "+top+ ". kuvveti = "+ total);
    }
}
