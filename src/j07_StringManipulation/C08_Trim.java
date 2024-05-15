package j07_StringManipulation;

public class C08_Trim {
    public static void main(String[] args) {
         /*
trim()-> İstediğimiz String'in başında veya sonunda varolan boşluk (space)'leri temizler.

       */
        String str = "   merhaba   hosgeldiniz    ";
        System.out.println("str = " + str); // '    merhaba   hosgeldiniz   '
        System.out.println("str.length() = " + str.length()); // 28
        System.out.println("str.trim() = " + str.trim()); // 'merhaba   hosgeldiniz'
        System.out.println("str.trim().length() = " + str.trim().length()); // 21
        System.out.println("str = " + str); // '    merhaba   hosgeldiniz   ' atama olmadigi icin degismez.



    }
}
