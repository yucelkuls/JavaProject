package j12_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C08_set {
    public static void main(String[] args) {
        //set()-> listin istenen index'e istenen elemanını  update set eder-> şu indexin şu elelmanını şununla değiştir...

        ArrayList<String> ulkeList = new ArrayList<>(List.of("Almanya", "Isvec", "Danimarka", "Belcika", "Hollanda", "Finlandiya"));
        System.out.println("ulkeList set yapilmadan once = " + ulkeList);
        // [Almanya, Isvec, Danimarka, Belcika, Hollanda, Finlandiya]

        System.out.println("ulkeList.set(2, \"Izlanda\") = " + ulkeList.set(2, "Izlanda")); // Danimarka
        System.out.println("ulkeList set den sonra = " + ulkeList);
        // [Almanya, Isvec, Izlanda, Belcika, Hollanda, Finlandiya]

        System.out.println("ulkeList.set(7, \"Turkiye\") = " + ulkeList.set(7, "Turkiye"));
        // .IndexOutOfBoundsException Olmayan index!!!
        //   ulkeList.set(3, "Fransa", 4, "Romanya"); // CTE
    }
}
