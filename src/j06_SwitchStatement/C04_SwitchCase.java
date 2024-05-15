package j06_SwitchStatement;

import java.util.Scanner;

public class C04_SwitchCase {
    public static void main(String[] args) {

        // Task-> Girilen ay numarasına göre  mevsimini print eden code create ediniz...

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number of month: ");
        int number = input.nextInt();

        switch (number) {
            case 12:
            case 1:
            case 2:
                System.out.println("The season is winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("The season is spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("The season is summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("The season is autumn");
                break;
            default:
                System.out.println("Incorrect entry");




        }

        /*  ikinci yontem!!!
        Scanner scan = new Scanner(System.in);

System.out.println("Lütfen bir ay numarası giriniz: ");
int month = scan.nextInt();

switch (month) {
    case 1, 2, 12 -> System.out.println("Girilen ay kış mevsimine aittir.");
    case 3, 4, 5 -> System.out.println("Girilen ay ilkbahar mevsimine aittir.");
    case 6, 7, 8 -> System.out.println("Girilen ay yaz mevsimine aittir.");
    case 9, 10, 11 -> System.out.println("Girilen ay sonbahar mevsimine aittir.");
    default -> System.out.println("Geçersiz ay numarası.");
         */


    }
}
