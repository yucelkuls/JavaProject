package j12_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C10_equals {
    public static void main(String[] args) {

        //equals()-> iki listin hem index hem de value (değer) eşitliğini kontrol eder true/false return eder.

        ArrayList<String> ulkeList1 = new ArrayList<>(List.of("Almanya", "Isvec", "Danimarka", "Belcika", "Hollanda", "Finlandiya"));
        ArrayList<String> ulkeList2 = new ArrayList<>(List.of("Almanya", "Isvec", "Danimarka", "Belcika", "Hollanda", "Finlandiya"));

        System.out.println("ulkeList1.equals(ulkeList2) = " + ulkeList1.equals(ulkeList2)); // true
        System.out.println("ulkeList2.equals(ulkeList1) = " + ulkeList2.equals(ulkeList1)); // true

        ulkeList2.set(1, "Kuba");
        System.out.println("ulkeList1.equals(ulkeList2) = " + ulkeList1.equals(ulkeList2)); // false

        String[] arr = {"Almanya", "Isvec", "Danimarka", "Belcika", "Hollanda", "Finlandiya"};
        System.out.println("ulkeList1.equals(arr) = " + ulkeList1.equals(arr));
        // false  (Arraylist ile arr kiyasladik ama false)

    }
}
