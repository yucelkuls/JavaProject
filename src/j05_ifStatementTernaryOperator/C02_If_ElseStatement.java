package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class C02_If_ElseStatement {


    public static void main(String[] args) {

        // task-> girilen yasın 18 den buyulugunu kontrol eden code create ediniz..

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen yaşınızı giriniz : ");
        int yas = scan.nextInt();
        if (yas < 18) {
            System.out.println("Yaşınız 18 den küçüktur.");
        } else System.out.println("Yaşınız 18 den büyüktur.");






    }
}
