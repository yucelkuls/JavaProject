package j07_StringManipulation.Tasks;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {

        //Task->  Girilen  String'deki space haric kac tane character kullanildigini print eden code create ediniz.
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String str = sc.nextLine();
        System.out.println(str.replaceAll("\\s", "").length());
    }
}
