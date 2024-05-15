package j101_InterviewQuestionsJava;

import java.util.ArrayList;
import java.util.Arrays;

public class Q32_2D_CollectionsTask {
    // Create 2D ArrayList which can store String ArrayLists
    // Create 3 ArrayLists which are Employees, Employers, Companies
    // Store this 3 ArrayList in 2D ArrayList

    // String ArrayList'leri depolayabilen 2D ArrayList oluşturun
    // Çalışanlar, İşverenler, Şirketler olmak üzere 3 DiziListesi oluşturun
    // Bu 3 ArrayList'i 2D ArrayList'te saklayın
    //[[Ahmet, Ali, Emrah, Elif, tecnical support], [Haluk, Eylul, Yusuf, Can, İbrahim, Mehmet], [Amazon, Google, Testinium, IBM]]


    public static void main(String[] args) {
        ArrayList<String> calisanlar = new ArrayList<>(Arrays.asList("Ahmet", "Ali", "Emrah", "Elif", "Sema"));
        ArrayList<String> isVerenler = new ArrayList<>(Arrays.asList("Saliha", "Elif", "Ipek", "Semra", "Yucel"));
        ArrayList<String> sirketler = new ArrayList<>(Arrays.asList("Amazon", "Google", "Clarusway", "IBM", "MS"));
        ArrayList<ArrayList<String>> listeler = new ArrayList<>();
        listeler.add(calisanlar);
        listeler.add(isVerenler);
        listeler.add(sirketler);

        System.out.println("calisanlar = " + calisanlar); // [Ahmet, Ali, Emrah, Elif, Sema]
        System.out.println("isVerenler = " + isVerenler); // [Saliha, Elif, Ipek, Semra, Yucel]
        System.out.println("sirketler = " + sirketler); // [Amazon, Google, Clarusway, IBM, MS]
        System.out.println("listeler = " + listeler);
        // [[Ahmet, Ali, Emrah, Elif, Sema], [Saliha, Elif, Ipek, Semra, Yucel], [Amazon, Google, Clarusway, IBM, MS]]


    }
}

