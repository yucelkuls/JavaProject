package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class C04_TernaryOperator {
    public static void main(String[] args) {

        // Task -> girilen bir tamsayının 2 veya daha fazla basamaklı olmasını kontrol eden code create ediniz.

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        int num =scan.nextInt();
        System.out.println((num < 10 && num > -10)? num + " sayisi bir basamaklidir": num + " sayisi iki veya daha fazla basamaklidir");
    }
}
