package j08_Loops.Loop01_ForLoop.Tasks;

public class Task31 {

    public static void main(String[] args) {
        /*
            1
            1  2
            1  2  3
            1  2  3  4.

         */
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  "+j);
                if (j == 4) System.out.println(".");
            }
            System.out.println();

        }
    }
}
