package j05_ifStatementTernaryOperator.Tasks;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        /* Task->
         Girilen bir sayı için

		 Eger sayi pozitif ise; 10dan buyuk olup olmadigini kontrol edin
		 Eger 10 dan buyuk ise "Buyuksun!" yazdirin
		 Eger 10 dan kucuk ise "Normalsin!" yazdirin

		 Eger sayi pozitif degil ise; -10dan buyuk olup olmadigini kontrol edin
		 Eger -10 dan buyuk ise "Negatifsin!" yazdirin
		 Eger -10 dan kucuk ise "Cok Negatifsin!" yazdirin
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = input.nextInt();
        if (number > 0) {
            if (number > 10) System.out.println("GREAT!");
            else System.out.println("Normal");
        } else if (number < 0) {
            if (number > -10) System.out.println("Negative");
            else System.out.println("So Negative");
        } else System.out.println("ZERO!");


    }
}
