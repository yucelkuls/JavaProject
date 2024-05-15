package j09_Break_Continue;

import java.util.Scanner;

public class C01_Break {
    public static void main(String[] args) {
         /*
    break loop'u istenen yerden sonlandırmak için döngüyü kontrol edebiliriz.Bir loop'u, loop'un koşul bölümüne bağlı
    kalmaksızın sona erdirmek için break komutu kullanılır. break komutu loop'a bağlı kod bloğunun
    herhangi bir işlem satırında yer alabilir. Program kod bloğunda break komutu'nu görür görmez,
    loop başlangıç koşulu sağlanmış olsa bile, loop'dan çıkar ve loop'dan sonra gelen ilk işlem
    satırından çalışmasına devam eder. İç içe(nested) looplarda break komutu kullanıldığında sadece
    içinde kullanıldığı loop'dan çıkışı sağlar:
    temelde döngüden atlamak için kullanılır, çoğunlukla if-else deyimi ile kullanılır
     */

        //Task-> girilen bir mail hesabı @ karakterine kadar olan karakterleri print eden code create ediniz...
        // ebikgabık@cimeyıl.com

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a mail address");
        String mail = scanner.next();

        for (int i = 0; i < mail.length(); i++) {
            if (mail.charAt(i) == '@') {
                break;
            }
            System.out.print(mail.charAt(i));

        }


//        int index = 0;
//        while (index != mail.indexOf("@")) {
//            System.out.print(mail.charAt(index));
//            index++;
//        }
    }
}
