package j08_Loops.Loop01_ForLoop.Tasks;

public class Task14 {

    public static void main(String[] args) {

        //  Task->  0 ile 100 arasındaki bütün çift sayıları print eden code create ediniz.
        //Not: 0 ve 100 dahildir.


        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n2. YOL");

        for (int i = 0; i <= 100; i++) {
            System.out.print(i % 2 == 0 ? i + " " : "");
        }

        System.out.println("\n3. YOL");
        for (int i = 0; i <= 100; i += 2) {
            System.out.print(i + " ");
        }


    }
}
