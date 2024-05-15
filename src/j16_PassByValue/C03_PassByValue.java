package j16_PassByValue;

import java.util.ArrayList;
import java.util.List;

public class C03_PassByValue {
    public static void main(String[] args) {

         /*
        java non-primitive(Class array list-> referans ) data turlerinde obj kendisi değil de dataları değişirse
        obj referans ve kendisi değişmediği dataları değişikliğini kalıcı yapar.
          */
    // Task -> list elemanları 24,20,87 iki farklı method ile list elemanlarını
    //      update edip print eden METHOD create ediniz.
    //1. method-> with for each 2. method-> set(index,value)
        List<Integer> list = new ArrayList<>(List.of(24,20,87));
        System.out.println("list before update : "+ list);
        listUpdate1(list);
        listUpdate2(list);
        System.out.println("list after update : "+ list);
    }

    private static void listUpdate2(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + 21);
        }
        System.out.println("listUpdate2 method run edildi : "+ list);
    }

    private static void listUpdate1(List<Integer> list) {
        for (Integer avuc:list){
            avuc+=33;
            System.out.print(avuc + " ");
        }
        System.out.println("\nlistUpdate1 method run edildi : "+ list);
    }
}
