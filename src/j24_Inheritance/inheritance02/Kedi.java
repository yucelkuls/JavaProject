package j24_Inheritance.inheritance02;

public class Kedi extends Memeliler{ //parent(super) Memeliler class tan extends edilen child(sub) class
    int c=2; // initial int type variable
    int d=7; // initial int type variable

    public Kedi() { // p'siz default const
        super(); // parent(Memeliler) class daki p'siz const called
        System.out.println("Kediler class p'siz const called");
    }
    public Kedi(String str) { // 1 p'li const
        this(); // bu class daki default p'siz const called
//        this("str");  // CTE RECURSIVE CONST CALL EDILEMEZ.
        System.out.println("super.c = " + super.c); // parent(Memeliler) class daki c variable called
        System.out.println("Kediler class p'li const called");
    }

    @Override   // annotation -> dipnot -> overriden(ezilen) meth ile override(ezen) meth iliskilendirildi
    public void mC() {
        System.out.println("mC -> Kedi class meth called");
    }

    @Override
    public String toString() {
        return "Kedi{" +
               "c=" + c +
               ", d=" + d + super.toString();
    }
}
