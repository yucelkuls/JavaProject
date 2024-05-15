package j08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task30 {

    public static void main(String[] args) {
        // task-> girilen iki tamsayı arasındaki tamsayıların toplamını print eden code create ediniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int num1 = scan.nextInt();
        System.out.println("Bir sayı giriniz");
        int num2 = scan.nextInt();
        int sum = 0;
        for (int i = (num1<num2? num1: num2) + 1 ; i < (num1 > num2? num1: num2) ; i++) {
            sum += i;
        }
        System.out.println(sum);



    }
}
