package j12_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_get {
    public static void main(String[] args) {
        //get()-> listte girilen index'deki elemanı return eder. olmayan index için RTE exc. fırlatır

        ArrayList<String> ulkeList = new ArrayList<>(List.of("Almanya", "Isvec", "Danimarka", "Belcika", "Hollanda", "Finlandiya"));
        System.out.println("ulkeList.get(2) = " + ulkeList.get(2)); // Danimarka
        System.out.println("ulkeList.get(8) = " + ulkeList.get(8)); // IndexOutOfBoundsException

    }
}
