package j29_Collection.p01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class C01_LinkedList {
    public static void main(String[] args) {
         /*
LinkedList .....
1- LinkedList'de elemanlar "data" ve "adress"(next) olmak uzere iki kısımdan oluşur ve eleman yerine "node" olarak tanımlanır.
2- LinkedList'te ilk node data barındırmayan sadece adres bulunduran "head" node tanımlanmıştır.
3- LinkedList'te son node adres kısmı null olan sadece data bulunduran "tail" node tanımlanmıştır.
4- ArrayList searching LinkedList node ekleme(add) ve silmede(remove) daha avantıjlıdır.
5- LİnkedLİst -> tren vagon ilşikisi baglantısı gibi düşünülebilir
6- Collection obj tanımlanırken cons Class(LinkedList,ArrayList...) olmalı interface(List, Queue ...) olmamasına dikkat edilmeli
    Ancak obj DataType olarak parent interface tanımlanabilir.
7- LinkedList class iki tane parent interface'den(List,Queue) implement etmiştir.
 */
        LinkedList<String> ll1 = new LinkedList<>(Arrays.asList("balcanKebap", "Cüger", "haşhaşKebap", "guzuGerdan", "incik", "küşşşleme"));
        //linkedList print
        System.out.println("ll1 = " + ll1); // [balcanKebap, Cüger, haşhaşKebap, guzuGerdan, incik, küşşşleme]
        //linkedList add
        ll1.add("iskender");
        System.out.println("ll1 add() sonrasi = " + ll1); // [balcanKebap, Cüger, haşhaşKebap, guzuGerdan, incik, küşşşleme, iskender]
        ll1.addFirst("doner");
        System.out.println("ll1 addFirst() sonrasi = " + ll1);// [doner, balcanKebap, Cüger, haşhaşKebap, guzuGerdan, incik, küşşşleme, iskender]
        ll1.addLast("beyti");
        System.out.println("ll1 addLast() sonrasi = " + ll1); // [doner, balcanKebap, Cüger, haşhaşKebap, guzuGerdan, incik, küşşşleme, iskender, beyti]
        ll1.add(3,"etli ekmek");
        System.out.println("ll1 add(index) sonrasi = " + ll1); // [doner, balcanKebap, Cüger, etli ekmek, haşhaşKebap, guzuGerdan, incik, küşşşleme, iskender, beyti]
        LinkedList<String> ll2 = new LinkedList<>(Arrays.asList("trileçe", "künefix", "sübye", "suMuhallebi", "kerebis", "ayva"));
        ll1.addAll(ll2);
        System.out.println("ll1 addAll() sonrasi = " + ll1); //[doner, balcanKebap, Cüger, etli ekmek, haşhaşKebap, guzuGerdan, incik, küşşşleme, iskender, beyti, trileçe, künefix, sübye, suMuhallebi, kerebis, ayva]
        ll2.addAll(1,ll2);
        System.out.println("ll2 addAll(index, coll) sonrasi = " + ll2); // [trileçe, trileçe, künefix, sübye, suMuhallebi, kerebis, ayva, künefix, sübye, suMuhallebi, kerebis, ayva]



    }
}
