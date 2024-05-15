package j07_StringManipulation;

import java.util.Scanner;

public class C03_CharAt {
    public static void main(String[] args) {
        /*
charAt() methodu parametre int olarak girilen index'deki char değerini return eder.
Çoooğğğ önemli ->  index değeri her zaman 0'dan başlar.-> ucağın koltuk nosu 0'dan başlar
 */
        String name = "Can Team Leader";
        System.out.println("name = " + name); // name = Can Team Leader
        System.out.println("name.charAt(5) = " + name.charAt(5));
        char besinciKarakteri = name.charAt(5);
        System.out.println("besinciKarakteri = " + besinciKarakteri);


        //task-> Girilen bir String ifadenin ortadaki karakterini print eden code create ediniz

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir string giriniz: ");
        String str = scanner.nextLine();

        if (str.length() % 2 == 0) {
            System.out.println("Orta karakter yoktur!!!");
        }
        else {
            System.out.println(str.charAt(str.length() / 2));
        }



    }
}
