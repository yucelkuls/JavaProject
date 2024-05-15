package j05_ifStatementTernaryOperator.Tasks;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
        /*
          TASK -> girilen bir karakterin harf  olup olmadığını  kontrol eden code create ediniz..

         */
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a character: ");
        char character = input.next().charAt(0);

        if (Character.isLetter(character)) System.out.println("This character is a letter");
        else System.out.println("This character is not a letter");
    }
}
