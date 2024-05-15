package j33_Lambda.Tasks;

import j33_Lambda.SeedMethods;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Q03 {
    //String isimlerden olusan bir list olusturun
    //Konsoldaki farklı öğeleri uzunluklarıyla birlikte yazdırın.
//Konsoldaki farklı öğeleri yazdırın, uzunluklarına göre sıralayın.
//Konsoldaki farklı öğeleri yazdırın, son karakterlerine göre sıralayın.
//Konsoldaki farklı öğeleri ters sırada yazdırın.
//Uzunluğu 7'den küçük olan farklı öğeleri ters sırada konsolda büyük harflerle yazdırın.

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Lutfullah");
        list.add("Emine");
        list.add("Emine");
        list.add("Yusuf");
        list.add("Seyfullah");
        list.add("Hakan");
        printEt(list);

    }

    private static void printEt(List<String> list) {
        //Konsoldaki farklı öğeleri uzunluklarıyla birlikte yazdırın.
        list
                .stream()
                .distinct()
                .forEach(t -> System.out.print(t + " " + t.length()));
        System.out.println("\n1*********");
        //Konsoldaki farklı öğeleri yazdırın, uzunluklarına göre sıralayın.
        list
                .stream()
                .map(String::length)
                .distinct()
                .sorted()
                //.forEach(System.out::println);
                .forEach(t -> System.out.print(t + " "));
        System.out.println("\n2*********");
        //Konsoldaki farklı öğeleri yazdırın, son karakterlerine göre sıralayın
        list
                .stream()
                .sorted(Comparator.comparing(t -> t.charAt(t.length() - 1)))
                .distinct()
                .forEach(t -> System.out.print(t + " "));

        System.out.println("\n3*********\n");
        //Konsoldaki farklı öğeleri ters sırada yazdırın.
        list
                .stream()//elemanlar akisa alindi
                .distinct()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
//                .sorted((t1, t2) -> -t1.compareTo(t2))
//                .forEach(SeedMethods::strYazdir);//Yusuf Seyfullah Lutfullah Hakan Emine
        System.out.println("4*********");
        //Uzunluğu 7'den küçük olan farklı öğeleri ters sırada konsolda büyük harflerle yazdırın.
        list
                .stream()
                .distinct()
                .filter(t -> t.length() < 7)
                .sorted(Comparator.reverseOrder())
                .map(String::toUpperCase)
                .forEach(SeedMethods::strYazdir);
    }
}
