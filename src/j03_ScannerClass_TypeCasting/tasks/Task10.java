package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task10 {
    /*
    Task->
    Write a Java program to convert temperature from Fahrenheit to Celsius degree.
    formula :  c = (f-32)*5/9
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Fahrenheit : ");
        double fahrenheit = scan.nextInt();

        System.out.println("Celsius : "+ ((fahrenheit - 32) * 5 )/ 9);









    }


}
