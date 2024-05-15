package j30_Map.Tasks;

import java.util.HashMap;
import java.util.Scanner;

public class Find_numbers_of_words {
    ///			KELİME ANALİZİ

    /*
     * Girilen bir metinde kelimelerin kaç kere geçtiğini bulan program yazınız.
     *
     * 1. Adım : ( Kelime = Kaç Kere Geçiyor ) Şeklinde veri tutmak için HashMap oluşturun.
     * 2. Adım : Girilen metni split methodu ile parçalayalım.
     * 			 ilk önce "." ya göre parçalayıp cümleleri elde edelim
     * 			 daha sonra " " boşluğa göre parçalayıp kelimeleri elde edelim
     * 3. Adım : Tüm kelimeleri kontrol etmek için for döngüsü kullanalım ve tüm kelimeleri oluşturduğumuz hashMap'e aktaralım.
     * 			 Eğer hashmap'te yoksa ekleyelim ve sayısına 1 yazalım.
     * 		 	 Eğer hashmap'te zaten varsa, sayısını bir artıralım.
     * 3. Adım : Tüm kelimeler kontrol edildikten çıktı verelim. Ve tüm kelimeleri tekrar sayısıyla birlikte gösterelim.
     *
     * İpucu : "." özel karakter olduğu için "\\." şeklinde split ediniz.
     * */


    ///// örnek bir parçalama çiz

    //		cümle bir. cümle iki
    //		1. cümle bir --- >> cümle (1) , bir (1)
    //		2. cümle iki --- >> cümle (2) , iki (1)


    //// adım adım süre ver bu soruda
    //// noktaya göre parçalama 2 dk
    //// kelimelere göre parçalama 4 dk

    static HashMap<String,Integer> kelimeListesi = new HashMap<>();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Metin girin: ");
        String metin = scan.nextLine();
        String[] cumleler = metin.split("\\.");
        for (int i = 0; i < cumleler.length; i++) {
            String [] kelimeler = cumleler[i].trim().split(" ");
            for (int j = 0; j < kelimeler.length; j++) {
                if (kelimeListesi.get(kelimeler[i])==null){
                    kelimeListesi.put(kelimeler[j],1);
                }else {
                    int sayi = kelimeListesi.get(kelimeler[i]);
                    kelimeListesi.put(kelimeler[j], sayi+1);

                }
            }
        }
        for (String each: kelimeListesi.keySet()){
            System.out.println(each+ " : "+kelimeListesi.get(each));
        }
    }
}