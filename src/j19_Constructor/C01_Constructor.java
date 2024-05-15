package j19_Constructor;

import j01_Variables.C01_HelloWorld;

import java.lang.reflect.Constructor;

public class C01_Constructor { // Class level
    /*
N e D e N  --> OOP <--  k U l L a N ı L ı R...
Nesne Yönelimli Programlamanın(oop) Faydaları
1- Obj oluşturma bir Class içerisinde toplanır ve tüm projelerde kullanılabilirliğe imkan sağlar.
2- Class'ların 1 kez oluşturulması sayesinde uzun kodları tekrardan yazmak yerine kısa kodlamalar ile çalıştırılabilir.
3- Uzun kodların tekrar yazılmasının engellenmesi sayesinde geliştirme süreci kısalır.
4- Object'ler birbirinden bağımsız olduğundan data güvenliği konusunda avantaj sağlar.
5- Class'lar sayesinde tüm projelerde değişiklik yapmak yerine tek bir Class'da değişiklik yapılıp tüm projelerde çalışması sağlanır.
Bu zaman kaybını büyük ölçüde azaltır.
*/
// fields-> obj variable => obj değerlerin aldıgı alan özellikler

    String str; // Class level da obj variable tanimlandi (Initial edilmedi!!!)
    String sayHi = "Hello everyone!"; // Class level da obj variable tanimlandi (Initial edildi)

    //C01_Constructor obj1 = new C01_Constructor(); //Class levelde parametresiz const create edildi.
    C01_HelloWorld obj99 = new C01_HelloWorld(); // Haricten bir parametresiz obj create edildi
    public static void main(String[] args) {  // main level

        String mainVariable = " greetings from main method"; // main scope'ta variable create edildi
      // Class name    objName  new Constructor  -> for obj create
        C01_Constructor obj1 = new C01_Constructor(); // Farkli scope'ta ayni isimde obj create edildi
        C01_Constructor obj2 = new C01_Constructor();
        C01_Constructor obj3 = new C01_Constructor();

        obj1.str = "JavaNAZZ";
        obj3.str = "JavaHAN";
        obj2.sayHi = "Lets continue"; // Class level da oldugu icin obj yardimi ile call edilebilir.
        System.out.println("obj1.sayHi = " + obj1.sayHi);  //  Hello everyone!
        System.out.println("obj2.str = " + obj2.str);  // null
        System.out.println("obj2.sayHi = " + obj2.sayHi);  // Lets continue
        System.out.println("obj3.str = " + obj3.str);  //  JavaHAN
        staticMeth(); // Direkt call edilebilir static oldugu icin.
        obj3.nonStaticMeth(); // Ancak obj ile call edilebilir. Static degil cunku.

    } // end of main

    public void nonStaticMeth(){
        System.out.println("Greetings from nonStaticMeth");
    }
    public static void staticMeth(){
        System.out.println("Greetings from staticMeth");
    }
} // end of Class
