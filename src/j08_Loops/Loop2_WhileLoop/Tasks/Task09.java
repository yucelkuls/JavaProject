package j08_Loops.Loop2_WhileLoop.Tasks;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {


        // task-> istenilen kadar tamsayının toplamını print eden code create ediniz

        while (true){
            System.out.println("Kac adet sayi toplamak istiyorsunuz?:  (cikis icin 0)");
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();
            if (number == 0){
                break;
            }
            int sum = 0;
            for (int i = 1; i <= number; i++) {
                System.out.println(i +". sayiyi giriniz:");
                int sayi = input.nextInt();
                sum += sayi;
            }
            System.out.println("Girdiginiz sayilarin toplami= "+ sum);
        }
     }
}
