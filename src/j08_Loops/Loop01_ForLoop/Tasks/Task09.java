package j08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
           /*
        task-> girilen boyutta aşağıdaki şekli  print eden code create ediniz
          Örnek Ekran çıktısı
      *
      * *
      * * *
      * * * *
      * * * * *
      * * * *
      * * *
      * *
      *

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scan.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = number - 1; i >= 1; i--){
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
