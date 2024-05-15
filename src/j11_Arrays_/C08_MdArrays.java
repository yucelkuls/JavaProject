package j11_Arrays_;

public class C08_MdArrays {
    public static void main(String[] args) {
        int arr[][] = {
                {3, 5},//0. kat
                {12, 13, 15},//1. kat
                {103, 107, 111, 121},//2. kat
        };

//       task ->  array elamanları toplamını print eden code create ediniz.
        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                toplam += arr[i][j];
            }
        }
        System.out.println("toplam = " + toplam);
    }
}
