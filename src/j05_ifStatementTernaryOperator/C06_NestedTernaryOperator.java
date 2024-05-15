package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class C06_NestedTernaryOperator {
    public static void main(String[] args) {

        /*
TASK :
Girilen bir pozitif tamsayı  4 basamaklı ise  "4 Basamaklı"
degilse çift olup olmadigini kontrol edip. Çift ise "4 basamaklı olmayan çift sayı"
degilse "4 basamaklı olmayan tek sayı"  print eden code create ediniz.
 */
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        int num =Math.abs(scan.nextInt());
        System.out.println(num > 999 && num < 10000? num + " sayisi 4 basamaklıdir." :
                (num % 2 == 0 ? num + " sayisi 4 basamaklı olmayan cift sayı" : num + " sayisi 4 basamaklı olmayan tek sayı"));

    }
}
