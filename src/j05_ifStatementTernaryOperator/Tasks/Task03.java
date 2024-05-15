package j05_ifStatementTernaryOperator.Tasks;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {
		/*
		Task->
		 Kullanıcıdan bir yıl alın eğer yıl 1000’e bulunuyorsa ekrana “Milenyum"
		Eğer yıl 100’e bulunuyorsa ekrana “Yüzyıl"
		Eğer yıl 10’a bulunuyorsa ekrana “Onyıl" print eden code create ediniz.
		 */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        if (year > 0) {
            if (year % 1000 == 0) {
                System.out.println("Milenyum");
            } else if (year % 100 == 0) {
                System.out.println("Yüzyıl");
            } else if (year % 10 == 0) {
                System.out.println("Onyıl");
            } else System.out.println("Girdiginiz yil 10 ve/veya katlari degildir!");
        } else System.out.println("Please enter a positive value for the year.");
    }
}

	

