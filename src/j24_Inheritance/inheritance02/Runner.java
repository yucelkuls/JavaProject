package j24_Inheritance.inheritance02;

public class Runner {
    public static void main(String[] args) {
     //data type   obj  =   Const
        Kedi       k1   = new Kedi(); // Kedi class data type obj created
        System.out.println("k1.a = " + k1.a); // k1.a = 0
        System.out.println("k1.c = " + k1.c); // k1.c = 2
        System.out.println("k1.d = " + k1.d); // k1.d = 7
        System.out.println("k1.m = " + k1.m); // k1.m = 1

        Memeliler k2 = new Kedi("beyaz");
        System.out.println("k2.a = " + k2.a); // 0
        System.out.println("k2.c = " + k2.c); // 4  Bu c Memeliler classindakidir
        // System.out.println("k2.d = " + k2.d); // CTE Memelilerde ve parent Hayvanlarda d variable yoktur.
        System.out.println("k2.m = " + k2.m);// 1

        Hayvanlar k3 = new Kedi("poncik"); // Hayvanlar data type obj created
        System.out.println("k3.a = " + k3.a);  // 0
        System.out.println("k3.m = " + k3.m);  // 3
       // System.out.println("k3.c = " + k3.c);  // CTE Memelilerde ve parent Hayvanlarda d variable yoktur.
       // System.out.println("k3.d = " + k3.d);  // CTE Memelilerde ve parent Hayvanlarda d variable yoktur.

        /*
Ahan da trick köşesinde böğün->inherit edilmiş herhangi bir obj varaible  Data type göre call edilir
Variable araştırmaya data type Class'dan başlanıp parentlere gidilir.
*/
        System.out.println("******************");
        k1.mA(); // mA -> Hayvanlar class meth called
        k1.mC(); // Kedi class meth called
        k1.mM(); // Memeliler class meth called
        System.out.println("******************");
        k2.mA(); // Hayvanlar class meth called
        k2.mC(); // Kedi class meth called
        k2.mM(); // Memeliler class meth called
        System.out.println("******************");
        k3.mA(); // Hayvanlar class meth called
        k3.mM(); // Memeliler class meth called
       // k3.mC();  // kendinde olmayan methodu getiremiyor.
        /*
 Ahan da trick köşesinde böğün:inherit edilmiş herhangi bir obj methodları  cons. göre call edilir
 method araştırmaya cons. Class'dan başlanıp parentlere gidilir
 */

    }
}
