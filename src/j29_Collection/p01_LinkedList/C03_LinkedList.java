package j29_Collection.p01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class C03_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> ll1 = new LinkedList<>(Arrays.asList("balcanKebap", "Cüger", "haşhaşKebap", "guzuGerdan", "incik", "küşşşleme"));
        LinkedList<String> ll2 = new LinkedList<>(Arrays.asList("trileçe", "künefix", "sübye", "suMuhallebi", "kerebis", "ayva"));
        System.out.println("ll1 ilk hali = " + ll1); // [balcanKebap, Cüger, haşhaşKebap, guzuGerdan, incik, küşşşleme]
        // LinkedList remove
        ll1.remove();
        System.out.println("ll1 remove() sonrasi = " + ll1); // [Cüger, haşhaşKebap, guzuGerdan, incik, küşşşleme]
        System.out.println("ll1.remove(\"ciger\") = " + ll1.remove("ciger")); // false caseSensetive old. icin
        System.out.println("ll1.remove(\"incik\") = " + ll1.remove("incik")); // true
        System.out.println("ll1 remove(object) sonrasi = " + ll1); // [Cüger, haşhaşKebap, guzuGerdan, küşşşleme]
        System.out.println("ll1.remove(0) = " + ll1.remove(0)); // Cüger
        System.out.println("ll1 remove(index) sonrasi = " + ll1); // [haşhaşKebap, guzuGerdan, küşşşleme]
        System.out.println("ll1.removeFirst() = " + ll1.removeFirst()); // haşhaşKebap
        System.out.println("ll1.removeFirst() sonrasi = " + ll1); // [guzuGerdan, küşşşleme]
        System.out.println("ll1.removeLast() = " + ll1.removeLast()); // küşşşleme
        System.out.println("ll1.removeLast() sonrasi = " + ll1); // [guzuGerdan]

        ll1.addAll(ll2);
        System.out.println("ll1 addAll() sonrasi= " + ll1); // [guzuGerdan, trileçe, künefix, sübye, suMuhallebi, kerebis, ayva]
        System.out.println("ll2 = " + ll2); // [trileçe, künefix, sübye, suMuhallebi, kerebis, ayva]
        ll1.removeAll(ll2);
        System.out.println("ll1 removeAll() sonrasi = " + ll1); // [guzuGerdan]
        System.out.println("ll2.element() = " + ll2.element()); // trileçe

        //LinkedList get() -> getFirst -> getLast()
        System.out.println("ll2.get(3) = " + ll2.get(3)); // suMuhallebi
        System.out.println("ll2.getFirst() = " + ll2.getFirst());// trileçe
        System.out.println("ll2.getLast() = " + ll2.getLast()); //  ayva

        LinkedList<Integer> sayiList = new LinkedList<>(Arrays.asList(1,2,5,6,54,67));
        System.out.println("sayiList.remove(5) = " + sayiList.remove(5)); // 67
        // remove() meth parametre integer alırsa List data Type integer oldugunda meth parametre obj değil index tanımlar.
        // System.out.println("sayıList.remove(45) = " + sayıList.remove(45));//RTE ->IndexOutOfBoundsException

    }
}
