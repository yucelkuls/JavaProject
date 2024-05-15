package j07_StringManipulation;

import java.util.Scanner;

public class C05_Starts_EndsWith {
    public static void main(String[] args) {
        /*
 startsWith()
 Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
 String'in basladigi characteri dogrular
 endsWith()
 Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
*/
        String str1 = "aliVeli";
        System.out.println("str1 = " + str1);
        //str1.startsWith('a'); // CTE hatasi parametre olarak char almaz!!!
        System.out.println("str1.startsWith(\"a\") = " + str1.startsWith("a")); // true
        String str2 = "ali";
        System.out.println("str1.startsWith(str2) = " + str1.startsWith(str2)); // true
        System.out.println("str2.startsWith(str1) = " + str2.startsWith(str1)); // false
        System.out.println("str2.startsWith(str2) = " + str2.startsWith(str2)); // true

        System.out.println("str2.endsWith(str2) = " + str2.endsWith(str2)); // true
        System.out.println("str2.endsWith(str1) = " + str2.endsWith(str1)); // false
        System.out.println("str1.startsWith(\"V\", 3) = " + str1.startsWith("V", 3)); // true


        //Task-> girilen e-mail hesabının  @gmail.com bitmiyorsa "lütfen gmail hesabı giriniz"
        // @gmail.com ile  bitiyorsa "hesabınız onaylandı" aksi durumda "geçerli hesap giriniz print edn code creae ediniz.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Gmail hesabinizi girin: ");
        String gmail = scanner.next();

        // 1.yol
//        if (gmail.endsWith("@gmail.com")) {
//            System.out.println("Gmail hesabınız onaylandı.");
//        }else System.out.println("Lutfen gmail hesabi giriniz.");
//    }
        // 2.yol
        System.out.println(gmail.endsWith("@gmail.com") ? "Gmail hesabınız onaylandi" : "Lutfen gmail hesabi giriniz! ");
    }
}
