package j11_Arrays_.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class   _12_Array_no14 {

    public static void main(String[] args) {

        /*
        int array oluşturun (intArr)
        Eğer 1 " ve" 4 elemanlarına aynı anda sahip değilse true dönsün.
        Eğer 1 ve 4 elemanlarına aynı anda sahipse false dönsün.

        no14([1, 2, 3]) → true
        no14([1, 2, 3, 4]) → false
        no14([2, 3, 4]) → true

        bir array oluşturun ve elemanları : 1,2,3,4
        Sonuç false olmalı
        NOT: Array elemanlarını 1,2,3 olarak değiştirirseniz sonuç doğru olmalı
         */

        // code start here

        Scanner scan = new Scanner(System.in);

        String str1 = scan.nextLine();

        String[] arr1 = str1.split("");

        int[] intArr = new int[arr1.length];

        int count = 0;

        for (int i = 0; i < intArr.length; i++) {

            int i1 = Integer.parseInt(arr1[i]);

            intArr[count] = i1;

            count++;
        }

        //Kod buradan başlıyor.. Yukarısını değiştirmeyiniz..
        // intArr ı kullanın.
        System.out.println(Arrays.toString(intArr));
        int x=1;
        int y=4;
        Arrays.sort(intArr);
        int xIndex=Arrays.binarySearch(intArr,x);
        int yIndex=Arrays.binarySearch(intArr,y);
        System.out.println("xIndex = " + xIndex);
        System.out.println("yIndex = " + yIndex);
        if (xIndex>=0&&yIndex>=0){
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }
}