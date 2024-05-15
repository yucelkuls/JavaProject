package j12_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task05 {
    public static void main(String[] args) {


         /*TASK :
        2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
        listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
        Ex : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
           Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]
         */
        String isimArr[][] = {{"Ali", "Veli", "Ayse" }, {"Hasan", "Can" }, {"Suzan" }};

        yeniList(isimArr);

    }//main sonu
    private static void yeniList(String[][] isimArr) {
        List<String> isimList = new ArrayList<>();
        for (int i = 0; i < isimArr.length; i++) {
            for (int j = 0; j < isimArr[i].length; j++) {
                isimList.add(isimArr[i][j]);
            }
        }
        System.out.println("sort oncesi isimList = " + isimList);
        Collections.sort(isimList);
        System.out.println("sort sonrasi isimList = " + isimList);
    }
}
