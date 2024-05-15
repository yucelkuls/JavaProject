package j12_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

        // Task ->  bir listte istenen sayının varlığı kontrol edip print eden code create ediniz.

        ArrayList<Integer> sayiList=new ArrayList<>(Arrays.asList(1,3,6,78,94,23,54,4,89,34));
        Scanner input=new Scanner(System.in);
        System.out.println("Agam hangi sayi arirsen : ");
        int arananSayi=input.nextInt();

       //boolean arananSayivarMi=false;

       //for (int i = 0; i < sayiList.size(); i++) {

       //    if (arananSayi == sayiList.get(i)) {
       //        arananSayivarMi=true;
       //        break;
       //    }
       //
       //}
       //System.out.println(arananSayivarMi ? "aranan sayi listte mevcut" : "aranan sayı listte mevcut değil");
        System.out.println(sayiList.contains(arananSayi) ? "aranan sayi listte mevcut" : "aranan sayı listte mevcut değil");
    }
}
