package j12_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_isEmpty_Clear {
    public static void main(String[] args) {
        //isEmpty()-> listin boş olmasını kontrol eder true/false return eder

        ArrayList<String> ulkeList = new ArrayList<>(List.of("Almanya", "Isvec", "Danimarka", "Belcika", "Hollanda", "Finlandiya"));
        System.out.println("ulkeList.isEmpty() = " + ulkeList.isEmpty()); // false
        System.out.println(ulkeList);

        // clear listin tum elemanlarini siler.

        ulkeList.clear();
        System.out.println("ulkeList.size() = " + ulkeList.size()); // 0
        System.out.println("ulkeList.isEmpty() = " + ulkeList.isEmpty()); // true
        System.out.println("ulkeList = " + ulkeList); // []

    }
}
