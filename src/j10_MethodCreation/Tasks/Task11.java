package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task11 {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {
        /* task-> girilen ifadeyi 'hacker' dilinde print eden METHOD create ediniz

        a->7
        v->1
        c->-4
        e->2
         */

        hackerSpeak();
    }

    private static void hackerSpeak() {
        System.out.print("Please enter your text");
        String str = input.nextLine();
        System.out.println(str.replaceAll("a", "7").replaceAll("v", "1").replaceAll("c", "-4").replaceAll("e", "2"));
    }//main sonu
}//Class sonu
