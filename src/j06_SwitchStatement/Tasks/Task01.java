package j06_SwitchStatement.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //Task->  Girilen bir tamsayının onlar basamağının harf karakteri ile  print eden code create ediniz.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = scanner.nextInt();

        if (number >=10){
            int digit = (number / 10) % 10;

        switch (digit) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                System.out.println("Incorrect entry");
        }}
        else{
            System.out.println("Incorrect entry");
        }







    }
}
