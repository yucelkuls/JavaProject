package j28_Iterators.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Task01 {
    public static void main(String[] args) {
        /*
        task -> Verilen bir integer listin tek  elemanlarının karesini tersten iterator print eden code create ediniz
         */
        List<Integer> list = new ArrayList<>(Arrays.asList(14, 25, 36, 47, 58, 69, 12, 45, 78));
        ListIterator<Integer> listIt = list.listIterator(list.size()); // imlec burada sona konumlaniyor?
        while (listIt.hasPrevious()) {
            int num = listIt.previous();
            if (num % 2 == 1) {
                System.out.print((num * num) + " ");
            }
        }
    }
}
