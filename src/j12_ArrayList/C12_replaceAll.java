package j12_ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C12_replaceAll {
    public static void main(String[] args) {
        //replaceAll();-> List'te belirli bir elemanı belirli bir elemana update eder.treu/ false return eder

        ArrayList<String> ulkeList = new ArrayList<>(List.of("Almanya", "Isvec", "Danimarka", "Belcika", "Hollanda", "Finlandiya"));
        System.out.println("replaceAll oncesi ulkeList = " + ulkeList);

        System.out.println("Collections.replaceAll(ulkeList, \"Danimarka\", \"Fransa\") = "
                           + Collections.replaceAll(ulkeList, "Danimarka", "Fransa"));


        System.out.println("replaceAll sonrasi ulkeList = " + ulkeList);

        //fill()-> list'tin tum elemanlarını istenen değere update eder...

        Collections.fill(ulkeList, "Turkiye");
        System.out.println("fill sonrasi ulkeList = " + ulkeList);
    }
}
