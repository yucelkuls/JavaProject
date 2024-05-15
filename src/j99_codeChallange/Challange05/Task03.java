package j99_codeChallange.Challange05;

public class Task03 {


	/*	ForLoop
		task-> 100 den 0'a kadar çift sayıları print eden code create ediniz.
      */

    public static void main(String[] args) {
        System.out.println("   *** cincix code  ***");
        for (int i = 100; i >= 0; i -= 2) {// 100 den 0'a kadar 2 azalan tekrar tanımlandı
            System.out.print(i + " ");

        }
        System.out.println();
        System.out.println("   *** amele code  ***");
        for (int i = 100; i >= 0; i--) {
            if (i % 2 == 0) System.out.print(i + " ");
        }


    }


}
