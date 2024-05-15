package j08_Loops.Loop3_DoWhileLoop.Tasks;

import java.util.Scanner;

public class Task07 {

   /* HAFTANIN TASK'iiii :-)
    Bir top belirli yükseklikten atılmaktadır.
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiği ana kadar aldigi toplam yolu ve
    yere vurma sayısını print eden  do while code blogu create ediniz.

    input : 2
    output:
      Yere Vurma Sayisi = 3
      Toplam Alinan Yol = 8.09375
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("topun birakildigi ilk yuksekligi  giriniz : ");
        double height = scan.nextDouble();
        double distance = 0;
        int bounce = 0;

        do {
            distance += height;
            bounce++;
            height *= 0.75;
            distance += height;

        }while(height >= 1.0 );
        System.out.println("The number of bounce = " + bounce + "\nThe total distance = "+ distance);


    }
}
