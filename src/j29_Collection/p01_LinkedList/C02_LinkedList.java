package j29_Collection.p01_LinkedList;

import java.util.LinkedList;


public class C02_LinkedList {
    public static void main(String[] args) {
        LinkedList<Object> list = new LinkedList<>(); // data type Hz Adem Object class
        // ahan da Trick köşesinde böğün -> BAD PRACTICE--> app.  çoooğ yavaşlatır
        list.add(1905);
        list.add("javacan");
        list.add('$');
        list.add(true);
        System.out.println("list = " + list); // [1905, javacan, $, true]
    }
}
