package j101_InterviewQuestionsJava;

import java.util.Arrays;
import java.util.Scanner;

public class Q24_CountsOfRepeatingElement {
    /*  Task->
            How many times a given number is repeated in a sequence
            Create the Java program that finds it.
            Verilen arrayde istenen sayının tekrar saysını print eden code create ediniz.
     */
    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 3, 1, 3, 4, 5, 6, 5, 3, 2, 1, 5, 4, 3, -6, -6};
        System.out.println("arr: " + Arrays.toString(arr));
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int sayi = input.nextInt();
        int sayac = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == sayi) {
                sayac++;
            }
        }
        System.out.println(sayac);
    }
}
