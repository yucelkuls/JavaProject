package j02_Data_Types_WrapperClass;

public class C03_Concatenation {

    /*
   Not: char variable'lari matematiksel islemlerde   ASCII degerleri kullanir.
        Ornegin; System.out.println('A' + 'CK'); ekrana AC yerine 132 print eder.
   Note: Java'da "+" sembolunun
           i)Toplama islemi
           ii)Birlestirme Islemi(Concatenation)
         Java "+" sembolu  once toplama yapmaya calisir, yapamazsa birlestirme islemi yapılır aksi halde CTE verir.
*/

    public static void main(String[] args) {

        String name = "Can ";
        String surname = "Yucel";


        System.out.println(name + surname);  //String gucludur ve yanyana yazma olarak calisir.
        int a = 17;
        int b = 45;

        System.out.println(name + surname + a + b);         // Can Yucel1745
        System.out.println(a + name + surname + b);         // 17Can Yucel45
        System.out.println(a + b + name + surname);         // 62Can Yucel
        System.out.println(a + b);                          // 62
        System.out.println(name + surname + (a + b));       // Can Yucel62
        System.out.println((a + b) + name + surname);       // 62Can Yucel
        System.out.println(name + (a- b) + (a + b));        // Can -2862
        System.out.println(name + ((a + b) + (a - b)));     // Can 34

        System.out.println(""+ a + b);  // Onune tirnak isareti koyarsak string olarak algilar ve 1745 yanyana print eder.

        char ch = '1';
        System.out.println(name + ch);  // Can 1
        System.out.println(a + ch + name);  // 66Can  >>> a + ch nin ASCII degerini aliyor.
        System.out.println(name + (ch + a));  // Can 66 >>> Parantez icini toplama yapmaya calisir. ch nin degerini ASCII den aliyor.

        //char data type isleme alindiginda variable type'ina gore farkli cikti verir.








    }
}
