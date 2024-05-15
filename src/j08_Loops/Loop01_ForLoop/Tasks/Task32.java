package j08_Loops.Loop01_ForLoop.Tasks;

public class Task32 {
    public static void main(String[] args) {
        /*

        *
        * *
        * * *
        * * * *
        * * *
        * *
        *
        şekli print eden code create ediniz

         */

        // ipucu : artis ve azalis kisimlarini 2 ayri nested loop ile yapmalisiniz.

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 3; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}