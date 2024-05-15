package j101_InterviewQuestionsJava;

public class Q01_ReverseString {
        /* Task->
	     Stringi tersten print için
		1.Yol: StringBuilder () kullanarak
		2.Yol: String Classini kullanarak
		3.Yol: Bir method create ediniz
    */

    public static void main(String[] args) {

        String str = "All is well";
        // 1. yol StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String reverseString = sb.reverse().toString();
        System.out.println("1. yol StringBuilder reverse : "+reverseString);
        // 2. yol String Class
        System.out.println("2. yol");
        for (int i = str.length() -1 ; i >=0 ; i--) {
            System.out.print(str.charAt(i));
        }
        // 3. yol
        System.out.println("\n3. yol ");
        reverseString(str);


    }//main sonu

    private static void reverseString(String str) {
        char[] arr = str.toCharArray();
        for (int i = str.length() -1 ; i >=0 ; i--) {
            System.out.print(str.charAt(i));
        }
    }
}//class sonu
