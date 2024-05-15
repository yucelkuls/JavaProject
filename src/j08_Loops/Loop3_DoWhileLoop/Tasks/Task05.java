package j08_Loops.Loop3_DoWhileLoop.Tasks;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {

        //task-> Girilen ismin ilk harfinin buyuk olmasını kontrol eden code create ediniz.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a name: ");
        char firstChar = scanner.next().charAt(0);

        do {
            if (Character.isUpperCase(firstChar)) {
                break;
            } else {
                System.out.println("Please enter again: ");
                firstChar = scanner.next().charAt(0);
            }
        } while (!Character.isUpperCase(firstChar));
        System.out.println("The first letter is capital");


    }
}
