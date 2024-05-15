package j04_JavaOperators.j03_Comparison_Karsilastirma_Operators;

public class C01_KarsilastirmaOperatoru {
    /*
 Comparator : Karsilastirma islemleri.
 Java'da iki variable'in degeri karlilastirildiginda Java sonuc olarak boolean(true-false) return eder

 ==     Esit               x == y
 !=     Esit degil         x != y
 >      buyuk              x > y
 <      kucuk              x < y
 >=     buyuk esit         x >= y
 <=     kücük esit         x <= y
Unlem isareti (!) olumsuzluk anlaminda kullanilir.
  */

    public static void main(String[] args) {

        int semaYas = 27;
        int abdYas = 30;

        System.out.println("semaYas esit mi abdYas = " + (semaYas == abdYas)); // false

        System.out.println("semaYas esit degil mi abdYas = " + (semaYas!= abdYas)); // true

        System.out.println("semaYas buyuk mu abdYas = " + (semaYas > abdYas)); // false
        System.out.println("semaYas kücük mu abdYas = " + (semaYas < abdYas)); // true

        /* s1 ve s2 String constant pool içerisinde aynı referans değere (reference) sahiptir.
s1 == s2 , s1 ve s2 'nin hafızadaki adres değerlerini karşılaştırır ve
 String constant pool üzerinde aynı adresi gösterirler.
 Böylece ekrana TRUE yazdırır.
    */

        String s1 = "Can Yucel";
        String s2 = "Can Yucel";
        System.out.println(s1 == s2); // true
        String s3 = new String("Can Yucel"); // Burada tamamen yeni bir string oluşturuldu.
        System.out.println("s1 == s3 : " + (s1 == s3)); // false


    }
}
