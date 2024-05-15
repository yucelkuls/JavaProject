package j11_Arrays_.Tasks;

public class Task21 {

    public static void main(String[] args) {
		/* TASK :
		ayna check sorusu: verilen Arrayın Ayna array olmasını kontrol eden code create ediniz
		 input : int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
		 output : verilen array simetriktir
		 */
        int arr[] = {1, 2, 3, 7, 4, 3, 2, 1};
        int count = 0;

        if (arr.length % 2 == 0) {
            for (int i = 0; i < arr.length / 2; i++) {
                if(arr[i] == arr[arr.length - 1 - i]){
                    count++;
                }
            }
            if(count == arr.length/2){
                System.out.println("Bu array simetriktir");
            }else System.out.println("Bu array simetrik degildir");

        }else System.out.println("Bu array simetrik degildir");
        System.out.println(count);
    }
}

