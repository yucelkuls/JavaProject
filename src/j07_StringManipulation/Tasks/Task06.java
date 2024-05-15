package j07_StringManipulation.Tasks;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {

        /*
        Girilen String'in son karakterini silen code create ediniz...
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string");
        String str = input.nextLine();
        System.out.println(str.substring(0, str.length() - 1));


    }
}
