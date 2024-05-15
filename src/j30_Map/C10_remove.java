package j30_Map;

import java.util.HashMap;

public class C10_remove {
    public static void main(String[] args) {
        // map.remove(); -> Girilen entry map'de var ise siler ve true return eder yoksa false return eder.
// parametre entry değil sadece key değer girilirse key map'de varsa siler ve silinen key value return eder yoksa null return eder

        HashMap<String, String> hm = new HashMap<>();//bos hm tanımlandı

        hm.put("Amazon", "296 Euro");
        hm.put("Saturn", "200 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple", "450 Euro");
        hm.put("Teknosa", "333 Euro");
        hm.put("Media Markt", "444 Euro");
        System.out.println("hm remove() ONCESI= " + hm);// {Apple=450 Euro, Saturn=200 Euro, Teknosa=333 Euro, Media Markt=444 Euro, Amazon=296 Euro, Vatan=111 Euro}
        System.out.println("hm.remove(\"Vatan\", \"Millet\") = " + hm.remove("Vatan", "Millet")); // false
        System.out.println("hm.remove(\"Teknosa\", \"333 Euro\") = " + hm.remove("Teknosa", "333 Euro")); // true
        System.out.println("hm.remove(\"YOK\") = " + hm.remove("YOK")); // null
        System.out.println("hm.remove(\"Apple\") = " + hm.remove("Apple")); // 450 Euro
        System.out.println("hm remove() SONRASI= " + hm);// {Saturn=200 Euro, Media Markt=444 Euro, Amazon=296 Euro, Vatan=111 Euro}
    }
}
