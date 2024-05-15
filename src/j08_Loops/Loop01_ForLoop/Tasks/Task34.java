package j08_Loops.Loop01_ForLoop.Tasks;

public class Task34 {

    public static void main(String[] args) {

//        1 2 3 4 5 6
//         2 3 4 5 6
//          3 4 5 6
//           4 5 6
//            5 6
//             6

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(j + i + " ");
                }System.out.println();
            }
        }
    }



