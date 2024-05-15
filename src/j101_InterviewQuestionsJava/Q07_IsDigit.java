package j101_InterviewQuestionsJava;

import java.util.Scanner;

public class Q07_IsDigit {
      /* Task->
     Create a method that accepts a String as parameter and finds the sum of digits in that String.
     girilen bir stringdeki rakam değerlerinin toplamını return eden method create ediniz.
     Example:
     input : J4\/4 1$ 34$¥
     output : 16

     Hint:
     Character.isDigit()
     Integer.valueOf()
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir metin giriniz : ");
        String str = input.nextLine();
        System.out.println("sumOfDigits(str) = " + sumOfDigits(str));
    }//main sonu

    private static int sumOfDigits(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
             // sum += Character.getNumericValue(str.charAt(i));
             // sum += Integer.parseInt(str.substring(i, i + 1));
                sum += Integer.valueOf(String.valueOf(str.charAt(i)));
            }
        }
        return sum;
    }


}//Class sonu
