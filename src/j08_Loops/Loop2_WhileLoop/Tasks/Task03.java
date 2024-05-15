package j08_Loops.Loop2_WhileLoop.Tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        //task-> girilen tamsayı için çarpım tablosu print eden code create ediniz
        //input: 8-> output :8x1=8, 8x2=16... 8x10=80

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scanner.nextInt();
        int start = 1;
        while (start < 11){
            System.out.print(number + "x" + start + "=" + number * start);
            start++;
            if(start < 11) System.out.print(", ");
        }

    }
}
