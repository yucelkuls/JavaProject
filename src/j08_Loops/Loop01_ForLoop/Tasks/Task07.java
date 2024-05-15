package j08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        /*
        Task ->
        girilen boyuttta bir kare için
         Ekran Çıktısı
            Bir sayı giriniz: 7
            1 0 0 0 0 0 0
            0 1 0 0 0 0 0
            0 0 1 0 0 0 0
            0 0 0 1 0 0 0
            0 0 0 0 1 0 0
            0 0 0 0 0 1 0
            0 0 0 0 0 0 1


            Bir sayi giriniz: 5
            1 0 0 0 0
            0 1 0 0 0
            0 0 1 0 0
            0 0 0 1 0
            0 0 0 0 1

            şekli print eden code create ediniz
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = input.nextInt();

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number ; j++) {
                if (j == i) {
                    System.out.print("1 ");
                }else {                       // ternary if else yerine  i==j ? 1 : 0  tek satirda
                    System.out.print("0 ");
                }
            }System.out.println();
        }


        // 2. YOL
        System.out.println("**** Ternary ****");
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print(i==j ? "1 " : "0 ");
            }
            System.out.println();
        }
    }}