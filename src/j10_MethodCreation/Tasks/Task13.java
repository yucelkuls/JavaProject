package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {

    /*
    Task-> girilen iki String'den ikincisi, birincisinin son harflerine eşitse, true,
    diğer durumda false return eden METHOD create ediniz

    Örnekler:
   ("abc", "bc") ➞ true
   ("abc", "d") ➞ false
   ("samurai", "zi") ➞ false
   ("feminine", "nine") ➞ true
   ("convention", "tio") ➞ false
    */

        String x = "feminine";
        String y = "nine";
        String z = "tio";

        System.out.println("controlToString() = " + controlToString());

        // 2. yol  startswith veya endswith
        System.out.println("controlEnd() = " + controlEnd());

}//main sonu

private static boolean controlEnd() {
    Scanner scan = new Scanner(System.in);
    System.out.println("metin girin : ");
    String birinci = scan.nextLine();
    System.out.println("metin girin : ");
    String ikinci = scan.nextLine();
    boolean esitMi = false;

    if (birinci.endsWith(ikinci)) {
        esitMi = true;

    }
    return esitMi;

}
    private static boolean controlToString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first string: ");
        String first = sc.next();
        System.out.println("Please enter second string: ");
        String second = sc.next();
        boolean isContains = false;
        int count = 0;
        int index = 0;
        for (int i = second.length()-1; i >= 0; i--) {
            if (second.charAt(i) == first.charAt(first.length() - 1 - index)) {
                count++;
            }
            index++;
        }
        if (count == second.length()) {
            isContains = true;
        }
        return isContains;

    }
}//Class sonu
