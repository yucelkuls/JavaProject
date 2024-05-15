package j03_ScannerClass_TypeCasting;

public class C02_TypeCasting {

    /*
       Type Casting: Bir numeric data type'ini diger numeric data type'ina cevirme işlemidir.
                     byte < short < int < long < float < double
       Note 1: Kucuk data type'ini buyuk data type'ine cevirmeye "Auto Widening" denir
       Note 2: Buyuk data type'ini kucuk data type'ine cevirmeye "Explicit Narrowing" denir.
   */

    public static void main(String[] args) {

        boolean basarili = true;
        System.out.println("basarili = " + basarili);//true
        //String succes=basarili;//dogal uyum olmadigi icin CTE
        String succes = String.valueOf(basarili);//Wrpper Class
        System.out.println("succes = " + succes);//true

        double sayi1 = 49;
        System.out.println("sayi1 = " + sayi1);//AW->49.0
        int sayi2 = 74;
        int sayi3 = 12;
        double sonuc = sayi2 / sayi3;
        System.out.println("sonuc = " + sonuc);//sonuc = 6.0
        /*
        java'da iki int deger bolundugunde sonuc mutlaka int olur
        Yani bolme ondalikli bir sayi olsada casting yaparak int yapar
         */

        byte b = 15;
        int num = b;//k->b AW
        System.out.println("num = " + num);//15
        int i = 1453;
        double d = i;
        System.out.println("d = " + d);//1453.0
        double d1 = d / sayi2;
        System.out.println("d1 = " + d1);//19.635135135135137





        //Hap bilgi -> Iki farkli data type isleme girerse AW( k data b dataya casting(cevrilir))
// veri kaybini onlemek icin
        double d2 = 14.53;
        System.out.println("d2 = " + d2);  //14.53

        int num2 = (int) d2;
        System.out.println("num = " + num2);  //14


        double d3 = 571.622;
        System.out.println("d3 = " + d3);  //571.622
        long l = (long) d3;
        System.out.println("l = " + l);  //571

        int num3 = 129;
        System.out.println("num3 = " + num3); // 129
        byte b2 = (byte) num3;
        System.out.println("b2 = " + b2);  // -127



    }
}
