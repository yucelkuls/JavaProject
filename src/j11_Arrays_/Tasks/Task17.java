package j11_Arrays_.Tasks;

public class Task17 {
    public static void main(String[] args) {
        // task-> asağıdaki sayi arr'deki en buyuk elemanı print eden code create ediniz...

        int arr[][]={
                {3,5},//0. kat
                {2,4,1},//1. kat
                {6,1,2,2},//2. kat
        };

        int enBuyuk=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]>enBuyuk) {
                    enBuyuk = arr[i][j];
                }
            }
        }
        System.out.println(enBuyuk);



    }
}
