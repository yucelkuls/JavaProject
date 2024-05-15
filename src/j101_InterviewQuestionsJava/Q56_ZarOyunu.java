package j101_InterviewQuestionsJava;

import java.util.Random;

public class Q56_ZarOyunu {
    /* Task->
    Iki tane atilan zarin toplamlarinin 9 olmasi durumanda "Kazandiniz" ,
     aksi takdirde "Tekrar deneyiniz" print eden code create ediniz

     */

    public static void main(String[] args) {

        Random random = new Random();

        while (true) {
            int dice1 = random.nextInt(1, 7);
            int dice2 = random.nextInt(1, 7);

            if (dice1 + dice2 == 9) {
                System.out.println("You won!");
                break;
            } else {
                System.out.println("Please try again :(");
            }
        }
    }
}
