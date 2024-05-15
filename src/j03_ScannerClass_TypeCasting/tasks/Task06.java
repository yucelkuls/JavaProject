package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task06 {

    /*
Math.pow(): Math sınıfında bulunan bu metot üs alma işlemini gerçekleştirir. 2 değer alır,
            Math.pow(taban,üst) şeklinde kullanılır.
Math.sqrt(): Bu metot, bir sayının karekökünü bulur. 1 parametre alır. Almış olduğu parametreyi double türünden değere döndürür.
             Bunun için bir farklı veri tipinde değişkene atanacaksa, cast işleminin gerçekleştirilmesi gerekir.
Math.abs(): Bir sayının mutlak değerini almak için kullanılır. Negatif bir sayıyı pozitife çevirerek gösterir.
            Math.abs() metodunda parametre int türünde ise cast işlemi gerçekleştirmemize gerek yoktur.
Math.floor(): Parametre olarak alınan tamsayı değeri bir altındaki değere yuvarlar.
Math.ceil(): Bu metot, Math.floor metodunun aksine, parametre olarak aldığı değeri bir üst değere yuvarlar.
             (Double değer döndürdüğünden dolayı 3 olarak verilen parametreyi 3.0 olarak kabul eder ve yuvarlama işlemi gerçekleştirmez.)
Math.max(): 2 parametre alır ve verilen parametrelerden büyük olanı bulur.
Math.min(): Bu metot, Math.max metodunun aksine verilen iki sayıdan küçük olanı bulur.
Math.random(): Bu metot, rastgele sayı üretmek için kullanılır.
               Bu metot 0.0 ile 1.0 arasında double veri tipinde değerler üretir.
 */

    public static void main(String[] args) {

    /* Task->
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.
        hipotenus=birinciKenar*birinciKenar+ikinciKenar*ikincikenar karekoku
        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first side : ");
        double firstSide = scan.nextInt();
        System.out.println("Enter second side : ");
        double secondSide = scan.nextInt();

        System.out.println("Hipotenus : " + Math.sqrt((Math.pow(firstSide, 2)) + (Math.pow(secondSide, 2))));






    }
}
