package j08_Loops.Loop2_WhileLoop;

import java.util.Scanner;

public class C02_WhileLoop {
    public static void main(String[] args) {

        // task-> girilen tamsayının rakamları toplamını print eden code create ediniz.
// 2316->6+1+3+2       571622->2+2+6+1+7+5
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int num = scan.nextInt();
        int toplam = 0;
//        while (num > 0) {
//            toplam += num % 10;
//            num/=10;
//        }
        System.out.println(toplam);

        for (int i = num; i > 0 ; i/=10) {
            toplam += i % 10;
        }
        System.out.println("toplam = " + toplam);
    }
}
