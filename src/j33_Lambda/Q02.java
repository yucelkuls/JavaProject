package j33_Lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Q02 {
    public static void main(String[] args) {
        //         {"A", "B", "D", "C", "B", "A", "A", "B", "B"} gibi bir array oluşturun;
        //         Tekrarlanan öğeleri konsolda yazdırın
        String[] arr = {"A", "B", "D", "C", "B", "A", "A", "B", "B"};
        List<String> list = Arrays.asList(arr);
        Arrays.stream(arr).filter(t-> Collections.frequency(list,t)>1).collect(Collectors.toSet()).stream().forEach(SeedMethods::strYazdir);
    }
}
