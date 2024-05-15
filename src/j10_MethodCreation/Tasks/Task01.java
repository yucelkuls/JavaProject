package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //task-> girilen iki sayının eşitliğini control eden METHOD create ediniz

        isEqualNumber();
        controlNum(5,4);

    }//main sonu

    private static void controlNum(int num1, int num2) {
        System.out.println(num1==num2 ? num1 + " is equal to " + num2 : num1 + " is not equal to " + num2);
    }

    private static void isEqualNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first number");
        int a = scan.nextInt();
        System.out.println("Please enter second number");
        int b = scan.nextInt();
        if (a == b) {
            System.out.println(a + " is equal to " + b);
        } else {
            System.out.println(a + " is not equal to " + b);
        }

    }

}//class sonu
