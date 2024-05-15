package j07_StringManipulation;

import java.util.Scanner;

public class C10_IndexOf_LastIndexOf {
    public static void main(String[] args) {
        /* indexOf()->aranan yolcunun koltuk numarasını verir
  char karakter ya da String metnin kacinci indexden basladigini veren bir method dur. Sonuc integer dir.
  Bu method index'i sorulan char'in String icindeki ilk gorunumunun index'ini return eder
  contains den farkı indexini verir, contains ise true false
*/
        String str = "madem geldin dunyaya calis JAVA'ya";
        System.out.println("str.indexOf('y') = " + str.indexOf('y')); // Ilk y harfidir ve 16. indexdedir.
        System.out.println("str.indexOf(\"e\") = " + str.indexOf("e")); // Ilk e harfidir ve 3. indexdedir.
        // Metnin icinde kelimeyi de arayabiliriz. Kelimenin gectigi ilk indexi verir.

        System.out.println("str.indexOf(\"JAVA\") = " + str.indexOf("JAVA")); // 27
        System.out.println("str.indexOf(\"java\") = " + str.indexOf("java")); // -1 (olmayan kelimede -1 verir)
        // olmayan bir char yada string aransa CTE yada RTE hatasi vermez sadece -1 return eder.

        System.out.println("str.indexOf(\"a\",12) = " + str.indexOf("a", 12)); // 17

        /* lastIndexOf()
String içinde aranan karakter(ler)in sondan itibaren ilk indexini verır
indexOf un sondan olan hali fakat index numaraları değişmez.
lastIndexOf() Method'u index'i sorulan character'in son gorunumunun index'ini return eder.
indexOf() methodunda birden fazla character'in index'i sorulursa ilk character'in index'i return edilir.
*/
        System.out.println("str.lastIndexOf(\"a\") = " + str.lastIndexOf("a")); // 33.index
        System.out.println("str.lastIndexOf('x') = " + str.lastIndexOf('x')); // -1
        System.out.println("str.lastIndexOf('s') = " + str.lastIndexOf('s')); // 25
        System.out.println("str.length() = " + str.length()); // 34 uzunluk.

 /* Task-> girilen bir string ifadenin aşağıdaki şartları sağlamasını kontrol eden code create ediniz
a-) girilen ifade java içermiyor
b-) girilen ifade 1 adet java içeriyor
c-) girilen ifade  1'den çok java içeriyor
 */

        Scanner input = new Scanner(System.in);
        System.out.println("Bir metin giriniz");
        String metin = input.nextLine();
        if (!metin.contains("java")){
            System.out.println("Bu metinde java bulunamadı");
        }else if(metin.indexOf("java") == metin.lastIndexOf("java")){
            System.out.println("Bu metinde java bir defa kullanilmis");
        }else System.out.println("Metinde birden fazla java kullanilmis");

    }
}
