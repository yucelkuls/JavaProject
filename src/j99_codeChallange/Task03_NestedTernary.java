package j99_codeChallange;

import java.util.Scanner;

public class Task03_NestedTernary {

    /*  Task
     Girilen Final için
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri..
    print eden code create ediniz.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Final harf notunuzu giriniz:");
        char finalChar = scanner.next().toUpperCase().charAt(0);

        System.out.println(finalChar == 'A' ? "Gayet Basarili" :
                (finalChar == 'B' ? "Basarili" :
                        (finalChar == 'C' ? "Ha gayret" : "Digerleri")));
    }

}
