package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {

       /* task-> girilen üç tamsaynın
        bir dik üçgenin kenar uzunlukları olamsını kontrol eden METHOD create ediniz.
        (Trick->: a b c kenarları için  a2+b2=c2 pisagor  şartı sağlanmalı)

        birinci kenarı giriniz: 3
        ikinci kenarı giriniz 4
        üçüncü kenarı giriniz: 5
         dik üçgendir
        birinci kenarı giriniz: 2
        ikinci kenarı giriniz 15
        üçüncü kenarı giriniz: 7
        dik üçgen değildir.*/

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen kenar uzunluklarini giriniz");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        dikucgen(a, b, c);


    }

    private static void dikucgen(int x, int y, int z) {

        if ( (Math.pow(y, 2)) + (Math.pow(x, 2)) == Math.pow(z, 2) || (Math.pow(y, 2)) + (Math.pow(z, 2)) == Math.pow(x, 2) ||
        Math.pow(z,2)+Math.pow(x,2)==Math.pow(y,2)){
            System.out.println("dik ucgendir.");

        }else System.out.println("dık ucgen değildir.");

    }
}
