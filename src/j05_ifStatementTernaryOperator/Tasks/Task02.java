package j05_ifStatementTernaryOperator.Tasks;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
		/*
		Task->
		Kullanıcıdan bir üçgenin  üç kenar uzunluğunu alın eğer üç kenar uzunluğu birbirine eşit ise ekrana
		“Eşkenar üçgen" yazdırın. Sadece iki kenar uzunluğu birbirine eşit ise ekrana “Ikizkenar üçgen"
		yazdırın. Tüm kenar uzunlukları birbirinden farklı ise “Çeşitkenar üçgen" print eden code create ediniz.
		 
		 */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the first side of the triangle.");
        double a = scanner.nextDouble();
        System.out.println("Enter the length of the second side of the triangle.");
        double b = scanner.nextDouble();
        System.out.println("Enter the length of the third side of the triangle.");
        double c = scanner.nextDouble();

        if (a > 0 && b > 0 && c > 0) {
            if (a == b && b == c) {
                System.out.println("The triangle is equilateral.");
            } else if (a == b || b == c || c == a) {
                System.out.println("The triangle is isosceles.");
            } else System.out.println("The triangle is scalene.");
        } else System.out.println("Please enter a positive value for each side of the triangle.");
    }
}
