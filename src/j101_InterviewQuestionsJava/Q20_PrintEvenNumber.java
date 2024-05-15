package j101_InterviewQuestionsJava;

import java.util.Scanner;


public class Q20_PrintEvenNumber {
    /* Task->
    Write a method named isEven that accepts an integer argument.
    The method should return true if the argument is even, or false otherwise.
    Girilen sayını tek-çiftlğini return eden method create ediniz.
    */
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter a number: ");
        int number = input.nextInt();

        System.out.println("tekCiftKontrol(number) = " + tekCiftKontrol(number));
        System.out.println("tekCiftKontrol2(number) = " + tekCiftKontrol2(number));
        tekCiftKontrol3();



    }//main sonu

    private static boolean tekCiftKontrol2(int number) {
        return number % 2 == 0? true : false;
    }

    private static void tekCiftKontrol3() {
        System.out.println("Please enter a number: ");
        System.out.println(input.nextInt() % 2 == 0? "Cift" : "Tek");
    }

    private static String tekCiftKontrol(int number) {
        return number % 2 == 0? "Cift sayidir" : "Tek sayidir";
    }

}//Class sonu
