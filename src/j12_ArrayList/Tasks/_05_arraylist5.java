package j12_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _05_arraylist5 {

    /*
        rotateList() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        ArrayList'in dizilişini terse döndürün. (Tersten yazdırın)
        Tersten yazılmış halini return edin.
        Arraylist =  "New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"
        cevap: "Ohio" , "Florida" ,"Atlanta","New york" ,"New jersey"
     */

    public static void main(String[] args) {
        List<String> ulkeler = new ArrayList<>(Arrays.asList("New jersey", "New york", "Atlanta", "Florida", "Ohio"));
        System.out.println(ulkeler);
        System.out.println("rotateList(ulkeler) = " + rotateList(ulkeler));//[Ohio, Florida, Atlanta, New york, New jersey]
    }

    private static List<String> rotateList(List<String> arrList) {
        List<String> yeniList = new ArrayList<>();
        for (int i = arrList.size() - 1; i >= 0; i--) {
            yeniList.add(arrList.get(i));
        }
        return yeniList;

    }
}

