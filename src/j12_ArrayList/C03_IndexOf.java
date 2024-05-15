package j12_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_IndexOf {
    public static void main(String[] args) {
        ArrayList<String> ulkeList = new ArrayList<>(List.of("Almanya", "Isvec", "Hollanda", "Belcika", "Finlandiya"));
        System.out.println("ulkeList.indexOf(\"almanya\") = " + ulkeList.indexOf("almanya")); // -1 verir.
        System.out.println("ulkeList.indexOf(\"Belcika\") = " + ulkeList.indexOf("Belcika")); // 3 verir.
        System.out.println("ulkeList.indexOf(\"Turkiye\") = " + ulkeList.indexOf("Turkiye")); // -1 verir.

        ulkeList.add("Ukrayna");
        ulkeList.add("Isvec"); // burada en sona tekrar "Isvec" eklendi.
        System.out.println("ulkeList.indexOf(\"Isvec\") = " + ulkeList.indexOf("Isvec")); // 1
        System.out.println("ulkeList.lastIndexOf(\"Isvec\") = " + ulkeList.lastIndexOf("Isvec")); // 6
    }
}
