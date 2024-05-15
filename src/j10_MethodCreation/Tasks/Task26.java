package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task26 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        // task-> Girilen bir ifadenin tekrarlı karakterleri yalnızca 1 kez print eden METHOD create ediniz
        // input-> javacanlara selam olsun
        // output-> javcnlr semou

        writeOnce();

    }//main sonu

    private static void writeOnce() {
        int count = 0;
        System.out.println("Please enter a string: ");
        String str = scan.nextLine();
        String newStr = "";

        for (int i = 0; i < str.length(); i++) {
            if ( !newStr.contains(String.valueOf(str.charAt(i)))) {
                newStr += str.charAt(i);
            }
        }
        System.out.println("newStr = " + newStr);
    }
}
