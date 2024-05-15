package j08_Loops.Loop2_WhileLoop.Tasks;

import java.util.Map;
import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        // Task-> girilen 5 sayının en buyugunu print eden code create ediniz
        Scanner input = new Scanner(System.in);
        int count = 1;
        int temp = 0;
        while (count < 6) {
            System.out.println("Please enter number " + count);
            int number = input.nextInt();
            if (number > temp) {
                temp = number;
            }
            count++;
        }
        System.out.println("The largest number = "+temp);
    }
}
