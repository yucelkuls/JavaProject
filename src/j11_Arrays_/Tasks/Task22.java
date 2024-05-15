package j11_Arrays_.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {


    /*  Write a Java program to get a String from user as input and find
        the maximumCounts occurring character in that string.
         (Ignore case sensitivity)

        Girilen  string icinde en cok tekrar eden karakteri print eden code create ediniz.
       input : JavaCAN'lara selam olsun
       output: maximumCounts occurring character is : a
        */
//        Scanner scan = new Scanner(System.in);
//        System.out.print("bir metin gir : ");
//        String str = scan.nextLine();
//
//        String[] arr = str.split("");
//        System.out.println(Arrays.toString(arr));
//
//        int count = 0;
//        int max = 0;
//        String harf = "";
//
//        for (int i = 0; i < arr.length; i++) {
//            count = 0;
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[i].equals(arr[j])) {
//                    count++;
//                    max = count;
//                }
//            }
//            if (count > max) {
//                harf = arr[i];
//            }
//        }
//        System.out.print(harf);

        Scanner scan = new Scanner(System.in);
        System.out.print("bir metin gir : ");
        String str = scan.nextLine();

        char[] arr = str.toCharArray();
        System.out.println(Arrays.toString(arr));

        int count = 0;
        int max = 0;
        char harf = '\0';

        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > max) { // sadece count max'tan büyükse güncelle
                max = count;
                harf = arr[i];
            }
        }
        System.out.print( max + " adet "+ harf + " harfi bulunuyor");

    }
}


