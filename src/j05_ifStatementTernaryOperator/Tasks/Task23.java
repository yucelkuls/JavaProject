package j05_ifStatementTernaryOperator.Tasks;

import java.util.Scanner;

public class Task23 {


    public static void main(String[] args) {
        /*
            Bir sayinin mutlak degerini hesaplamak icin ternary operatoru kullanarak kod yaziniz.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();

        System.out.println(number > 0? number : number* -1);


    }

}
