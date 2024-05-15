package j11_Arrays_.Tasks;

import java.util.Arrays;

public class Task03 {

    public static void main(String[] args) {
		
		 /*
       Task-> Verilen  bir arrayin tum elemanlarini
        bir sonraki konuma print eden code create ediniz
       input:  [1,2, 3]
        output [2, 3, 1]
        */

        int [] arr = {1,2,3};
        int temp = arr[arr.length-1];
        for (int i = arr.length -1; i > 0; i--) {
            arr[i] = arr[i -1];
        }
        arr[0] = temp;
        System.out.println(Arrays.toString(arr)); // [3, 1, 2]
    }

}
