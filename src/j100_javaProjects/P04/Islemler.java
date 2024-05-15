package j100_javaProjects.P04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {
    static String kisiTuru;  // istenen meth call edilmsi icin static tanimlandi
    static Scanner input = new Scanner(System.in);
    static List<Ogretmen> ogretmenList = new ArrayList<>();
    static List<Ogrenci> ogrenciList = new ArrayList<>();

    public static void girisPaneli() {
        System.out.println("**********************************      \nOGRENCI VE OGRETMEN ANA MENU \n**********************************\n"
                           + "1- OGRENCI ISLEMLERI\n2- OGRETMEN ISLEMLERI\nQ- CIKIS \n"
                           + "Lutfen yapmak istediginiz islemi giriniz : ");
        String islemSecim = input.next().toUpperCase();
        switch (islemSecim) {
            case "1":
                kisiTuru = "OGRENCI";
                islemMenu();
                break;
            case "2":
                kisiTuru = "OGRETMEN";
                islemMenu();
                break;
            case "Q":
                cikis();
                break;
            default:
                System.out.println("Invalid entry, please try again...");
                girisPaneli();  // recursive
                break;
        }
    }

    public static void islemMenu() {
        System.out.println("Sectiginiz kisi turu: " + kisiTuru + "\nISLEM MENU\nLutfen asagidaki islemlerden tercih yapiniz.\n"
                           + "*********** " + kisiTuru + " ISLEMLER ************\n 1-EKLEME\n 2-ARAMA\n 3-LISTELEME\n 4-SILME\n 0-ANA MENU \n" +
                           "Islem Tercihinizi giriniz : ");
        String islemTercihi = input.next();
        switch (islemTercihi) {
            case "1":
                ekle();
                break;
            case "2":
                ara();
                break;
            case "3":
                listele();
                break;
            case "4":
                sil();
                break;
            case "0":
                girisPaneli();
                break;
            default:
                System.out.println("Invalid entry, please try again...");
                girisPaneli();  // recursive
                break;
        }
    }

    private static void sil() {
        System.out.println("  ***   " + kisiTuru + "   SILME sayfasi   ***   ");
        if (kisiTuru.equalsIgnoreCase("OGRENCI")) { // ogrenci secimi
            System.out.println("Silinecek OGRENCI kimlik no giriniz : ");
            String silinecekOgrcKimlikNO = input.next();
            for (Ogrenci k : ogrenciList) {
                if (k.getKimlikNo().equals(silinecekOgrcKimlikNO)) {
                    ogrenciList.remove(k);
                    System.out.println("Silinecek ogrenci listemizden kaldirildi");
                    break;
                } else {
                    System.out.println("Silinecek ogrenci listemizde kayitli degildir");
                }
            }
            islemMenu();

        } else { // OGRETMEN secimi
            System.out.println("Silinecek OGRETMEN kimlik no giriniz : ");
            String silineceknKimlikNO = input.next();
            for (Ogretmen k : ogretmenList) {
                if (k.getKimlikNo().equals(silineceknKimlikNO)) {
                    ogretmenList.remove(k);
                    System.out.println("Silinecek ogretmen listemizden kaldirildi");
                    break;
                } else {
                    System.out.println("Silinecek ogretmen listemizde kayitli degildir");
                }
            }
            islemMenu();
        }
    }

    private static void listele() {
        System.out.println("  ***   " + kisiTuru + "   LISTELEME sayfasi   ***   ");
        if (kisiTuru.equalsIgnoreCase("OGRENCI")) { // ogrenci secimi
            System.out.println(ogrenciList);
            islemMenu();
        } else { // OGRETMEN secimi
            System.out.println(ogretmenList);
            islemMenu();
        }
    }

    private static void ara() {
        System.out.println("  ***   " + kisiTuru + "   ARAMA sayfasi   ***   ");
        if (kisiTuru.equalsIgnoreCase("OGRENCI")) { // ogrenci secimi
            System.out.println("Aradiginiz OGRENCI kimlik no giriniz : ");
            String arananOgrcKimlikNO = input.next();
            for (Ogrenci k : ogrenciList) {
                if (k.getKimlikNo().equals(arananOgrcKimlikNO)) {
                    System.out.println("Aradiginiz ogrenci " + k.getAdSoyad() + " listemizde kayitlidir");
                    break;
                } else {
                    System.out.println("Aradiginiz ogrenci listemizde kayitli degildir");
                }
            }
            islemMenu();

        } else { // OGRETMEN secimi
            System.out.println("Aradiginiz OGRETMEN kimlik no giriniz : ");
            String muhtesemOgretmenKimlikNO = input.next();
            for (Ogretmen k : ogretmenList) {
                if (k.getKimlikNo().equals(muhtesemOgretmenKimlikNO)) {
                    System.out.println("Aradiginiz ogretmen " + k.getAdSoyad() + " listemizde kayitlidir");
                    break;
                } else {
                    System.out.println("Aradiginiz ogretmen listemizde kayitli degildir");
                }
            }
            islemMenu();
        }
    }

    private static void ekle() {
        System.out.println("  ***   " + kisiTuru + "   EKLEME sayfasi   ***   ");
        if (kisiTuru.equalsIgnoreCase("OGRENCI")) { // ogrenci secimi
            System.out.println("OGRENCI ad-soyad giriniz : ");
            String adSoyad = new Scanner(System.in).nextLine();
            System.out.println("OGRENCI kimlikNo giriniz : ");
            String kimlikNo = input.next();
            System.out.println("OGRENCI ogrcYas giriniz : ");
            int ogrcYas = input.nextInt();
            System.out.println("OGRENCI numara giriniz : ");
            String ogrcNo = input.next();
            System.out.println("OGRENCI sinifi giriniz : ");
            String ogrcSinif = input.next();
            Ogrenci ogrc = new Ogrenci(adSoyad, kimlikNo, ogrcYas, ogrcNo, ogrcSinif);
            ogrenciList.add(ogrc); // uretilen obje ogrcListe eklendi
            System.out.println("Ogrenciniz " + ogrc.getAdSoyad() + " basari ile eklendi..." +
                               "\nOGRENCI ISLEM MENUYE yonlendiriliyorsunuz");
            islemMenu();

        } else { // OGRETMEN secimi
            System.out.println("OGRETMEN ad-soyad giriniz : ");
            String adSoyad = new Scanner(System.in).nextLine();
            System.out.println("OGRETMEN kimlikNo giriniz : ");
            String kimlikNo = input.next();
            System.out.println("OGRETMEN ogrcYas giriniz : ");
            int ogrtYas = input.nextInt();
            System.out.println("OGRETMEN sicilNo giriniz : ");
            String sicilNo = input.next();
            System.out.println("OGRETMEN bolumunu giriniz : ");
            String ogrtBolum = input.next();
            Ogretmen ogrt = new Ogretmen(adSoyad, kimlikNo, ogrtYas, sicilNo, ogrtBolum);
            ogretmenList.add(ogrt); // uretilen obje ogrcListe eklendi
            System.out.println("Ogretmeniniz " + ogrt.getAdSoyad() + " basari ile eklendi..." +
                               "\nOGRETMEN ISLEM MENUYE yonlendiriliyorsunuz");
            islemMenu();
        }
    }

    private static void cikis() {
        System.out.println("Yine bekleriz...");
        System.exit(0);
    }
}