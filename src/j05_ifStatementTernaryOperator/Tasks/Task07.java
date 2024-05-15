package j05_ifStatementTernaryOperator.Tasks;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {
		/* Task->
		 Kullanıcıdan bir harf girmesini isteyin.
Girdiği küçük harf ise harfin “a” olup olmadığını kontrol edin. Harf “a” ise ekrana “Ilk küçük harf” yazdırın.
“a” değil ise ekrana “Ilk küçük harf değil” yazdırın.
Girdiği büyük harf ise harfin “Z” olup olmadığını kontrol edin. Harf “Z” ise ekrana “Son büyük harf” yazdırın.
“Z” değil ise ekrana “Son büyük harf değil” yazdırın.
		 */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a letter");
        char letter = sc.next().charAt(0);

        if (letter >= 'a' && letter <= 'z') {
            if (letter == 'a') {
                System.out.println("The first lowercase letter");
            } else System.out.println("It's not the first lowercase letter.");
        } else if (letter >= 'A' && letter <= 'Z') {
            if (letter == 'Z') {
                System.out.println("The last capital letter");
            } else System.out.println("It is not the last capital letter. ..");
        } else System.out.println("It's not a letter.");
    }
}

