package j101_InterviewQuestionsJava;

import java.util.Scanner;

public class Q27_AtbashCode {
    /*  Task->
      AtbashCode ; bir metni şifrelemek veya şifresini çözmek için İbrani alfabesine temelli basit bir yöntemdir.
      Alfabenin ilk harfi son harfi yerine kullanilmaktadir..
      "abcdefghijklmnopqrstuvwxyz"; 26 harf
      "zyxwvutsrqponmlkjihgfedcba";

      Girilen bir str'nin AtbashCode print eden code create ediniz.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir metin giriniz");
        String metin=input.nextLine().toLowerCase().replace(" ","");
        String alfabe="abcdefghijklmnopqrstuvwxyz";
        String atbashCode="zyxwvutsrqponmlkjihgfedcba";
        for (int i = 0; i < metin.length(); i++) {
            for (int j = 0; j < 26; j++) {
                if (metin.charAt(i)==alfabe.charAt(j)){
                    System.out.print(atbashCode.charAt(j));
                    break;
                }
            }
        }

        System.out.println();
        System.out.println("2.yol");
        String newStr="";
        for (int i = 0; i < metin.length(); i++) {
            newStr+=atbashCode.charAt(alfabe.indexOf(metin.charAt(i)));
        }
        System.out.println("newStr = " + newStr);

    }
}