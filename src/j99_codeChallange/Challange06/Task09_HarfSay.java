package j99_codeChallange.Challange06;

import java.util.Scanner;

public class Task09_HarfSay {
    /* Task-> Girilen bir metinde istenen bir harfin tekrar sayısını print eden code create ediniz

     * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e

     * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("agam bi metin giresen : ");
        String str = input.nextLine();//ebik gabık
        System.out.println("agam hangi harfi  istirsen : ");
        char istenenHarf = input.next().charAt(0);
        int harfSayisi = 0;
        for (int i = 0; i <str.length(); i++) {//girilen metin karakteri kadar loop tanımlandı
            if (str.charAt(i)==istenenHarf){//loop dan gelen karakter istenen harfe eşitliği kontrol edildi
                harfSayisi++;
            }
        }
        System.out.println("Girilen metindeki istenen harf "+istenenHarf+" "+harfSayisi+" tane kullanılmıştır ");

    }


}
