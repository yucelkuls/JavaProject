package j12_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task04 {
    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ ve 'A'  harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */
        List<String> list1 = new ArrayList<>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));
        System.out.println("list1 = " + list1);
        System.out.println("list1.size() = " + list1.size());
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).contains("a") || list1.get(i).contains("A")){
                list1.remove(i);
                i--;
            }
        }
        System.out.println("list1 = " + list1);
    }
}
