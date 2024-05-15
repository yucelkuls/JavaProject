package j12_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_size {
    public static void main(String[] args) {
        //size()-> listin eleman sayısını return eder.(arr->length)
        ArrayList<String> ulkeList = new ArrayList<>(List.of("Almanya", "Isvec", "Danimarka", "Belcika", "Hollanda", "Finlandiya"));
        System.out.println("ulkeList.size() = " + ulkeList.size()); // 6
        List<String> sehirList = new ArrayList<>();  // Bos bir arrayList
        System.out.println("sehirList.size() = " + sehirList.size()); // 0
    }
}
