package j05_ifStatementTernaryOperator.Tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
		/* Task->
		 Kullanıcıdan cinsiyetini girmesini isteyin.
		Erkek ise yaşını kontrol edin. Yaşı 18 den küçük ise ekrana “Erkek çocuk” yazdırın.
		Yaşı 18 den büyük eşit ise ekrana “Adam” yazdırın.
		Kadin ise yasini kontrol edin. Yaşı 18 den küçük ise ekrana “Kız çocuk” yazdırın.
		Yaşı 18 den büyük eşit ise ekrana “Kadın” yazdırın.
		 */

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your gender: [ Male > M, Female > F ]");
        char gender = scan.next().toUpperCase().charAt(0);

        if (gender == 'M') {
            System.out.println("Enter your age: ");
            int age = scan.nextInt();
            if (age < 18 && age > 0) {
                System.out.println("You are a boy");
            } else if (age >= 18) {
                System.out.println("You are a man");
            } else System.out.println("Invalid entered");
        } else if (gender == 'F') {
            System.out.println("Enter your age: ");
            int age = scan.nextInt();
            if (age < 18 && age > 0) {
                System.out.println("You are a girl");
            } else if (age >= 18) {
                System.out.println("You are a woman");
            } else System.out.println("Invalid entered");
        }else System.out.println("Invalid entered");
    }
}
































