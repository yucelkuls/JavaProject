package j99_codeChallange;

import java.util.Scanner;

public class Task13 {
    //Task-> Girilen   4 harfli bir kelimeyi tersten print eden code create ediniz.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("4 harfli bir kelime giriniz: ");
        String text = scan.next();
//        if (text.length() <= 4) {
//            System.out.println(("" + text.charAt(text.length() - 1) +
//                    text.charAt(text.length() - 2) +
//                    text.charAt(text.length() - 3) +
//                    text.charAt(text.length() - 4)));
//        } else System.out.println("4 harften büyük girdin...");

        //dogu

        for (int i = text.length()-1; 0 <= i; i--) {
//            System.out.println(i);
            System.out.print(text.charAt(i));
        }






    }
}

