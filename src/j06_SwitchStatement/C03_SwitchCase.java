package j06_SwitchStatement;

import java.util.Scanner;

public class C03_SwitchCase {
    public static void main(String[] args) {

        // Task-> Girilen ay numarasına göre kaç gün çektiğini print eden code create ediniz...

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number of month: ");
        int number = input.nextInt();

        switch (number) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;
            case 2:
                System.out.println("Enter year");
                int year = input.nextInt();
                if (year % 4 == 0){
                    if (year % 100 != 0 || year % 400 == 0) {
                        System.out.println("29 days");
                    } else {
                        System.out.println("28 days");
                    }
            }
            else{
                System.out.println("28 days");
            }
            break;
        default:
            System.out.println("Incorrect entry");
      }
        System.out.println("The code has been executed successfully");
    }
}
