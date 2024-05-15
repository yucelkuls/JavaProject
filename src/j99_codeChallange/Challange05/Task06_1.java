package j99_codeChallange.Challange05;

import java.util.Scanner;

public class Task06_1 {
    /* Interview Question
    Write a Java program to reverse a string.
    Use for loop and create a method called reverseString */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string");
        String string = scanner.nextLine();

        for (int i = string.length()-1; i >=0 ; i--) {
            System.out.print(string.charAt(i));
        }
    }
}
