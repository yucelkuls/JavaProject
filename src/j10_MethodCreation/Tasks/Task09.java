package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

    /*
   Task->  Saati saniyeye çeviren  method create ediniz
    */
        convertHourToSecond();

    }//main sonu

    private static void convertHourToSecond() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the hours you want to convert: ");
        System.out.println((sc.nextInt() * 3600) + " seconds");
    }

}// Class sonu
