package j03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C01_ScannerClass {

    //Scanner bir Java Class'idir, bu Class'i kullanabilmek icin "import" edilmeli.
//Scanner Class'i Java nin util kutuphanesindedir.

// kullanıcıdan veri almak içinn şu adım takip edilir
//1. adım-> Scanner class'dan obj create edilir.

//  Scanner input = new Scanner(System.in);// Scanner classından input isminde değerini System içinden alan bir obj.

//  // 2 adım->Kullanıcıdan istenen veri için bildirimde bulunulur->sout("...");
//  System.out.print("adınızı giriniz :");

//  // 3. adım-> kulanıcının girdigi veri data type'ne göre bir variable atanır.

    public static void main(String[] args) {


        // task-> kullanıcının girdigi değere göre karenin alanını print eden code create ediniz

        // 1. adim Scanner obje create edilir.

        Scanner scan = new Scanner(System.in);

        // 2. adim bilgilendirme

        System.out.println("Karenin kenar uzunlugunu giriniz : ");

        // 3. adim Kullanicinin girdigi deger uygun bir variable atanır.

        int kenar = scan.nextInt();
        int kareAlan = kenar * kenar;
        System.out.println("Karenin alani = "+kareAlan);  //1. yontem
        System.out.println("Karenin alani = "+(kenar * kenar));  //2. yontem


        /*
 Task->
 Kullanicinın  gunde içtiği  cay ve kullandığı  seker değerine göre
 Bir yilda kac kg seker kullandigini hesaplayan bir code create ediniz...
 1 seker = 1.7 gr
 Ornek : Input : cay sayisi : 10 seker sayisi :
         Output : Yilda 12.41 kg seker kullaniyorsunuz
 */

        // 2. adimdan basliyoruz

        System.out.println("Gunde kac bardak cay iciyorsunuz?");

        // 3. adim
        int cay = scan.nextInt();

        // 2. adim tekrar
        System.out.println("Caya kac seker atiyorsunuz?");

        int seker = scan.nextInt();

        System.out.println("Yilda " + ((cay * seker * 1.7 * 365)/1000) + " kg seker kullaniyorsun");








    }
}
