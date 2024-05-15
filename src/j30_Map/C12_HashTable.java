package j30_Map;

import java.util.Hashtable;

public class C12_HashTable {
    public static void main(String[] args) {
         /*
HashTable ->
HashMap'e kullanılan  tüm methodlar hashTable obj ile de call edilir.
1- HashMap ve TreeMap thread-safe ve synchronized olmadıgı için Map'lar arasında thread-safe ve synchronize
olan bir map'e ihityaç oldugundan Hashtable tanımlanmıştır.
2-HashTable HashMap'e göre daha yavaştır
3-HashTable key ve value'lerda null değere izin vermez.
4-HashTable eleman ataması yapılırken  HashMap randum(rastgele: hurra )  yapar.
 */

        Hashtable<String, String> ht = new Hashtable<>();//bos hm tanımlandı

        ht.put("Amazon", "296 Euro");
        ht.put("Saturn", "200 Euro");
        ht.put("Vatan", "111 Euro");
        ht.put("Apple", "450 Euro");
        ht.put("Teknosa", "333 Euro");
        ht.put("Media Markt", "");

        System.out.println("ht = " + ht);
        //System.out.println("ht.put(\"javaCAN\", null) = " + ht.put("javaCAN", null)); // RTE -> NullPointerException
        //System.out.println("ht.put(null, \"javaSU\") = " + ht.put(null, "javaSU")); // RTE -> NullPointerException

        Hashtable<String, String> ht1 = new Hashtable<>();//bos hm tanımlandı

        ht1.put("falan", "filan");
        ht1.put("ebik", "gabık");
        ht1.put("ıkır", "zıkır");
        ht1.put("vıddı", "vıddı");
        ht1.put("nörüyong", "nişleding");

        System.out.println("ht1 = " + ht1); //{ebik=gabık, vıddı=vıddı, falan=filan, nörüyong=nişleding, ıkır=zıkır}
        ht.putAll(ht1);
        System.out.println("ht putAll() SONRASI = " + ht); //{Amazon=296 Euro, Media Markt=, Apple=450 Euro, Teknosa=333 Euro, nörüyong=nişleding, ıkır=zıkır, falan=filan, ebik=gabık, Saturn=200 Euro, vıddı=vıddı, Vatan=111 Euro}

    }
}
