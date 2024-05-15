package j32_Enum.enum03;

import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
    /*  TASK :
1- Bir Kitap calss'i create ediniz, fields : name ve kategori(Enum)
2- KitapKategori adında bir enum oluşturunuz: Klasik, Roman, Fantezi, Tarih, Ekonomi
3- 3 kitap tanımlayınız bir ArrayList e atınız.
4- bir kategoriye gore listeletiniz.
*/
    public static void main(String[] args) {
        Kitap ktb01 = new Kitap();
        ktb01.name="Leyla ile Mecnun";
      //  ktb01.kategori = "roman";
        ktb01.kategori=Kategori.ROMAN;

        Kitap ktb02 = new Kitap();
        ktb02.name="Suc ve Ceza";
      //  ktb02.kategori = "orman";
        ktb02.kategori=Kategori.ROMAN;

        Kitap ktb03 = new Kitap();
        ktb03.name="Dede Korkut";
     //   ktb03.kategori = "roman";
        ktb03.kategori=Kategori.ROMAN;

        ArrayList<Kitap> kutuphane = new ArrayList<>(Arrays.asList(ktb01,ktb02,ktb03));
//        for (Kitap k: kutuphane){
//            if (k.kategori.equalsIgnoreCase("roman")){
//                System.out.println(k.name);
//            }
//        }
        for (Kitap k: kutuphane){
            if (k.kategori==Kategori.ROMAN){
                System.out.println(k.name);
            }
        }
    }
}
