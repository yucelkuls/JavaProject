package j08_Loops.Loop3_DoWhileLoop.Tasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

        //task-> girilen bir ondalik sayinin ondalik kismindaki rakamlarinin toplamini bulunuz.
        //             24.5673 ==>    5+6+7+3 = 21

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a double number");
        String decimal = scanner.next();

        if (decimal.contains(".")) {
            int num = Integer.parseInt(decimal.substring(decimal.indexOf(".") + 1));
            int sum = 0;
            while (num > 0) {
                sum += (num % 10);
                num /= 10;
            }
            System.out.println("sum = " + sum);
        } else System.out.println("Please enter a double number");
    }
}
