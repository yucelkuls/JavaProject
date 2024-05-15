package j09_Break_Continue;

import java.util.Scanner;

public class C04_PinControl {
    public static void main(String[] args) {

        // Task -> Girilen String data type bir pin datasının 3 giriş hakkında kontrol eden code create ediniz.

        Scanner scanner = new Scanner(System.in);
        String pin = "JavvaNur";
        int pinCount = 3;

        while (true) {
            System.out.println("Please enter a pin");
            String userPin = scanner.next();

            if (userPin.equals(pin)) {
                System.out.println("You have entered the correct pin");
                break;
            } else {
                System.out.println("You have entered the wrong pin");
                pinCount--;
                if (pinCount == 0) {
                    System.out.println("You have entered the wrong pin 3 times");
                    break;
                }
            }
        }
    }
}
