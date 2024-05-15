package j05_ifStatementTernaryOperator.Tasks;

import java.util.Scanner;

public class Task24 { public static void main(String[] args) {
        /*
        *Java ile gidilen kilometre verisine göre taksimetre tutarını  print eden code create ediniz.
        *Taksimetre kilometre başına 2.20 TL tutmaktadır.
        *Kısa mesafe tutarı 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir.
         */
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a distance");
    double distance = scan.nextDouble();
    double priceKm = 2.20;
    int start = 10;
    int shortDistance = 20;
    double totalPrice = (distance * priceKm) + start;

    if (distance > 0) {
        if (totalPrice < 20) {
            System.out.println("The short-distance fee is: " + shortDistance + "$");
        } else if (totalPrice >= 20) {
            System.out.println("Total price is: " + totalPrice + "$");
        }
    } else {
        System.out.println("Invalid input");
    }
}
}
