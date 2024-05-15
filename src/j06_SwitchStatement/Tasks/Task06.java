package j06_SwitchStatement.Tasks;

import java.util.Locale;
import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
        //Task-> Girilen  VIP (Very Important Person) kisaltmasindaki harflerin anlamini print eden code create ediniz

        Scanner scanner = new Scanner(System.in);
        System.out.println("VIP'in anlamini ogrenmek icin V, I yada P harflerinden birini giriniz :");
        String letter = scanner.next().toUpperCase();

        switch (letter) {
            case "V":
                System.out.println("V : Very");
                break;
            case "I":
                System.out.println("I : Important");
                break;
            case "P":
                System.out.println("P : Person");
                break;
            default:
                System.out.println("Incorrect input");
                break;

        }
        //switch caselerde char kullanilacaksa tek tirnakla yazmaliyiz.
        // bir stringden char karakteri alacaksak once string methodlari kullanilmali sonra
        // charAt(0) methodu cagrilir.   char ch = scanner.next().toUpperCase().charAt(0)


    }
}
