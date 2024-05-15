package j08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /* task-> interview question
        girilen ifadenin polindrome olmasını kontrol eden code create ediniz...
        plindrome:her iki yönde okundugunda eşit olan ifadeler :ece, ada etc.

         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        String reversed = "";
        System.out.println("str=" + str);

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println("Reversed: " + reversed);
        if (str.equalsIgnoreCase(reversed)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }

        // 2. YOL
        System.out.println("\n**** Ternary ile cozum ****");
        System.out.println(str.equalsIgnoreCase(reversed)? "Palindrome" : "Not palindrome");  // if yerine ternary//
    }
}

