package j08_Loops.Loop01_ForLoop.Tasks;

import java.util.Scanner;

public class Task25 {

    /*
           TASK  :
           Bir String içindeki tüm karakterleri en fazla bir kez print eden code create ediniz.
           Test Data:
           input: "aabbcccccddddaaa"
           output: abcd
        */
    public static void main(String[] args) {
        String str = "aabbccccddddaaa";
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (!newStr.contains(String.valueOf(str.charAt(i)))) {
                newStr += str.charAt(i);
            }
        }
        System.out.println(newStr);
    }
}
