package j05_ifStatementTernaryOperator.Tasks;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        /*
          TASK -> girilen iki sayiyi seçilen dört işlemden birine uygulayıp sonucu print eden code crate ediniz

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = scan.nextInt();
        System.out.println("Enter second number:");
        int num2 = scan.nextInt();
        System.out.println("""
                Choose an action below:
                for collection +
                for subtraction -
                for multiplication *
                for division /\s""");
        char action = scan.next().charAt(0);
        if (action == '+') System.out.println("num1 + num2 = "+ (num1 + num2));
        if (action == '-') System.out.println("num1 - num2 = "+ (num1 - num2));
        if (action == '*') System.out.println("num1 * num2 = "+ (num1 * num2));
        if (action == '/') System.out.println("num1 / num2 = "+ (num1 / num2));
        else System.out.println("Invalid entry");




    }
}
