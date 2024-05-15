package j08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task16 {

    /*
     task-> Girilen sayının asal olmasını kontrol eden code create ediniz.
     * */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scan.nextInt();
        int count = 0;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        System.out.println(count == 0 ? number + " is a prime number." : number + " is not a prime number.");
    }
}

