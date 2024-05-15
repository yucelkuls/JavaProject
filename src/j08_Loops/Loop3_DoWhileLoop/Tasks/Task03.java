package j08_Loops.Loop3_DoWhileLoop.Tasks;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) { /*
    Task-> Girilen bir pozitif tamsayının tam kare olmasını kontrol eden code create ediniz.

     Ornek :  input : 16, output: 4 */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a positive number");
        int number = scanner.nextInt();
        int square = 1;
        int count = 0;

        while(square * square <= number){
            if(square * square == number){
                System.out.println(number + " has a square root.");
                count++;
            }
            square++;
        }
        if(count == 0){
            System.out.println(number + " does not have a square root.");
        }
        // if in altina else olusturmak istemedigimiz icin count ile else gibi calistiriyoruz.
        // eger count 0 ise kullaniciya sayinin karekoku olmadi uyarisi gidiyor.
    }
}
