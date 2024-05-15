package j25_Exceptions;

import java.util.Scanner;

public class C06_IllegalArgumantException {
    public static void main(String[] args) {
        /*
ahan da TRİCK kosesinde bugun :)

"throw" - throws" farkları
1- "throws" -> main method kapanıs parantezi ile method body acılıs parantezi arasına yazılır.
   "throw" -> method body içinde tanımlanır.
2- "throws" -> keywordden sonra birden fazla exception tanımlanabilir
   "throw" -> keywordden sonra sadece bir tane exception tanımlanır
3- "throws" -> keywordden sonra sadece exception class name yazılır
    "throw" ->  keywordden sonra exception obj tanımlanır
4- "throws" -> keyword method ilk satırda sadece bir kez tanımlanır
    "throw" -> keyword istenildiği kadar method body de tanımlanabilir.
 */
// IllegalargumentException -> kullanılmasını istenmeyen değerlerde pr hata vermesi isteniyorsa bu excp fırlatılıer
// ornek : yas datası için negatif değer girilidğinde pr kırılmadan run olması ama girilen değer için excp fırlatması için kullanılır..
        Scanner scan=new Scanner(System.in);
        System.out.println("Yasinizi giriniz");
        int yas= scan.nextInt();
        try {
            if (yas<18){
                //throw new IllegalArgumentException("Bu "+yas+" yasinda ehliyet alamazsin baska kapiya ");
                hata();//throw exc meth call edildi
                //throw keyword ile data  type'da exc obj tanimlanip hata firlatmasi yapildi
                //bu sekilde sartimiza uymayan bir case(yas<18) gelisirse java catch blok exc handle edecek
            }else System.out.println("Yasin tutuyor ehliyet alabilirsin");

            System.out.println("Bu mesaji okuyorsan try sorunsuz calisti");
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage()+(18-yas)+" yas daha buyumen lazim");
            System.out.println("Ne yapiyorsun bu yasta ehliyet mi alinir");
            System.out.println("Try exc firlatti ama catch onu yakaladi");
        }
        System.out.println("Bu mesaji okuyorsan app sorunsuz calisti");
    }

    private static void hata() {
        throw new IllegalArgumentException("Bu yasda ehliyet alamazsin baska kapiya ");
    }
}
