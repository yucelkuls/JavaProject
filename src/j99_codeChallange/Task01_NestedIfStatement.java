package j99_codeChallange;

import java.util.Scanner;

public class Task01_NestedIfStatement {
    /* Task->
       Girilen  yas data için
            oy kullanma yasi :
             age >= 18  ==> oy kullanmaya uygun
             age >= 70  ==> uc kez oy kullanabilir
             70 > age >=50 ==> iki kez oy kullanabilir
             50 > age >=18 ==> bir kez oy kullanabilir,
             print eden code create ediniz...
         */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = input.nextInt();

        if (age >= 70) System.out.println("You can vote three times");
        else if (age >= 50) System.out.println("You can vote two times");
        else if (age >= 18) System.out.println("You can vote one times");
        else System.out.println("You cannot vote or invalid entry!");

        }// main sonu

    }