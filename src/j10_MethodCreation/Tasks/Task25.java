package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {

    //task-> girilen sayını faktoriyelini print eden METHOD create ediniz
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=input.nextInt();

        factorial(number);

    }

    private static void factorial(int num) {
        int fac = 1;
        for (int i = 1; i <= num ; i++) {
            fac *= i;
        }
        System.out.println(num+ "! = " + fac);
    }
}
