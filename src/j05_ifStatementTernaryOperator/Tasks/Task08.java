package j05_ifStatementTernaryOperator.Tasks;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
		/* Task->
		 Kullanıcıdan password girmesini isteyin.
Girdiği password 5’e bölünüyorsa son rakamını kontrol edin. Son rakamı 0 ise ekrana “5’e bölünen çift sayı” yazdırın.
Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.
		 */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a password");
        int password = sc.nextInt();
        int ones = password % 10;

        if (password % 5 == 0) {
            if (ones == 0) System.out.println("An even number divisible by 5");
            else {
                System.out.println("An odd number divisible by 5");
            }
        } else System.out.println("Tekrar deneyin");
    }
}
