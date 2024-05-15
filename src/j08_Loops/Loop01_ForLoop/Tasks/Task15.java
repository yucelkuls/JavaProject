package j08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task15 {
	public static void main(String[] args) {
		/*
		Task-> girilen bir String'deki rakam sayısını print eden code create ediniz
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir string giriniz");
		String str = scan.nextLine();

		// 1. YOL
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				count++;
			}
		}
		if (count > 0) {
			System.out.println(str + " icinde  " + count + " adet rakam vardir");
		} else {
			System.out.println(str + " icinde  rakam Yoktur");
		}


		// 2. YOL;
		count = 0;

		for (int i = 0; i < str.length(); i++) {
			char character = str.charAt(i);
			if (Character.isDigit(character)) {
                count++;
            }
		}
		if (count > 0) {
			System.out.println(count + " adet rakam vardir.");
		}else System.out.println("Bu stringde rakam yoktur.");


		// 3. YOL;

		int temp= str.replaceAll("\\D","").length(); // ali123veli456.rep->123456
		if (temp > 0) {
			System.out.println(str + " icinde  " + temp + " adet rakam vardir");
		} else {
			System.out.println(str + " icinde  rakam yoktur");
		}


		// 4. YOL:

		int temp2= str.replaceAll("[^0-9]","").length();
		System.out.println("temp2 = " + str.replaceAll("[^0-9]",""));
		if (temp2 > 0) {
			System.out.println(str + " icinde  " + temp2 + " adet rakam vardir");
		} else {
			System.out.println(str + " icinde  rakam Yoktur");
		}

        /*
         Bir grup data'yi ifade eden kod'lara "Regex" denir.
            "Regex" Regular Expressions in kisaltilmis halidir.

            1)Tum rakamlar ==> [0-9]
            2)Tum kucuk harfler ==> [a-z]
            3)Tum buyuk harfler ==> [A-Z]
            4)Tum harfler ==> [a-zA-Z]
            5)Sesli harfler ==> [aeiouAEIOU]
            6)Space ==> [ ]
            7)Tum rakamlar ve tum harfler ==> [0-9a-zA-Z]
            8)Tum noktalama isaretleri ==> \\p{Punct}

            1)Rakamlar haric tum karakterler ==> [^0-9]
            2)Kucuk harfler haric tim karakterler ==> [^a-z]
            3)Buyuk harfler haric tum karakterler ==> [^A-Z]
            4)Tum harfler haric tum karakterler ==> [^a-zA-Z]
            5)Space haric ==> [^ ]
         */
	}
}
