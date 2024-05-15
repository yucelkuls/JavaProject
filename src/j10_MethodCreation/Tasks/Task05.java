package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        // task-> girilen iki sayıyı seçilen dört işleme göre hesaplayıp print eden METHOD create ediniz
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first number = ");
        int first = scan.nextInt();
        System.out.println("Please enter second number = ");
        int second = scan.nextInt();

        System.out.println("\nChoose an action: \nsum: + \nsubtraction: -\nmultiplication: *\ndivision: /");
        char action = scan.next().charAt(0);

        calculator(action, first,second);



    }//main sonu

    private static void calculator(char action, int first, int second) {
        switch (action){
            case '+':
                System.out.println(first + " + " + second + " = " + (first + second));
                break;
            case '-':
                System.out.println(first + " - " + second + " = " + (first - second));
                break;
            case '*':
                System.out.println(first + " * " + second + " = " + (first * second));
                break;
            case '/':
                System.out.println(first + " / " + second + " = " + (first / second));
                break;
            default:
                System.out.println("Invalid entry");
        }
    }


}//Class sonu
