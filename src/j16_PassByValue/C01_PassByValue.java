package j16_PassByValue;

public class C01_PassByValue {
    public static void main(String[] args) {
/*
Java Pass By Value bir programlama dilidir.
Bir  primitive  variable  argument olarak bir methoda call edildiğinde variable
değil bir copy clone (vesikalık) (pointer)değeri gönderilir.

 */

        // task -> verilen fiyat için %24 artırılmış fiyatı print eden METHOD  create ediniz.
        double fiyat=100;
        System.out.println("Meth call oncesi fiyat : "+fiyat);
        System.out.println("fiyatArttir(fiyat) = " + fiyatArttir(fiyat));
        fiyatAzalt(fiyatArttir(fiyat));
        fiyatAzalt(fiyat);
        System.out.println("Meth call sonrasi fiyat : "+fiyat);
    }

    private static void fiyatAzalt(double fyt) {
        System.out.println("Fiyatin azaltilmis hali :"+(fyt*0.76));
    }

    private static double fiyatArttir(double fyt) {
        return fyt*1.24;
        //System.out.println("Fiyatin arttirilmis hali :"+(fyt*1.24));
    }
}
