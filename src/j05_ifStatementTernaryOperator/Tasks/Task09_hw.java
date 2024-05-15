package j05_ifStatementTernaryOperator.Tasks;


import java.util.Scanner;

public class Task09_hw {

    public static void main(String[] args) {
        /*
        Task01
           girilen bir sayının negatif ve pozitifliğini kontrol eden code create ediniz..
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi = input.nextInt();
        if (sayi < 0) System.out.println(sayi + " sayisi NEGATIFTIR");
        else if (sayi > 0) System.out.println(sayi + " sayisi POZITIFTIR");
        else System.out.println(sayi + " sayisi NOTR'dur");

    }
}
