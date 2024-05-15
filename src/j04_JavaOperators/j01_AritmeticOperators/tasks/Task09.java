package j04_JavaOperators.j01_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task09 {


    /*Task->
     Çiftlikteki hayvanların ayaklarının toplam sayısını bulma.
     Çiftlikteki bulunun inek, koyun, tavukların ayak sayısını print eden code create ediniz.

     */

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

        System.out.println("Ciftlikteki inek sayisini yaziniz : ");
        int inekSayisi = scanner.nextInt();
        System.out.println("Ciftlikteki koyun sayisini yaziniz : ");
        int koyunSayisi = scanner.nextInt();
        System.out.println("Ciftlikteki tavuk sayisini yaziniz : ");
        int tavukSayisi = scanner.nextInt();

        System.out.println("Ciftlikteki hayvanların ayaklarının toplam sayısını bulma : " + (inekSayisi * 4 + koyunSayisi * 4 + tavukSayisi * 2));





    }

}
