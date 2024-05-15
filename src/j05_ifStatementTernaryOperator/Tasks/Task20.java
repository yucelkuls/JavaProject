package j05_ifStatementTernaryOperator.Tasks;

import java.util.Scanner;

public class Task20 {
    /*
    etkinlik öneren program
    Koşullar :
    Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
    Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
    Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
    Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your grade?");
        int grade = input.nextInt();
        String canDo = "";

        if (grade > 25) canDo = "Yüzme";
        else if (grade >= 15) canDo = "Piknik";
        else if (grade >= 5) canDo = "Sinema";
        else canDo = "Kayak";
        System.out.println(canDo);

    }
}
