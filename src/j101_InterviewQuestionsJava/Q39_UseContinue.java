package j101_InterviewQuestionsJava;

import java.util.Scanner;

public class Q39_UseContinue {

        /* Task->
         Girilen bir stringin harflerini bosluk veya a harfi hariç teker teker  alt alta print eden code create ediniz.
         */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir ifade giriniz: ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' || str.charAt(i) == 'a') {
                continue;
            } else System.out.println(str.charAt(i));
        }
    }
}
