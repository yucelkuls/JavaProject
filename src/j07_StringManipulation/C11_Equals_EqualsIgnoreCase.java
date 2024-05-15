package j07_StringManipulation;

public class C11_Equals_EqualsIgnoreCase {
    public static void main(String[] args) {
        /* equals()
         * 2 String metnin birbirine esit olup olmadigina bakar. büyük küçük harf farkı vardır. Sonuc boolean dir.
         *
         *  equals() method'u verilen iki String'in içeriğinin birbirine eşit olup olmadığını kontrol eder.
         * == karşılaştırma operatörü ise verilen iki String objesinin değerinin yanında reference(adres)'lerine de bakar.
         * Aynı değere sahip olsa da farklı iki objeyi == ile karşılaştırdığımızda sonuç FALSE olur.

         * equalsIgnorecase()
         * equals() ile ayni islevi gorur, tek farki buyuk kucuk harfe duyarliligi yoktur. Sonuc boolean dir.
         */

        String str1 = "Enes";
        String str2 = "enes";

        System.out.println("str1.equals(str2) = " + str1.equals(str2)); // false
        System.out.println("str2.equals(str1) = " + str2.equals(str1)); // false
        System.out.println("str1.equals(\"Enes\") = " + str1.equals("Enes")); // true
        System.out.println("str1.equalsIgnoreCase(str2) = " + str1.equalsIgnoreCase(str2)); // true

        String str3 = "Sema"; // String pool, referanslar ayni yerde tutuluyor.
        String str4 = "Sema"; // String pool, referanslar ayni yerde tutuluyor.
        String str5 = new String("Sema"); // String data type unique bir adres/referans tanimliyor.
        String str6 = new String("Sema"); // String data type unique bir adres/referans tanimliyor.
        System.out.println(str3 == str4); // true
        System.out.println("str3.equals(str4) = " + str3.equals(str4)); // true
        System.out.println("str3 == str5 = " + str3 == str5); // false
        System.out.println("str5 == str6 = " + str5 == str6); // false
        System.out.println("str5.equals(str6) = " + str5.equals(str6)); // true

        String sa="Saim";
        String sb="";
        sb=sa+"";
        System.out.println("sa = " + sa);//Saim
        System.out.println("sb = " + sb);//Saim
        System.out.println(sa==sb);//false
        System.out.println(sa.equals(sb));//true
        /*
String s1 = "text"; kullanımı, eğer varsa, string sabit havuzunda (string constant pool) bir örneği yeniden kullanır.
Yoksa havuz içerisinde yeniden alan oluşturur. Bu durum Java'ya özgü Java Sanal Makinesi (JVM) tarafından gerçekleştirilen bir durumdur.

s1 ve s2 String constant pool içerisinde aynı referans değere (reference) sahiptir. s3 ve s4 ise farklı nesneleri ifade eder.
s1 == s2 , s1 ve s2 'nin hafızadaki adres değerlerini karşılaştırır ve  String constant pool üzerinde aynı adresi gösterirler.
Böylece ekrana TRUE yazdırır.
s1.equals(s2) ifadesi ise, nesneler içerisindeki değerleri (clarusway) karşılaştırdığı için ekrana TRUE yazdırır.
Bildiğimiz gibi == operatörü hafızadaki adresleri karşılaştırır, s3 ve s4 birbirinden farklı nesneler oldukları
için farklı adreslerde tutulurlar.  Bu yüzden s3 == s4 ifadesi ekrana FALSE yazdırır.
s3.equals(s4) ifadesi ise, nesneler içerisindeki değerleri (clarusway) karşılaştırdığı için ekrana TRUE yazdırır.
        */


    }
}
