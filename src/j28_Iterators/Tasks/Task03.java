package j28_Iterators.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Task03 {
    public static void main(String[] args) {
        // Task->verilen listedeki her elementi 3 artirip print eden code create ediniz..
        ArrayList<Integer> sayiList = new ArrayList<>(Arrays.asList(14, 25, 36, 47, 58, 69, 12, 45, 78));
        ListIterator<Integer> listIt = sayiList.listIterator();

        while (listIt.hasNext()){
            System.out.print(listIt.next() + 3 + " ");
        }
    }
}
