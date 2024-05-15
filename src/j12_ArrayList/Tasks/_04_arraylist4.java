package j12_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _04_arraylist4 {

    /*
        İsmi changeInArraylist() olan bir method oluşturun.
        Parametre olarak String ArrayList, String s1, String s2
           Arraylist'te s1'i s2 olarak değiştirin

        Return String arrayList

        Örneğin;
        Arraylist  "yellow" , "red" , "blue" , "red" , "blue"
        s1 = blue
        s2 = yellow
        Tüm blue 'ları yellow'a dönüştürün.
        cevap: "yellow" , "red" , "yellow" , "red" , "yellow"
     */

    public static void main(String[] args) {
        List<String> str = new ArrayList<>(Arrays.asList("yellow", "red", "blue", "red", "blue"));
        String s1 = "blue";
        String s2 = "yellow";

        System.out.println(changeInArraylist(str, s1, s2));//[yellow, red, yellow, red, yellow]


    }

    private static List<String> changeInArraylist(List<String> arrList, String s1, String s2) {

        Collections.replaceAll(arrList, s1, s2);
        return arrList;

    }
}
