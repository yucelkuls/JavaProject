package j08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task29 {

    public static void main(String[] args) {
        // task-> girilen bir Stringde  index'i tek sayi olanlari kucuk harfle
        // index'i cift sayi olanlari buyuk harfle print eden code create ediniz
        // ornek : Haluk  output: HaLuK

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir String giriniz");
        String str = scan.next();
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                newStr += str.toUpperCase().charAt(i);
            }else {
                newStr += str.toLowerCase().charAt(i);
            }
        }
        System.out.println(newStr);
    }
}
