package j99_codeChallange;

import java.util.Scanner;

public class Task07 {

    /* Task->
     * girilen String icinde "xyz" dizimi var ise true degilse false return eden code create ediniz.
     *
     * input      output
     * axyzm  ==   true
     * xyz    ==   true
     * x.yz   ==   false
     * xyaz   ==   false
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir string giriniz: ");
        String text = scan.next();
        if (text.contains("xyz")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
