package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {// main level
        //task-> girilen ad ve soyadın ilk harfleri buyuk diğer harflerini küçük print eden METHOD create ediniz.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ad: ");
        String name = scanner.next();
        System.out.print("Soyad: ");
        String surname = scanner.next();

        firstUpper1(name, surname);
        String can = firstUpper2("can", "yucel");
        System.out.println(can);
        System.out.println("firstUpper3() = " + firstUpper3());

    }//main sonu

    private static String firstUpper3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ad: ");
        String name = scanner.next();
        System.out.print("Soyad: ");
        String surname = scanner.next();

        return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase()
               + " " + surname.substring(0, 1).toUpperCase()
               + surname.substring(1).toLowerCase();


    }

    private static String firstUpper2(String name, String surname) {
        return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase()
               + " " + surname.substring(0, 1).toUpperCase()
               + surname.substring(1).toLowerCase();
    }

    private static void firstUpper1(String name, String surname) {
        String firstUpperName = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        String firstUpperSurname = surname.substring(0, 1).toUpperCase() + surname.substring(1).toLowerCase();
        System.out.println(firstUpperName + " " + firstUpperSurname);
    }

}// Class sonu
