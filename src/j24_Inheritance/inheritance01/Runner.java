package j24_Inheritance.inheritance01;

public class Runner {
    /*
1)Java'da class'lar arasinda parent(Aile)-child(Cocuk)  relationship(iliski) tanımlanmıştır.
2)Parent Class'a "super class"   Child Class'a "sub class"  denir.
3)Ortak ozellikler parent class'a, specific ozellikler child class'a tanımlanır.
4)Parent Child Relationship "reusability", "maintenance",  "less code", "well organization" avantajları için kullanılır.
5)Child classlar parent'lardaki her methodu ve variable'i  kullanabilir ama parent class child'dakileri kullanamaz.
6)Java "Multiple Inheritance"'i desteklemez. Yani; Java'da  bir Child Class'in 1'den fazla parent'i olamaz.
7)Bir parent class, 1'den fazla child class ile olusturulan  parent child relationship'e "Hierarchical Inheritance"
denir.
8)Child-Parent-Grandparent... seklinde olusturulan cok katli  parent child relationshipe'e multi-level inheritance denir.
9)"Object Class" -> Hz.Adem Class :) butun classlarin parent class'idir. Java'da parent class'i olmayan tek class "Object Class"dir

*/
    public static void main(String[] args) {
        Hayvanlar h1 = new Hayvanlar();  // grandparent class dan obj created.
        h1.hareket();
        h1.beslenme();
        h1.icme();

        Balik b1 = new Balik();  // child class dan obj created.
        b1.izgaraTava(); // child class kendi meth called.
        b1.hareket();   // parent class dan meth. called
        b1.beslenme();  //      ''       ''
        b1.icme();    //        ''       ''

        Memeliler m1 = new Memeliler();  // parent class dan obj created.
        m1.sutBeslen();     //   parent class dan meth called.
        m1.dogum();         //      "       "
        m1.beslenme();      //  grandparent den meth called.
        m1.icme();          //      "       "
        m1.hareket();       //      "       "

        Koyun k1 = new Koyun();  // child class dan obj created.
        k1.meler();   // child class kendi meth called.
        k1.sutBeslen(); //   parent class dan meth called.
        k1.dogum();    //      "       "
        k1.icme(); //  grandparent den meth called.
        k1.hareket();  //  grandparent den meth called.
        k1.beslenme(); //  grandparent den meth called.

        Kedi p1 = new Kedi();  // child class dan obj created.
        p1.cirmalama(); // child class kendi meth called.
        p1.sutBeslen(); //   parent class dan meth called.
        p1.dogum();    //      "       "
        p1.icme(); //  grandparent den meth called.
        p1.hareket();  //  grandparent den meth called.
        p1.beslenme(); //  grandparent den meth called.

    }
}
