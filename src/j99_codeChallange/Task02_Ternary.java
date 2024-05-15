package j99_codeChallange;

import java.util.Scanner;

public class Task02_Ternary {
    /* Task->
     * Girilen fiyat için
     * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
     * print eden code create ediniz
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a price: ");
        int price = scanner.nextInt();
        String result = (price < 10) ? "cheap" : ((price < 20) ? "normal" : "expensive");
        System.out.println(result);


    }
}
