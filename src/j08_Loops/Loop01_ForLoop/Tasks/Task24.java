package j08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task24 {

    public static void main(String[] args) {
		/*
		 Task -> girilen  String'in tersini(reverse String) print eden code create ediniz
		 */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string");
        String string = input.nextLine();
        String reversed = "";

        for (int i = string.length()-1 ; i >=0 ; i--) {
            reversed += string.charAt(i);
        }
        System.out.println(reversed);
    }
}
