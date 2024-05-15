package j05_ifStatementTernaryOperator.Tasks;

public class Task21 {

    public static void main(String[] args) {
        /* Task->
        a) Son basamak 5 ‘e esit ve 5 den buyukse, yuvarlama islemi: “Son basamağı bir üst ondalığa yuvarla”
        b) Son basamak 5 den kucukse, yuvarlama islemi: “Son basamagi bir alt ondaliga yuvarla”
         */

        int number = 1453;
        int ones = number % 10;

        if (ones >= 5) {
            System.out.println(number - ones + 10);
        }else {
            System.out.println(number - ones);
        }


    }

}
