package j08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
/*
        task-> girilen boyutta kare çarpım tablosu print eden code create ediniz
          Örnek Ekran çıktısı
       1  2  3  4  5
       2  4  6  8 10
       3  6  9 12 15
       4  8 12 16 20
       5 10 15 20 25

       5x5
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();

        for (int kat = 1; kat <= number; kat++) {
            for (int daire = 1; daire <= number; daire++) {
                System.out.print(kat * daire + "\t");
            }
            System.out.println();

        }
    }
}
