package j14_Varargs;

public class C01_Varargs {
    public static void main(String[] args) {
 /*
      VARARGS :diva...  :)
      var----variety: cesitlilik args---arguments
      SYNTAX ->
      mathodName(parametre1,parametre2, dataType... dataName) {
      method body....
      }
       1) Method parametre parantezi icinde birden çok parametre varsa, varargs daima en sona tanımlanmalıdır .CISSS -> Diva en son sahne alır
       2) Method parametre parantezi icinde 1'den fazla varargs ifade TANIM-LA-NA-MAZZZ :CISS -> diva tek olur.iki diva bir ipte yurumez

         Gunun TRICK'i  köşesinde böyün :
         Method'da  argument sayisi sabitse standart normal  method tanımlanmalı..
         ancak argument sayisi belirli değilse  VARARGS ifade tercih edilmeli...
*/
        int sayi1 = 15;
        int sayi2 = 34;
        int sayi3 = 59;
        int sayi4 = 38;

        // task01-> verilen 2 int variable toplamını print eden METHOD create ediniz..

        System.out.println("   ***  Task 01  ***");
        topla(sayi1, sayi2);
        topla(sayi2, sayi4);
        topla(99, sayi3);

        // task02-> verilen 3 int variable toplamını print eden METHOD create ediniz..
        System.out.println("   ***  Task 02  ***   ");
        topla(sayi1, sayi2, sayi3);
        topla(571, 1, sayi4);
        topla(1907, 4, sayi2);

        // task03-> verilen 5 int variable toplamını print eden METHOD create ediniz.
        System.out.println("   ***  Task 03   ***   ");
        topla(3, 6, sayi1, 34, sayi4);
        topla(2,3); // varargs olmayan method call edildi.
        topla(2,6,7,sayi1,89,99,123,45,5,78,76); // 545

        // task04-> .verilen String variable'rın  en fazal karakter bulunduranı  print eden METHOD create ediniz..
        System.out.println("   ***  Task 04   ***   ");
        enUzunKelime("JavaZADE", "JavvvaNur", "JavaCAN");
        enUzunKelime("Enes", "Ahmet", "Halit", "Abdurrahman", "Semra Yaren Hanim");

    }

    private static void enUzunKelime(String... str) {
        String uzunStr = "";
        for(String each: str){
            if(uzunStr.length() < each.length()){
                uzunStr=each;
            }
        }
        System.out.println("uzun kelime : "+uzunStr);
    }

    private static void topla(int... i) {
        int toplam=0;
        for (int each : i) {
            toplam+=each;
        }
        System.out.println("Elemanlarin toplami = " + toplam);
    }

    private static void topla(int num1, int num2, int num3) {
        System.out.println("Elemanlarin toplami = " + (num1 + num2 + num3));
    }
    private static void topla(int num1, int num2) {
        System.out.println("Elemanlarin toplami = " + (num1 + num2));
    }
}
