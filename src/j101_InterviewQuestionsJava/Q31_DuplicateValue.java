package j101_InterviewQuestionsJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q31_DuplicateValue {
       /* Task->
        Write a code that returns the duplicate chars in a String array.
        (interview Question)
        Girilen bir string için tekrarlanan karakterleri print eden code create ediniz.
        Input :
        String str=“Javaisalsoeasy”
        Output: [a, s]
         */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string ");
        String str = input.nextLine();
        ArrayList<Character> character = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count = 0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            if(count>1 && (!character.contains(str.charAt(i)))){
//                System.out.print(str.charAt(i) + " ");
                character.add(str.charAt(i));
            }
        }
        System.out.println(character);
    }
}

