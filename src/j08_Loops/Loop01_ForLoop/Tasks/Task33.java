package j08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task33 {
    /*
        Bir sayinin mükemmel olup olmadiğini bulan bir program yaziniz.
        Mükemmel sayi : bir sayinin kendisi hariç bölenlerinin toplamı, kendisine eşitse o sayi mükemmeldir.
        ORNEK:
        INPUT     : 6
        OUTPUT : 1,2,3
                      1+2+3 = 6 = 6 (Mükemmel)



        */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir tamsayı giriniz: ");
        int sayi = scan.nextInt();
        int toplam = 0;

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
                if (toplam == sayi) System.out.println(i);
                else System.out.print(i + ", ");
            }
        }
        if (toplam == sayi) {
            System.out.println();
            System.out.println(sayi + " sayısı mükemmel sayıdır.");
        } else System.out.println(sayi + " sayısı mükemmel sayı değildir.");

    }
}
