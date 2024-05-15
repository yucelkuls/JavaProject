package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class C05_NestedTernaryOperator {
    public static void main(String[] args) {

        /*
TASK :
Girilen sayi 0 dan buyuk esit ise 10 dan kucukluğunu kontrol ediniz.
10 dan kucuk ise  "Rakam" degilse "Pozitif Sayi" ,
Sayi 0'dan kucuk ise  "Negatif Sayi" print eden code create ediniz
 */
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        int num =scan.nextInt();
        System.out.println(num >= 0? (num < 10? "Rakam" : "Pozitif Sayi") :"Negatif Sayi");


    }
}
