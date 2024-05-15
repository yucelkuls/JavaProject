package j20_StaticKeyword;

public class C02_StaticBlok {  // Class level
    /*
   1.static blok yapıları static variable'rı değer ataması update için kullanılır
   2.static blok Class oluşturulduğunda butun method'lardan(main method dahil) önce çalışır
   3.birden fazla static blok varsa yukarıdan aşagiya sıralama ile çalışır.
   4.static bloklar sadece 1 kere en basta calisir static olmayan bloklar her obje olusturulurken yeniden calisir
    */
    static String name = "JavaJan";  // initila edilmis static variable created.
    static {
        System.out.println("*** 2. static blok run ***");
        System.out.println("2. static blok before update name : "+name);
        name = "Avatar";
        System.out.println("2. static blok after update name : "+name);
    }
    public static void main(String[] args) {   // main level
        System.out.println("*** j26_Abstract.Main meth. run ***");
        System.out.println("j26_Abstract.Main meth. before update name : "+name);
        name = "JavvaMain";
        System.out.println("j26_Abstract.Main meth. after update name : "+name);
        System.out.println("*** j26_Abstract.Main method is over ***");

    } //end of main

    static {
        System.out.println("*** 1. static blok run ***");
        System.out.println("1. static blok before update name : "+name);
        name = "JavvaHan";
        System.out.println("1. static blok after update name : "+name);
    }

}  // end of Class
