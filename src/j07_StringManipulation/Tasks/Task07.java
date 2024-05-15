package j07_StringManipulation.Tasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        /*
        Task-> Girilen string içindeki istenen index'deki karakteri print eden code create ediniz
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir string giriniz: ");
        String str = scanner.nextLine();
        System.out.println("Hangi indexteki karakteri gormek istersiniz?");
        int index = scanner.nextInt();

        if (index < 0 || index > str.length()) {
            System.out.println("Lütfen 0 dan " + str.length() + " e/a kadar bir index giriniz.");
        } else System.out.println(str.charAt(index));
    }
}