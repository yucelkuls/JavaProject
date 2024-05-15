package j06_SwitchStatement.Tasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        // Task-> Girilen 3 basamaklı bir sayıyı harf karakteri ile print eden code create ediniz.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a three-digit number: ");
        int number = scanner.nextInt();

        if (number > 99 && number < 1000) {

            int hundreds = number / 100; // Yuzler basamagi
            int tens = (number / 10) % 10; // Onlar basamagi
            int ones = number % 10; // Birler basamagi

            switch (hundreds) {
                case 1:
                    System.out.print("Yuz");
                    break;
                case 2:
                    System.out.print("Iki yuz");
                    break;
                case 3:
                    System.out.print("Üç yuz");
                    break;
                case 4:
                    System.out.print("Dört yuz");
                    break;
                case 5:
                    System.out.print("Beş yuz");
                    break;
                case 6:
                    System.out.print("Altı yuz");
                    break;
                case 7:
                    System.out.print("Yedi yuz");
                    break;
                case 8:
                    System.out.print("Sekiz yuz");
                    break;
                case 9:
                    System.out.print("Dokuz yuz");
                    break;
                default:
                    System.out.print("");
                    break;


            }
            switch (tens) {
                case 1:
                    System.out.print(" On");
                    break;
                case 2:
                    System.out.print(" Yirmi");
                    break;
                case 3:
                    System.out.print(" OTuz");
                    break;
                case 4:
                    System.out.print(" Kırk");
                    break;
                case 5:
                    System.out.print(" Elli");
                    break;
                case 6:
                    System.out.print(" Altmis");
                    break;
                case 7:
                    System.out.print(" Yetmis");
                    break;
                case 8:
                    System.out.print(" Seksen");
                    break;
                case 9:
                    System.out.print(" Doksan");
                    break;
                default:
                    System.out.print("");
                    break;
            }
            switch (ones) {
                case 1:
                    System.out.print(" Bir");
                    break;
                case 2:
                    System.out.print(" İki");
                    break;
                case 3:
                    System.out.print(" Üç");
                    break;
                case 4:
                    System.out.print(" Dört");
                    break;
                case 5:
                    System.out.print(" Beş");
                    break;
                case 6:
                    System.out.print(" Altı");
                    break;
                case 7:
                    System.out.print(" Yedi");
                    break;
                case 8:
                    System.out.print(" Sekiz");
                    break;
                case 9:
                    System.out.print(" Dokuz");
                    break;
                default:
                    System.out.print("");
                    break;
            }

        } else {
            System.out.println("Please enter a three-digit number!!!");
        }








    }
}
