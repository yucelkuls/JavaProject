package j05_ifStatementTernaryOperator.Tasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        /* Task->
         Kullanicidan 100 uzerinden notunu isteyin.
         Not’u harf sistemine cevirip yazdirin.
         50’den kucukse “D”,->1,2,3..49
         =50  <60 arasi “C”,->50,51,52,..59
         =60  <80 arasi “B”,->60,61,62,63..79
         =80’nin uzerinde ise “A”->80,81..100
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your score: ");
        int score = scan.nextInt();

        if (score > 0 && score <= 100) {
            if (score < 50) System.out.println("Your grade is D");
            else if (score < 60) System.out.println("Your grade is C");
            else if (score < 80) System.out.println("Your grade is B");
            else System.out.println("Your grade is A");
        } else System.out.println("Invalid entry");
    }
}

