package j07_StringManipulation;

import java.util.Scanner;

public class C06_SubString {
    public static void main(String[] args) {
        /*
substring()
Metin icinde, istenilen araliktaki bir parcasina ya da butunune  String olarak ulaşılmak istenebilir..
substring(i)->Method'a parametre olarak girilen  index'den sona kadar olan parcayi return eder
substring(baslangicIndexi, bitisIndexi)->Method'a parametre olarak girilen  baslangicIndexi'den bitis
indexi'e kadar parçayı return eder
baslangic indexi ==> inclusive/dahil
bitis indexi ==> exclusive/haric
 */
        String str = "madem geldin dunyaya calis Java'ya";
        System.out.println(str.substring(5)); // 5. index dahil metnin sonuna kadar> " geldin dunyaya calis Java'ya"
        System.out.println(str.substring(str.length()-10)); // Son 10 karakter icin uzunluktan cikardik.
        System.out.println(str.substring(0,10)); // Ilk 10 karakter icin 0 dan index 10 a kadar gideriz.
        System.out.println(str.substring(0,1)); // Ilk 1 karakter icin 0 dan index 1 e kadar gideriz.
        System.out.println(str.charAt(0)); // Ilk 1 karakter icin charAt de diger method.

        // task-> girilen 4 harfli bir kelimenin tersten print eden code create ediniz. -> kale:elak
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 4 harfli bir kelime giriniz");
        String str1= scan.next();
        if (str1.length()==4){
            System.out.println(str1.substring(str1.length()-1)+str1.substring(2,3)+
                    str1.substring(1,2)+str1.substring(0,1));
            System.out.println(""+str1.charAt(str1.length()-1)+str1.charAt(2)+str1.charAt(1)+str1.charAt(0));
        }else System.out.println("4 harfli olsun dikkat et");

    }
}
