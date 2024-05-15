package j14_Varargs;

public class C02_Varargs_Array {
    public static void main(String[] args) {
        int arr[] = {10, 11, 36, 14, 41, 77, 46, 61, 20};
      // task01-> verilen arr elamanlarını toplamını print eden METHOD create ediniz.
        System.out.println(arrTopla(arr));
      // task02-> task01 execute(run) eden varargs  METHOD create ediniz.
        System.out.println(varargsTopla(10,20,30,50,42,24));

    }

    private static int varargsTopla(int... i) {
        int toplam = 0;
        for (int each: i) {
            toplam += each;
        }
        return toplam;
    }

    private static int arrTopla(int[] arr) {  // int [] parametreli method int return type
        int toplam = 0;
        for (int each: arr) {
            toplam += each;
        }
        return toplam;
    }
}
