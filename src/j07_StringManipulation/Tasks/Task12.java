package j07_StringManipulation.Tasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimelik  ismi
         Örn. Haluk Bilgin Java -> H.B.J.  şeklinde print eden code create ediniz.
        */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a 3-word name: ");
        String name = scanner.nextLine().toUpperCase();

        System.out.println(name.charAt(0) + "." +
                           name.charAt(name.indexOf(" ") + 1) + "." +
                           name.charAt(name.lastIndexOf(" ") + 1) + ".");



    }
}
