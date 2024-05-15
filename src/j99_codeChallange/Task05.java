package j99_codeChallange;

import java.util.Scanner;

public class Task05 {

    /* Task->
     * Girilen 4 kelime  cumle haline getirip sonunda . ile print eden code create ediniz.
     *
     * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
     *         Output : Cesaret insana sinirlarini ogretir.
     *
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word: ");
        String word1 = scan.next();
        String capital = word1.substring(0,1).toUpperCase() + word1.substring(1);
        System.out.println("Enter second word: ");
        String word2 = scan.next();
        System.out.println("Enter third word: ");
        String word3 = scan.next();
        System.out.println("Enter fourth word: ");
        String word4 = scan.next();

        System.out.println(capital.concat(" "+word2).concat(" "+word3).concat(" "+word4+"."));
        System.out.println(capital + " " + word2 + " " + word3 + " " + word4 + ".");
        // Cesaret insana sinirlarini ogretir.
    }

}
