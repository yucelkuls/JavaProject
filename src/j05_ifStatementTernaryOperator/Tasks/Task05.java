package j05_ifStatementTernaryOperator.Tasks;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {
		/* Task->
		 Girilen bir sayı için
		 sayi 3 basamakli ise console ' a "3 basamakli"
		 sayi 2 basamakli ise console'a "2 basamakli"
		 sayi 3 basamakli yada 2 basamakli degilse "ikisi de degil"  print eden code create ediniz
		 */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        if ((number > 99 && number < 1000) || (number < -99 && number > -1000)) {
            System.out.println("The number " + number + " is three digits.");
        } else if ((number > 9 && number < 100) || (number < -9 && number > -100)) {
            System.out.println("The number " + number + " is two digits.");
        } else System.out.println("The number " + number + " is not three or two digits.");

    }
}
