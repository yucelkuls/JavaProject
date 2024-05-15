package j30_Map;

import java.util.HashMap;

public class C03_get {
    public static void main(String[] args) {
        //map.get(key);->girilen key'e ait value return eder

        HashMap<String, String> hm = new HashMap<>();//bos hm tanımlandı
        hm.put("Amazon", "296 Euro");
        hm.put("Saturn", "200 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple", "450 Euro");
        hm.put("Teknosa", "333 Euro");
        hm.put("Media Markt", "444 Euro");
        System.out.println("hm = " + hm); // {Apple=450 Euro, Saturn=200 Euro, Teknosa=333 Euro, Media Markt=444 Euro, Amazon=296 Euro, Vatan=111 Euro}
        System.out.println("hm.get(\"Amazon\") = " + hm.get("Amazon")); // 296 Euro
        System.out.println("hm.get(\"amazon\") = " + hm.get("amazon")); // null (case sensitive old.icin olmayan key value olarak null return)
        System.out.println("hm.get(33) = " + hm.get(33)); // null

    }
}
