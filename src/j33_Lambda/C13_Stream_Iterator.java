package j33_Lambda;

import java.util.stream.IntStream;

public class C13_Stream_Iterator {
    public static void main(String[] args) {

        System.out.println("****Task 01 *****");
        //TASK 01 --> Structured Programming ve Functional Programming ile
        // 1'den x'e kadar tamsayilari toplayan bir code create ediniz.
        System.out.println("Task01 -> ameleTopla : "+ ameleTopla(10));
        System.out.println("Task01 -> afilliTopla : "+ afilliTopla(10));

        System.out.println("\n****Task 02 *****");
        //TASK 02 --> 1'den x'e (dahil) kadar cift tamsayilari toplayan bir code create ediniz
        System.out.println("ciftToplam = " + ciftTopla(10));

        System.out.println("\n****Task 03 *****");
        //TASK 03 --> Ilk x pozitif cift tam sayiyi toplayan code  create ediniz.
        System.out.println("Ilk x adet cift toplam : "+ilkCiftTopla(10)); // 110
        System.out.println("Ilk x adet cift sayi : ");
        ilkXCiftSayi(10); // 2 4 6 8 10 12 14 16 18 20

        System.out.println("\n****Task 04 *****");
        //TASK 04 --> Ilk X adet pozitif tek tamsayiyi toplayan programi  create ediniz.
        System.out.println("Ilk x adet tek sayi toplami: "+ilkXTekToplam(10)); // 100
        System.out.println("\n****Task 05 *****");
        //TASK 05 --> 2'nin ilk x kuvvetini ekrana yazdiran code  create ediniz.
        print2IlkXKuvveti(10); // 2 4 8 16 32 64 128 256 512 1024
        System.out.println("\n****Task 06*****");
        //TASK 06 --> Istenilen bir sayinin ilk x kuvvetini print eden code  create ediniz.
        printistenenIlkXKuvveti(5,3);  // 3 9 27 81 243
        System.out.println("\n****Task 07*****");
        //TASK 07 --> Istenilen bir sayinin faktoriyelini hesaplayan code  create ediniz.
        System.out.println(faktoriyel(5)); // 120
        System.out.println("\n****Task 08*****");
        //TASK 08 --> Istenilen bir sayinin  x. kuvvetini print eden code  create ediniz.
        printIstenenXKuvveti(5,10);
    }

    private static void printIstenenXKuvveti(int istenenSayi, int x) {
        IntStream
                .iterate(istenenSayi,t->t*istenenSayi)
                .limit(x)
                .skip(x-1)
                .forEach(SeedMethods::intYazdir);
    }

    private static int faktoriyel(int x) {
        return IntStream
                .rangeClosed(1,x)
                .reduce(1,(t,u)->t*u);
    }

    private static void printistenenIlkXKuvveti(int x, int istenenSayi) {
        IntStream
                .iterate(istenenSayi,t->t*istenenSayi)
                .limit(x)
                .forEach(SeedMethods::intYazdir);
    }

    private static void print2IlkXKuvveti(int x) {
        IntStream.iterate(2,t->t*2).limit(x).forEach(SeedMethods::intYazdir);
    }

    private static int ilkXTekToplam(int x) {
        return IntStream
                .iterate(1,t->t+2)
                .limit(x)
                .sum();
    }

    private static void ilkXCiftSayi(int x) {
        IntStream
                .iterate(2,t->t+2)
                .limit(x)
                .forEach(SeedMethods::intYazdir);
    }

    private static int ilkCiftTopla(int x) {
        return IntStream
                .iterate(2,t->t+2)//2'den baslayip surekli 2'ser arttiran tekrar tanimlandi
                .limit(x) // akistaki x adet eleman alindi
                .sum();
    }

    private static int ciftTopla(int x) {
        return IntStream
                .rangeClosed(1,x)
                .filter(SeedMethods::ciftMi)
                .sum();
    }

    private static int afilliTopla(int x) {
        return IntStream
                .rangeClosed(1,x)
                .sum();
        //range(startInclusive,endExclusive);-> 1'lik artımlı bir adımla
        // startInclusive'den (dahil) endExclusive'e (hariç) kadar sıralı
        // bir IntStream return eder.
    }

    private static int ameleTopla(int x) {
        int toplam = 0;
        for (int i = 0; i <= x; i++) {
            toplam += i;
        }
        return toplam;
    }
}
