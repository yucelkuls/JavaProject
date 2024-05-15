package j05_ifStatementTernaryOperator.Tasks;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
		/*Task->
		 Kullanicidan bir character alin.
		 Bu character buyuk harf ise "Buyuk Harf"
		 Bu character kucuk harf ise "Kucuk Harf"
		 Bu character harf degil ise "Harf Degil"  print eden code create ediniz.
		*/


		/*
		 Logical Operator (Mantik Islemleri)
		 1) And Islemi : Sembolu & veya && dir.&& sembolu daha hizli calisir.Bu yuzden genellikle && kullaniriz
		 						true && true = true
		 						true && false = false
		 						false && true = false
		 						false && false = false
		 2)Or Islemi : Sembolu || dir
		 						true || false = true
		 						true || true = true
		 						false || true = true
		 						false || false = false
		 3)Not Islemi : Sembolu !'dir
		 						!true = false
		 						!false = true

		 */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char character = input.next().charAt(0);
        if (character >= 'A' && character <= 'Z') {
            System.out.println("Buyuk Harf");
        } else if (character >= 'a' && character <= 'z') {
            System.out.println("Kucuk Harf");
        } else System.out.println("Harf Degil");

    }

}
