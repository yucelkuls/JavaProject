package j08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        /* task ->
        girilen bir ifadenin istenen harf sayısını print eden code create ediniz

        input : selam javaCAN'lar
        output : a sayısı :4
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.nextLine();
        System.out.println("How many of which letter are there?");
        char letter = input.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter) {
                count++;
            }
        }
        System.out.println(letter + " sayisi: "  +count);

    }
}
