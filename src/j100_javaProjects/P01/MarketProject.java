package j100_javaProjects.P01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MarketProject { // Class level
    /* TASK :
     * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
     * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
     *
     * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
     * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
     * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
     * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
     * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
     *            for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     *            ortalama kazançtan yüksekse o günleri return yap.
     * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
     *            for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     *            ortalama kazançtan aşağıysa o günleri return yap.
     * */
    static List<String> gunler = new ArrayList<>(Arrays.asList("Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar"));
    static List<Double> gunlukKazanc = new ArrayList<>(Arrays.asList()); // 2.adim
    static Scanner input = new Scanner(System.in);
    static double haftaninToplamKazanci = 0;

    public static void main(String[] args) { // main level

        // 3.adim
        int gun = 0;
        while (gun < 7) {
            System.out.println("Lütfen " + gunler.get(gun) + " günü kazancini giriniz: ");
            double gununKazanci = input.nextDouble();
            haftaninToplamKazanci += gununKazanci;
            gunlukKazanc.add(gununKazanci);


            gun++;
        }
        System.out.println("Bu haftalik toplam kazanc : "+ haftaninToplamKazanci);
        System.out.println("Gunluk kazanclar listesi : "+ gunlukKazanc);
        System.out.println("getOrtalamaKazanc() = " + getOrtalamaKazanc());
        System.out.println("getOrtalamaninUstuKazancGunleri() = " + getOrtalamaninUstuKazancGunleri());
        System.out.println("getOrtalamaninAltindaKazancGunleri() = " + getOrtalamaninAltindaKazancGunleri());
    } // main sonu

    private static ArrayList<String> getOrtalamaninAltindaKazancGunleri() {
        ArrayList<String> ortalamaninAltindaGunler = new ArrayList<>();
        for (int i = 0; i < gunlukKazanc.size(); i++) {
            if (gunlukKazanc.get(i) < getOrtalamaKazanc()){
                ortalamaninAltindaGunler.add(gunler.get(i));
            }
        }
        return ortalamaninAltindaGunler;
    }

    private static ArrayList<String> getOrtalamaninUstuKazancGunleri() {  // 5. adim
        ArrayList<String> ortalamaninUstuGunler = new ArrayList<>(); // ortalamayi gecen gunler icin bos liste.
        for (int i = 0; i < gunlukKazanc.size(); i++) {
            if (gunlukKazanc.get(i) > getOrtalamaKazanc()){
                ortalamaninUstuGunler.add(gunler.get(i));
            }
        }
        return ortalamaninUstuGunler;
    }

    private static double getOrtalamaKazanc() {
        return haftaninToplamKazanci / 7;
    }
} // Class sonu
