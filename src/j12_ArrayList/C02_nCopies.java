package j12_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C02_nCopies {
    public static void main(String[] args) {
        //nCopies(int n, Obj)-> n elemanlı sabit obj'den oluşan list tanımlar
        ArrayList<String> ulkeList = new ArrayList<>(List.of("Almanya", "Isvec", "Hollanda", "Belcika", "Finlandiya"));
        List<String> isimList = new ArrayList<>(Arrays.asList("Saim", "Safvet", "Halit", "Semra", "Seher", "Enes"));

        List<String> yeniList = new ArrayList<>(Collections.nCopies(7, "JavaCAN"));
        System.out.println("yeniList = " + yeniList);
        // [JavaCAN, JavaCAN, JavaCAN, JavaCAN, JavaCAN, JavaCAN, JavaCAN]


        // adAll(List) -> parametre olarak girilen List i istenen List e ekler.
        System.out.println("Ulke list in ilk hali = "+ulkeList);  //[Almanya, Isvec, Hollanda, Belcika, Finlandiya]
        System.out.println("isimList in ilk hali = " + isimList); //[Saim, Safvet, Halit, Semra, Seher, Enes]
        ulkeList.addAll(isimList);
        System.out.println("ulkeList e isimList eklenmis hali = " + ulkeList);
        // [Almanya, Isvec, Hollanda, Belcika, Finlandiya, Saim, Safvet, Halit, Semra, Seher, Enes]

        isimList.addAll(3, yeniList);
        System.out.println("isimList = " + isimList);
        // [Saim, Safvet, Halit, JavaCAN, JavaCAN, JavaCAN, JavaCAN, JavaCAN, JavaCAN, JavaCAN, Semra, Seher, Enes]
    }
}
