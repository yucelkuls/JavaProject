package j28_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C02_Previous {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>(Arrays.asList("Trileçe", "KazanDibi", "HavucDilimi", "CennetÇamuru", "Künefix", "Bal-Gaymahhh", "Kerebiç"));
        System.out.println("l1 ilk hali  = " + l1);

        System.out.println("*** Task 01 ***");

        // Task01-> l1 elemanlarını  sondan başa dogru print eden code create ediniz.
        ListIterator<String> it1 = l1.listIterator(); // 1.step
        while (it1.hasNext()){ //2.step imlec son elemaninin sonuna konumlandirildi
            it1.next();
        }
        while (it1.hasPrevious()){ // sondaki cursor tekrar basa dogru gidecek
            System.out.print(it1.previous()+" ");
        }
        System.out.println();

        System.out.println("*** Task 02 ***");
        // Task02-> l1 son elemanını :-) ile update edip print eden code create ediniz.
        ListIterator<String> it2 = l1.listIterator(); // 1 .step
        while (it2.hasNext()){ // 2. step
            it2.next();
            if(it2.hasNext()==false){
                it2.previous();
                it2.set(it2.next()+" :-)");
            }
        }
        System.out.println("l1 update sonrasi : "+l1);
    }
}
