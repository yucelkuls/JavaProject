package j103_TeamWorkProjects.Project_01;

import java.util.Scanner;

public class age {

     /*
        Given a int ,
            if the age less then and equal 10
                print  too young to create a facebook account

             if the age less then and equal 16
                print  too young to get a driver's license

             if the age less then and equal 18
                print  too young to get a tattoo

            if the age less then and equal 21
                print  too young to drink alcohol

            if the age bigger or equal to 21
                print  do what ever you want to do

        Note: use if else statement.
     */

    /*
           Eğer age 10 dan küçük veya eşit ise
           facebook hesabi acmak icin cok gencsin print edin.

           Eğer age 16 dan küçük veya eşit ise
           ehliyet almak icin cok gencsin print edin.

           Eğer age 18 den küçük veya eşit ise
           dovme yaptirmak icin cok gencsin print edin.

           Eğer age 21 den küçük veya eşit ise
           alkol icmek icin cok gencsin print edin.

           Eğer age 21 den büyük ise
           istedigini yapabilirsin print edin.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myAge = scanner.nextInt();
        //  code Start here don't change before this line
        //  bu satirdan onceki kodlari degistirmeyiniz.

        // DOGUKAN:
        if (myAge <= 10) {
            System.out.println("facebook hesabi acmak icin cok gencsin");
        } else if (myAge <= 16) {
            System.out.println("ehliyet almak icin cok gencsin");
        } else if (myAge <= 18) {
            System.out.println("dovme yaptirmak icin cok gencsin");
        } else if (myAge < 21) {
            System.out.println("alkol icmek icin cok gencsin");
        } else System.out.println("istedigini yapabilirsin");


//        //sema

        //Yucel:
        //System.out.println("Yucel");
        //yücel abinin kodda eksik var...

        //sema

//        System.out.println("sema");
//        if (myAge <= 0) {
//            System.out.println("- li bir değer kabul edilemez");
//        } else if (myAge <= 10) {
//            System.out.println("facebook hesabi acmak icin cok gencsin");
//        } else if (myAge <= 16) {
//            System.out.println("ehliyet almak icin cok gencsin");
//        } else if (myAge <= 18) {
//            System.out.println("dovme yaptirmak icin cok gencsin");
//        } else if (myAge < 21) {
//            System.out.println("alkol icmek icin cok gencsin");
//        } else {
//            System.out.println("istedigini yapabilirsin");
//        }


    }
}
