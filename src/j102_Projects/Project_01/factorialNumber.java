package j103_TeamWorkProjects.Project_01;

import java.util.Scanner;

public class factorialNumber {

    public static void main(String[] args) {

        /*
        Write a program to find the factorial value of any number entered through the scanner class.

        Example:
        number:7
        factorial:1*2*3*4*5*6*7=5040
        output should be == 5040

        number:6
        factorial:1*2*3*4*5*6=720
        output should be == 720

       */

        /*
        girilen herhangi bir sayının faktöriyel değerini print eden code create ediniz.

        number:6
        factorial:1*2*3*4*5*6=720
        output ---> 720


         */

        Scanner dp = new Scanner(System.in);

        String  strNum = dp.nextLine();

        int number = Integer.parseInt(strNum);

         //      code start here  use int number
         //      kodu burdan başlatın ve int number kullanıniz
        int factorial=1;
        for (int i=1;i<=number;i++){
            factorial*=i;
        }
        System.out.println("Girilen " +number+" sayısının faktöriyeli= " +factorial);




    }
}