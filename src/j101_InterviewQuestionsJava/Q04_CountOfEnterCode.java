package j101_InterviewQuestionsJava;

import java.util.Scanner;

public class Q04_CountOfEnterCode {
    //  Task-> STRING OLAN PIN kodunu 3 seferde  kontrol eden code create ediniz.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pin = "javvaNURjavaNAZjavaSU";
        int girisHakki = 3;
        while (true){
            System.out.println("Please enter a pin");
            String userPin = input.nextLine();
            if(userPin.equals(pin)){
                System.out.println("You have entered the correct pin");
                
                break;
            }else {
                System.out.println("Invalid pin: " + userPin);
                girisHakki--;
                System.out.println("Kalan giris hakki: " + girisHakki);
            }
            if(girisHakki == 0){
                System.out.println("You have entered the wrong pin 3 times!!!");
                break;
            }
        }
    }
}
