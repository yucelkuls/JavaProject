package j12_ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class C11_remove {
    public static void main(String[] args) {
        //remove()-> list'te istenen elemanı siler
        ArrayList<String> ulkeList = new ArrayList<>(List.of("Almanya", "Isvec", "Danimarka", "Belcika", "Hollanda", "Finlandiya"));
        System.out.println("remove oncesi ulkeList = " + ulkeList);
        System.out.println("ulkeList.remove(1) = " + ulkeList.remove(1)); // Isvec
        System.out.println("remove sonrasi ulkeList = " + ulkeList);
//        System.out.println("ulkeList.remove(33) = " + ulkeList.remove(33)); // RTE -> IndexOutOfBoundsException
        // TRICK -> remove(index) silinen elemani return eder.
        // remove(eleman) silinen elaman varsa true degilse false return eder.

        System.out.println("ulkeList.remove(\"Isvec\") = " + ulkeList.remove("Isvec")); // false
        List<String> sehirList = new ArrayList<>(Arrays.asList("Ankara", "Karaman", "Van", "Gelibolu", "Izmir"));
        ulkeList.addAll(sehirList);
        System.out.println("addAll sonrasi ulkeList = " + ulkeList);
        System.out.println("sehirList = " + sehirList);
        System.out.println("ulkeList.removeAll(sehirList) = " + ulkeList.removeAll(sehirList));
        System.out.println("removeAll sonrasi ulkeList = " + ulkeList);

        System.out.println("sehirList.removeAll(sehirList) = " + sehirList.removeAll(sehirList));
        // true, kendi kendini sildik.
        System.out.println("sehirList = " + sehirList); // []

        List<Integer> sayiList = new ArrayList<>(Arrays.asList(12,14,21,43,65,4,7,67));
        System.out.println("sayiList = " + sayiList);
        System.out.println("sayiList.remove(2) = " + sayiList.remove(2)); // 21 i siliyor.


    }
}
