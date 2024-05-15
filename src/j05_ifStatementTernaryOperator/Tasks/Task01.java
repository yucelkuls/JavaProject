package j05_ifStatementTernaryOperator.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /*
         Task->
         Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu asagidaki tabloya gore print eden code create ediniz.
        0 - 4 => bebek
        5 - 12 => cocuk
        13 - 20 => genc
        21 - 30 => yetiskin
        Tanimlanmamis evre
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = input.nextInt();

        if (age > 30) {
            System.out.println("Tanimlanmamis evre");
        }else if (age > 20) {
            System.out.println("Yetiskin");
        }else if (age > 12){
            System.out.println("Genc");
        }else if (age > 4){
            System.out.println("Cocuk");
        }else if (age >= 0){
            System.out.println("Bebek");
        }else {
            System.out.println("Hatali giris!");
        }

    }
}