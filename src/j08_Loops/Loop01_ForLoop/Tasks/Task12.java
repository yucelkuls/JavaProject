package j08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        /*
        Task -> girilen 5 sayının 10 ile 20 arası hariç diğerlerinin
        toplamının print eden code create ediniz
         */
        Scanner scan = new Scanner(System.in);
        int total = 0;
        for (int i = 1; i <=5; i++) {
            System.out.println("Enter number: "+ i);
            int number = scan.nextInt();
            if (number<=10 || number>=20){
                total += number;
            }
        }
        System.out.println(total);
    }
}
