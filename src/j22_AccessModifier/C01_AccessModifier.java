package j22_AccessModifier;

public class C01_AccessModifier {
    /*
 1)public
 2)protected
 3)default
 4)private
         1) "private" class member'lar sadece icinde bulunduklari class'lardan erişilebilir.
            Diğer class'lardan "private" class member'lara erişilemez

         2) Diğer package'lerden   olusturulan object için class'i import edilmeli

         3) Diğer package'lerden default class memberlara erişilemez.
           "default"  "package private" sağlar

         4) public class member'lara herkes her yerden erişebilir.(farkli java projesi disinda).

         5) "protected" class member'lara ayni package'dan erişilebilir. Farkli package
          için : a)Child class erişebilir.  b)Child class degil ise erişilemez.

         6) Class'lar için  sadece "public" ve "default" access modifier kullanilir.
          Class tanımlanırken "private" veya "protected" access modifier kullanilmaz.

 */
    private int privateYas = 33;
    int defaultYas = 21;
    protected int protectedYas = 40;
    public int publicYas = 49;

    private C01_AccessModifier() {
        System.out.println("p'siz constructor run edildi");
    }

    public C01_AccessModifier(int ilkYas, int sonYas) {
        System.out.println("2 p'li const run edildi");
    }

    private static void privateMeth(){
        System.out.println("Private meth run edildi");
    }

    static void defaultMeth(){
        System.out.println("Default meth run edildi");

    }
}
