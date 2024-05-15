package j30_Map;

import java.util.HashMap;

public class C06_putAll {
    public static void main(String[] args) {
        // map.putAll();-> Girilen map istenen map'e eklenir.

        HashMap<String, String> hm = new HashMap<>();//bos hm tanımlandı

        hm.put("Amazon", "296 Euro");
        hm.put("Saturn", "200 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple", "450 Euro");
        hm.put("Teknosa", "333 Euro");
        hm.put("Media Markt", "444 Euro");
        System.out.println("hm putAll() ONCESI = " + hm);

        HashMap<String, String> hm1 = new HashMap<>();//bos hm tanımlandı

        hm1.put("javaCAN ", "abdullah");
        hm1.put("javaNAZ", "sebinem");
        hm1.put("javaTAR", "busura");
        hm1.put("javvaNUR", "sennur");
        hm1.put("javaSU", "ayse");
        System.out.println("hm1 putAll() ONCESI = " + hm1);

        hm.putAll(hm1);
        System.out.println("hm putAll() SOnRASI = " + hm); // {javvaNUR=sennur, Apple=450 Euro, javaNAZ=sebinem, Saturn=200 Euro, Teknosa=333 Euro, javaTAR=busura, Media Markt=444 Euro, javaCAN =abdullah, javaSU=ayse, Amazon=296 Euro, Vatan=111 Euro}
        System.out.println("hm1 putAll() SONRASI = " + hm1); //{javvaNUR=sennur, javaNAZ=sebinem, javaTAR=busura, javaCAN =abdullah, javaSU=ayse}

        HashMap<String,String> hm3=hm1; // hm1 key value hm3 atandi.
        System.out.println("hm3 = " + hm3);
        System.out.println("hm1 = " + hm1);

        HashMap<String,String> hm4 = new HashMap<>(hm3); //hm3 key value hm4 e atandi.
        System.out.println("hm4 = " + hm4);


    }
}
