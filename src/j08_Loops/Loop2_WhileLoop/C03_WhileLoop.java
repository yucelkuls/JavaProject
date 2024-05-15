package j08_Loops.Loop2_WhileLoop;

import java.util.Scanner;

public class C03_WhileLoop {
    public static void main(String[] args) {
        // task-> girilen tamsayının pozitif tam bolen sayısını print eden code create ediniz...
// 20 -> 1,2,4,5,10,20: 20'nin 6 tane tam böleni var
// 30 -> 1,2,3,5,6,10,15,30: 30'un 8 tane tam böleni var

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int num = scan.nextInt();
        int count =0;
        int i = 1;
        while (num >= i) {
            if (num % i == 0) {
                count++;
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println("count = " + count);
    }
}
