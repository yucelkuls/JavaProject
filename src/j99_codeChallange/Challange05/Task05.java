package j99_codeChallange.Challange05;

import java.util.Scanner;

public class Task05 {
    /* task-> girilen satır ve sutun değerleri için aşağıdaki şekli print eden code create ediniz.
	 	Get the number of rows and columns from user.
	 	Create a rectangle.
	 	rows = 3 and column = 5 ==> * * * * *
	 	                            * * * * *
	 	                            * * * * *
	 */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of rows");
        int rows = input.nextInt();
        System.out.println("Please enter the number of columns");
        int columns = input.nextInt();
        for (int i = 1; i <= rows ; i++) {
            for (int j = 1; j <= columns ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }



    }


}
