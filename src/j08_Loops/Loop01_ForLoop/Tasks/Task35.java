package j08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task35 {
    public static void main(String[] args) {

        // verilen sayi adedince fibonacci serisinden sayilar yazdiran bir method olusturun
        // Fibonacci serisi = 0 1 1 2 3 5 8 13 21 34 .........


        Scanner scan = new Scanner(System.in);
        System.out.print("kaç serilik fibonacci istiyorsun: ");
        int fibo = scan.nextInt();
        int sayac = 3;
        int x = 1;
        int y = 1;
        int toplam = 0;

        System.out.print(toplam + " " + x + " " + y + " ");

        for (int i = sayac; i <= fibo; i++) {
            toplam = x + y;
            x = y;
            y = toplam;
            System.out.print(toplam + " ");
        }
    }}


