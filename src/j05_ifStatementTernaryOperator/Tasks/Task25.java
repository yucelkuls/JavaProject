package j05_ifStatementTernaryOperator.Tasks;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        /*
        Proje Konusu
        Java dili ile kullanıcıdan alınan tutarın KDV'li fiyatını ve KDV tutarını print eden code create ediniz.

        (Not : KDV tutarını 18% olarak alın)

        Örnek Çıktı
        Tutar Giriniz : 100
        KDV Oranı : %18
        KDV Tutarı : 18.00
        KDV'li Tutar : 118.0
        Bonus Geliştirme
        Eğer girilen tutar 0 ve 500TL arasında ise KDV oranı %18 , tutar 500TL'den büyük ise KDV oranını %8 olarak KDV print eden code create eden
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a price");
        double price = scan.nextDouble();

        double vat;
        if (price> 0 && price <= 500) {
            vat = price * 0.18;
            System.out.println("VAT rate is : %18");
        }else{
            vat = price * 0.08;
            System.out.println("VAT rate is : %8");
        }
        System.out.println("VAT is : " + vat);
        System.out.println("Price and VAT are : " + (price + vat));

    }
}
