package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class C03_TernaryOperator {
    /*
Ternary ile yapılan tum actionlar if-else blok ile de yapılır.
Ternary blok code daha clean daha okunabilir ve anlaşılabilir olması için tercih edilir.
Ternary blok içinde komplex code yerine daha basic ve doğrudan sonuç üreten code'lar bulunur.
 */
    public static void main(String[] args) {

        // Task01-> girilen bir tamsayının  tek-çift olmasını kontrol eden code create ediniz.


        Scanner scan = new Scanner(System.in);
        int num =scan.nextInt();
        // condition(şart)  ? (if-ise) sart True için ACTION-> if body : (else-değilse) sart False için ACTION -> else body;
        System.out.println((num % 2 == 0) ? "Even" : "Odd");

        // Task02-> girilen bir tamsayının  pozitif olmasını kontrol eden code create ediniz.

        System.out.println("Enter a number");
        int num2 =scan.nextInt();

        System.out.println((num2 > 0)? "Positive" : "Negative");

        /*
ahan da trick köşesinde böğünn : ternary operator action sonucu true veya false  a göre verecği output(çıktı) eğer
data type uygun bir variable(container->kutu) a atanmazsa CTE verir.
Çözüm olarak teranry çıktısı ya bir variable atanmalı yada sout gibi doğrudan bir action'da kullanılmalı
 */

        // Task03-> girilen iki tamsayının buyugunu print eden code create ediniz.

        System.out.println("Enter first number");
        int num3 =scan.nextInt();
        System.out.println("Enter second number");
        int num4 =scan.nextInt();

        System.out.println((num3 > num4)? "First number is greater" : "Second number is greater");

        // Task04-> girilen iki tamsayının işaretleri farklı ise toplamını değilse "agam DEWAMKEEE" print eden code create ediniz.

        System.out.println((num3 * num4 < 0)? num3 + num4 : "Go ahead!");

        // Bunu sout disinda yapabilmek icin "Object" class ini kullaniriz.
        //hap bilgi -> Ternary ciktisi farkli data type'lardan(int,String,boolean vb) tanimlanmissa
        //tum data type atasi olan Hz.Adem classina(Object) atanir

        Object sonuc = num3 * num4 < 0? num3 + num4 : "Go ahead!";
        System.out.println(sonuc);

    }

}
