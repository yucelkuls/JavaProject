package j99_codeChallange;

import java.util.Scanner;

public class Task06 {
    /*  Tsk->
   girilen  Stringin ilk iki karakteri haric string return eden code create ediniz
        Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin (gh  -  g  -  h   : 3 durum var)

       ORNEK:          INPUT     OUTPUT
                       goat        gat
                      photo        hoto
                      ghost        ghost
                      kalem        lem
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String word = scanner.next();
        
        if(word.charAt(0) == 'g' && word.charAt(1) == 'h') {
            System.out.println(word);
        if (word.charAt(0) == 'g' || word.charAt(1) == 'h') {

            
        }
        }


    }
}