package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task04AtmMethod {//amele köyü
    static int bakiye = 1000; // Tum methodlarda kullanilabilmesi icin buraya koyariz.
    static Scanner input = new Scanner(System.in);
    public static void  anaMenu(){
        System.out.println("Lutfen isleminizi seciniz : ");
        int islem = input.nextInt();
        switch (islem){
            case 1:
                bakiyeSorgu();
                break;
            case 2:
                paraCekme();
                break;
            case 3:
                paraYatirma();
                break;
            case 0:
                cikis();
                break;
            default:
                System.out.println("Geçersiz islem girdiniz, tekrar deneyiniz...");
                girisEkrani();
        }
    }
    private static void paraYatirma() {
        System.out.println("Ne kadar para yatiracaksiniz? : ");
        int miktar=input.nextInt();
        bakiye+=miktar;
        System.out.println("Para yatirma islemi basariyla gerceklesti. \nAna menuye yonlendiriliyorsunuz");
        girisEkrani();
    }
    private static void paraCekme() {
        System.out.println("Ne kadar para cekmek istiyorsunuz?");
        int miktar=input.nextInt();
        if (miktar > bakiye) {
            System.out.println("Yetersiz bakiye");
            bakiyeSorgu();
            paraCekme();
        }else{
            System.out.println("Para cekme islemi basariyla gerceklesti. \nAna menuye yonlendiriliyorsunuz");
        bakiye-=miktar;
        }
        girisEkrani();
    }
    private static void bakiyeSorgu() {
        System.out.println("Bakiyeniz : "+ bakiye +"$");
        girisEkrani();  // bu ayni zamanda switch icinde de call edilebilir.
    }
    private static void cikis() {
        System.out.println("ATM den cikis islemi yapildi.");
    }
    public static void girisEkrani(){
        System.out.println();
        System.out.println("*** JavaBANK'a HOSGELDINIZ ***\n" +
                           "ISLEM MENUSU : \n" +
                           "Bakiye Sorgu -> 1\nPara cekme -> 2\nPara Yatirma -> 3\nCikis -> 0");
        anaMenu();
    }
}
