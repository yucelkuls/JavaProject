package j11_Arrays_.Tasks;

import java.util.Arrays;

public class Task19 {
    public static void main(String[] args) {
        //Task-> Asagidaki multi dimensional array'lerin ic array'lerinde ayni index'e sahip
        // elemanlarin toplamini ekrana yazdiran bir program yaziniz. (Zor soru)
        // arr1 = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }
        int arr1[][] = {{1, 2}, {3, 4, 5}, {6}};
        int arr2[][] = {{7, 8, 9}, {10, 11}, {12}};

        for (int i = 0; i < (Math.min(arr1.length, arr2.length)); i++) {
            for (int j = 0; j < Math.min(arr1[i].length, arr2[i].length); j++) {
                System.out.print((arr1[i][j] + arr2[i][j]) + " ");
            }
        }

        /*int[][] arr1 = {{1, 2}, {3, 4, 5}, {6}, {15, 1}, {25, 99}};
        int[][] arr2 = {{7, 8, 9}, {10, 11}, {12}, {12, 16}};
        //             [[8, 10], [13, 15], [18], [27,17]]
        System.out.println(Arrays.deepToString(arr1));
        System.out.println(Arrays.deepToString(arr2));

        int ilkDize = Math.min(arr1.length, arr2.length);
        System.out.println("ilkDize = " + ilkDize);
        System.out.println();

        int sayac2 = 0;
        String str2 = "";
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                sayac2++;
            }
            str2 += sayac2;
            sayac2 = 0;
        }
        System.out.println("str2 = " + str2);

        int sayac3 = 0;
        String str3 = "";
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                sayac3++;
            }
            str3 += sayac3;
            sayac3 = 0;
        }
        System.out.println("str3 = " + str3);

        int x = 0;
        int[][] sonuc = new int[ilkDize][]; // { [2 eleman], [2 eleman], [1 eleman], [2 eleman] }

        //System.out.println(Arrays.deepToString(sonuc));
        for (int i = 0; i < ilkDize; i++) {
            int ikinciDize = (Math.min(Integer.parseInt(String.valueOf(str2.charAt(i))),
                    Integer.parseInt(String.valueOf(str3.charAt(i)))));
            sonuc[i] = new int[ikinciDize];
        }

        System.out.println("Arrays.deepToString(sonuc) = " + Arrays.deepToString(sonuc));

        // ilkdize: arr1 ve arr2 nin uzunluklarının kıyaslanarak küçük olanın alınması
        for (int i = 0; i < ilkDize; i++) {
            x = Math.min(arr1[i].length, arr2[i].length); // Math.min(2,3)
            for (int k = 0; k < x; k++) {
                sonuc[i][k] = arr1[i][k] + arr2[i][k];
            }
        }
        System.out.println("Sonuc: " + Arrays.deepToString(sonuc));

         */

    }
}
