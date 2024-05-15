package j08_Loops.Loop01_ForLoop;

public class C04_NestedForLoop {
    public static void main(String[] args) {
        /*
     task->: Asagidaki output'u print eden code create ediniz.
                 Hafta: 1
                   Gun: 1
                   Gun: 2
                   Gun: 3
                   .....
                 Hafta: 2
                   Gun: 1
                   Gun: 2
                   Gun: 3
                   ....
                 Hafta: 3
                   Gun: 1
                   Gun: 2
                   Gun: 3
                   ....
  */
        for(int hafta=1; hafta<4; hafta++) {
            System.out.println("Hafta: " + hafta);
            for(int gun = 1; gun < 4; gun++) {
                System.out.println("Gun: "+gun);
            }
            System.out.println("....");

        }

    }
}
