package j99_codeChallange;

import java.util.Scanner;

public class Task06_SwitchCase {
    /*  Task->
          * Kullanicidan ilk 3 buyuk harfden biri secildiginde cumle yazdiran kod yaziniz (switch case kullanin)
          * ornek
          *  Kullanici  : A , B , C harflerinden birini secsin
              A'yi secmis ise, ==> Java is easy
              B'yi secmis ise, ==> Java is fun
              C'yi secmis ise, ==> I need to study :)
          */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Harf giriniz : ");
        char harf = input.next().toUpperCase().charAt(0);
        System.out.println("   ***  Ternary Cozum  ***");
        System.out.println(harf == 'A' ? "Java is easy" : harf == 'B' ? "Java is fun" : harf == 'C' ? "I need to study" : "You are crazy!");

        System.out.println("   ***  switch cozum   ***   ");

        switch (input.next().toUpperCase().charAt(0)) {  // ***switch icine direkt olarak da input gonderebiliriz***
            case 'A':
                System.out.println("Java is easy");
                break;
            case 'B':
                System.out.println("Java is fun");
                break;
            case 'C':
                System.out.println("I need to study :)");
                break;
            default:
                System.out.println("hatalı giris yaptınız");

        }
        System.out.println("Agam bu satır print edildiyse code cincix dewamke :)");

    }
}
