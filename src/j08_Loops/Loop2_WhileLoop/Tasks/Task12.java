package j08_Loops.Loop2_WhileLoop.Tasks;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
		/*
		 task->girilen bir metinde harf, rakam ve özel karakter sayısını ayri ayri print eden code create ediniz.
		do-While loop
		 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string");
        String str = scanner.nextLine().replace(" ", "");

        int countLetter = 0;
        int countNumber = 0;
        int countSpecial = 0;
        int index = 0;

        do {
            if (str.isEmpty()) {
                System.out.println("Please enter a string");
            } else if (Character.isDigit(str.charAt(index))) {
                countNumber++;
            } else if (Character.isLetter(str.charAt(index))) {
                countLetter++;
            } else {
                countSpecial++;
            }
            index++;
        } while (index < str.length());
        System.out.println("countNumber = " + countNumber);
        System.out.println("countLetter = " + countLetter);
        System.out.println("countSpecial = " + countSpecial);
    }
}
