package j05_ifStatementTernaryOperator.Tasks;


import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {
        /*
        Task01
           girilen bir sayının negatif ve pozitifliğini kontrol eden code create ediniz..
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int myNum = scan.nextInt();

        if (myNum < 0) System.out.println("The number is negative!");
        else if (myNum > 0) {
            System.out.println("The number is positive!");
        }else System.out.println("The number is zero!");



    }
}
