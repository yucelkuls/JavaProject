package j99_codeChallange;

import java.util.Scanner;

public class Task05_Nested_Ternary {

    /* Task ->
            0 ~ 9 arasındaki sayilari ENG translate eden  code create ediniz.
    sayı 9'dan buyuk veya sifirdan kucukse, "Gecersiz" print ediniz.
    NestedIf ve Ternary kullanarak 2 yolla da cozunuz
    */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Agam hele sayi giresen : ");
        int sayi = input.nextInt();
        System.out.println(sayi == 0 ? "Zero" :
                sayi == 1 ? "One" :
                        sayi == 2 ? "Two" :
                                sayi == 3 ? "Three" :
                                        sayi == 4 ? "Four" :
                                                sayi == 5 ? "Five" :
                                                        sayi == 6 ? "Six" :
                                                              sayi == 7 ? "Seven" :
                                                                        sayi == 8 ? "Eight" :
                                                                                sayi == 9 ? "Nine" : "Gecersiz");

        String result = sayi == 0 ? "Zero" :
                sayi == 1 ? "One" :
                        sayi == 2 ? "Two" :
                                sayi == 3 ? "Three" :
                                        sayi == 4 ? "Four" :
                                                sayi == 5 ? "Five" :
                                                        sayi == 6 ? "Six" :
                                                                sayi == 7 ? "Seven" :
                                                                        sayi == 8 ? "Eight" :
                                                                                sayi == 9 ? "Nine" : "Gecersiz";
        System.out.println("result = " + result);

    }
}
