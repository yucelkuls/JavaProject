package j99_codeChallange;

import java.util.Scanner;

public class Task02 {
    //Task-> girilen iki ayrı  kelimeyi iki farklı yol ile birlestiriniz.

    //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. kelime");
        String word1 = scanner.next();
        System.out.println("2. kelime");
        String word2 = scanner.next();

        System.out.println(word1 + word2);  // 1.yol
        System.out.println(word1.concat(word2)); // 2. yol

        System.out.println(word1.substring(1) + word2.substring(1)); // 1. yol
        System.out.println(word1.substring(1).concat(word2.substring(1))); // 2. yol


    }

}
