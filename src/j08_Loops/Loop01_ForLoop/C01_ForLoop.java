package j08_Loops.Loop01_ForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {
        // for loop -> tekrarlayan sabit aksiyonlar icin tanimlanan kod blogu'dur.
        // task-> 42 kere "maaşallah" prin eden code create ediniz.

        for (int i = 1; i < 42; i++) {
            System.out.println(i + ".maaşallah");
        }
        // task02-> 2 basamaklı tek sayıları aynı satıra aralarında boşluk ile print eden code create ediniz.

        for (int i = 11; i < 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("***");

        for (int i = 0; i <= 100; i++) {
            if (i >= 10 && i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

         /*
        Code standarts
        1) Tekrar (Repetition) olmamalidir
        2) Dynamic olmalidir
        3) Tamir (Fix) ve update kolay yapilabilmelidir
         */


    }
}
