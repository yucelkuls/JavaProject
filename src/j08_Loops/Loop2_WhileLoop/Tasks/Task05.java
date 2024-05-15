package j08_Loops.Loop2_WhileLoop.Tasks;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		/*
		task-> girilen  isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar
		olan butun harfleri ayni satirda aralarina bosluk birakarak print rden code create ediniz
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = scanner.nextLine().replace(" ", "");
		String newName = "";
		int index = 0;

		while(index < name.length()){
			newName += name.charAt(index) + " ";
			index++;
		}
		System.out.println("newName = " + newName);
	}
}
