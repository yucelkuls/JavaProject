package j99_codeChallange;

import java.util.Scanner;

public class Task07_SwitchCase {

    //  Task-> Girilen 3 haneli bir sayının okunusunu print eden code create ediniz.
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Agam hele 3 basamaklı bir sayi giresen : ");
        int sayi = input.nextInt();
        if (sayi<=999&&sayi>=100) {//sayi 3 basamaklı kontrolu
            switch (sayi/100) {//yuzler basamak kontrolu
                case 1:System.out.print("yüz");break;
                case 2:System.out.println("iki yüz");break;
                case 3:System.out.println("üç yüz");break;
                case 4:System.out.println("dört yüz");break;
                case 5:System.out.println("beş yüz");break;
                case 6:System.out.println("altı yüz");break;
                case 7:System.out.println("yedi yüz");break;
                case 8:System.out.println("seki yüz");break;
                case 9:System.out.println("dokuz yüz");break;
            }
            switch ((sayi/10)%10) {//onlar basamak kontrolu
                case 1:System.out.print("on");break;
                case 2:System.out.println("yirmi ");break;
                case 3:System.out.println("otuz ");break;
                case 4:System.out.println("kırk ");break;
                case 5:System.out.println("elli ");break;
                case 6:System.out.println("atmış ");break;
                case 7:System.out.println("yetmiş ");break;
                case 8:System.out.println("seksen ");break;
                case 9:System.out.println("doksan ");break;
            }
            switch (sayi%10) {//birler basamak kontrolu
                case 1:System.out.print("bir");break;
                case 2:System.out.println("iki");break;
                case 3:System.out.println("üç");break;
                case 4:System.out.println("dört");break;
                case 5:System.out.println("beş");break;
                case 6:System.out.println("altı");break;
                case 7:System.out.println("yedi");break;
                case 8:System.out.println("seki");break;
                case 9:System.out.println("dokuz");break;
            }
        }else System.out.println("Agam gelmiiim ora adam gibin bişey giresen :(");
        System.out.println("\nAgam bu satır print edildiyse code cincix dewamke :)");





    }

}