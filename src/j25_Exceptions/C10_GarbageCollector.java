package j25_Exceptions;

import java.util.ArrayList;
import java.util.List;

public class C10_GarbageCollector {
    public static void main(String[] args) {
        String str="";
        for (int i = 0; i < 1000; i++) {
            str.concat(String.valueOf(i));
        }
        /*
        bu kod calistiginda kac tane obje olusur ?
        1001
        ilk basta 1 tane olusturduk
        sonra her dongude str'a concatination yapilacak
        ama String class'i immutable oldugu icin her yeni degeri koymak icin
        yeni bir String objesi olusturulur ve eski obje'den pointer silinir

        dolayisiyla loop bittiginde str icin 1 tane pointer'in isaret ettigi obje,
        1000 tane de hic bir pointer'in israet etmedigi obje heap memory de bulunur.
         */
        List<Integer> list=new ArrayList<>();
        /* bu satir java'ya yeni bir list obje create etmesini komutlar.
        Java yeni obje icin yer var mi diye memory'i kontrol eder ve memory kritik seviyede ise
        Garbage collector'u devreye sokuyor...

        Garbage collector finalize() methodunu calistirir
        finalize method'u silinecek objeleri isaretler ve
        sonra Garbage collector finalized olan objeleri siler.

        1)  Garbage Collector surekli memory'i kontrol ederek  Silinmesi gereken herhangi bir data varsa
    memory'i temiz tutmak icin o data'yi siler.  data'yi silmeden once "finalize" edilir.
    Finalize etmek icin finalize() methodunu call edilir ve method'un ne zaman run edileceğine  Java
    hash code ile arka planda kendisi belirler. code yazılırken istenirse  finalize() methodunu call
    edilebilir ancak methodun ne zaman run edileceğini Java belirler.
	 	2) "final", "finally", "finalize" aciklar misiniz?
    final(keyword): ==> final method override edilemez.
    final variable initialize edilmeli ve  degeri degistirilemez.
    final class child class sahibi olamaz inherit edilemez.

    finally(code block) ==> try-catch block'dan sonra kullanilir ve Exception atilsa da atilmasa da calisir.

    finalize(method) ==> Garbage Collector bir data'yi imha etmeden once calistirir.

           */
    }
}
