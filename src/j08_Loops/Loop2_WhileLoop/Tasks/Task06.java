package j08_Loops.Loop2_WhileLoop.Tasks;

import java.util.Random;
import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
        /*
        1 ile 100    sayi arasındaki  pc'nin atadığı tamsayıyı kullanıcıya  tahmin ettirip
        tahmin sayısını print eden  code create ediniz.
         */


        Scanner input = new Scanner(System.in);
        int random = (int) (Math.random() * 100) + 1;
        int userGuess = 0;
        int count = 0;

        while (userGuess != random) {
            System.out.println("Guess the number between 1 and 100");
            userGuess = input.nextInt();
            if (userGuess < random) {
                System.out.println("Too low");
            } else if (userGuess > random) {
                System.out.println("Too high");
            } else {
                System.out.println("You got it!");
            }
            count++;
        }
        System.out.println("You have tried " + count + " times!");
    }
}
