package j06_SwitchStatement;

import java.util.Scanner;

public class C01_SwitchCase {
    /*
   Switch-Case yapısı  if statement'e benzer action alır.
   Çok sayida if statement bloklari code okunabilirliği ve clean code olarak tavsiye edilmez. Bir app actionda sabit bir degeri
   çoklu durum ile karsilastirmak için switch-case blok kullanılır. Switch-case blok'da  degiskene göre bir
   çok durumdan değişkene uyan durum gerçeklesir.
   if statement blok ile  switch-case blok birlikte tanımlanabiir.
   çoklu koşul içeren durumlarda switch-case blok if statement'e göre app. hızı açısından daha avantajlıdır.(Best Practice)
    Switch-Case ile if statement arasında önemli bir performans farklılığı yoktur.

     ahan da CISSS TRICK-> Switch Statement'de long,double,float ve boolean asla KULLANILMAZZZ!
     Switch de sadece int, byte, short, char, String data type  kullanilabilir
     Eger 3 den fazla durum varsa switch() tercih edilir.
*/
    public static void main(String[] args) {
// Task-> verilen bir rakamın harf karakteri ile print eden code create ediniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        switch (number) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                System.out.println("Incorrect entry");
        }
    }
}
