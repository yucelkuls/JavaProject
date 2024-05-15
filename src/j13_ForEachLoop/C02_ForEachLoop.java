package j13_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C02_ForEachLoop {
    public static void main(String[] args) {
        // task-> iki string array elemanlarının ortak olmasını kontrol edip print eden code create ediniz..with for-each
        String [] arr1 = {"Sema", "Safvet", "Saim", "Saliha", "Yucel", "Dogukan", "Halit"};
        String [] arr2 = {"Sema", "Semra","JavaCAN", "Saliha","Safvet", "Dogukan", "JavaNur"};
        List<String> ortakElemanlar = new ArrayList<>();
        for(String each : arr1){
            for(String w : arr2){
                if(each.equals(w)){
                    ortakElemanlar.add(each);
                }
            }
        }
        System.out.println(ortakElemanlar);
    }
}
