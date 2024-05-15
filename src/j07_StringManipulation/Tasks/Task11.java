package j07_StringManipulation.Tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
      /* TASK :
       Kullanıcıdan tek seferde alınan ad soyadı ifadeyi
      ad ve soyadı ayrı ayrı print eden code create ediniz
       */

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your name en surname");
        String fullname = scan.nextLine().trim();

        System.out.println(fullname.substring(0, fullname.indexOf(" ")));
        System.out.println(fullname.substring(fullname.indexOf(" ") + 1).trim());

    }
}
