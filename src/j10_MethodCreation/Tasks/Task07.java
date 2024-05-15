package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {
        //Task-> Girilen 3  sayıdan en küçüğünü print eden METHOD  create ediniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first number = ");
        int first = scan.nextInt();
        System.out.println("Please enter second number = ");
        int second = scan.nextInt();
        System.out.println("Please enter third number = ");
        int third = scan.nextInt();

        minNumber(first, second, third);



    }//main sonu

    private static void minNumber(int first, int second, int third) {
        int min = Math.min(first, Math.min(second, third));
        System.out.println(min);
    }
    // eger void yerine int yazarsak
    // return first < second ? Math.min(first, second) : Math.min(second, third);
    // o zaman main icindeki minNumber(first, second, third) methodunu sout icine koymaliyiz.

}//Class sonu
