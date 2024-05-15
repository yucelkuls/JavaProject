package j101_InterviewQuestionsJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q22_PrintVowelsOfString {
    // Task->
    // Get String from user and print just vowels(aeiou) inside String on the console
    // Girilen bir ifadenin sadece sesli harflerin print eden code create ediniz.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir ifade giriniz: ");
        String text = input.nextLine();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u') {
                System.out.print(text.charAt(i));
            }
        }

        // denemeler
//        ArrayList<String> sesliHarfler = new ArrayList<>(Arrays.asList("a", "e", "i", "o", "u"));
//
//        for (int i = 0; i < text.length(); i++) {
//            if (sesliHarfler.contains(String.valueOf(text.charAt(i)))) {
//                System.out.print(text.charAt(i));
//            }
//        }



    }

}
