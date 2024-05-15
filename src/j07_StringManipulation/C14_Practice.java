package j07_StringManipulation;

import java.util.Scanner;

public class C14_Practice {
    public static void main(String[] args) {
        /*
Task->  girilen bir password için aşagıdaki şartları sağlarsa "gayet başarılı DEWAMKEEE :)"
sağlamazsa "Çok başarısız :( agam yeni paaword giresen" print eden code create ediniz.
1-en az 8 karakter uzunlugunda,
2-ilk harf buyuk,
3-son harf kucuk,
4-boşluk içermemeli
 */

        Scanner input = new Scanner(System.in);
        System.out.println("password giriniz");
        String password = input.nextLine();
        if (password.length() >= 8
            && Character.isUpperCase(password.charAt(0))
            && Character.isLowerCase(password.charAt(password.length() - 1))
            &&!password.contains(" ")){
            System.out.println("Basarili");
        }else System.out.println("Cok basarisiz, yeni password girin!");
    }
}
