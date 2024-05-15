package j09_Break_Continue;

import java.util.Scanner;

public class C03_AsalControl {
    public static void main(String[] args) {
//task-> girilen tamsayının asal olmasını kontrol eden code create ediniz
//asal tamsayı: 1 ve kendisinden başka tam böleni olmayan sayılar->asil bölünemeyen sayı

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scanner.nextInt();
        boolean prime = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }
        System.out.println(prime ? number + " is a prime number" : number + " is not a prime number");
    }
}
