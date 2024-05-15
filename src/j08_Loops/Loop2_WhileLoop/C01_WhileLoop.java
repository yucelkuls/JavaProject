package j08_Loops.Loop2_WhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {
    public static void main(String[] args) {
        /*
      Başlangıç bitiş ve değişim değerleri net  bilinen tekrarlarda for loop
      ama adım sayısı değişim değeri
      net bilinmeyen belli bir şarta(durum-boolean) bağlı olan tekrarlarda
      while loop kullanılır.
       */
        //Task01-> 3'den 20'ye kadar olan tamsayıları print eden code create ediniz.

        int i = 3;
        while (i <= 20) {
            System.out.print(i + " ");
            i++;
        }

        // task02-> 7 kere javaCAN print eden code create ediniz

        int j = 1;
        while (j <= 7) {
            System.out.println("javaCAN");
            j++;
        }

        // task03->2 basamaklı tek sayıları print eden code create ediniz

        int k = 11;
        while (k < 100) {
            System.out.print(k + " ");
            k+=2;
        }

        // task04->girilen ifadeyi tersten  print eden code create ediniz
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir ifade giriniz");
        String str = scanner.nextLine();

        int index = str.length()-1;
        while (index >= 0) {
            System.out.print(str.charAt(index));
            index--;
        }


        // task05->girilen pozitif  tamsayıya kadar sayıların toplamını  print eden code create ediniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayi = scan.nextInt();
        int toplam = 0;
        while (sayi > 0) {
            toplam += sayi;
            sayi--;
        }
        System.out.println(toplam);


        // task06->girilen tamsayının faktöriyelini  print eden code create ediniz

        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int num = sc.nextInt();
        int fact = 1;
        while (num > 1) {
            fact *= num;
            num--;
        }
        System.out.println("Factorial = " + fact);
    }
}
