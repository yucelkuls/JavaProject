package j24_Inheritance.inheritance02;

public class Memeliler extends Hayvanlar{ // GrandParent Hayvanlar Class dan extends edilen parent class
    int m = 1; // initial int type variable
    int c = 4; // initial int type variable

    public Memeliler() { // default p'siz const
        this('H'); // bu class'taki p'li const called
        System.out.println("memeliler class p'siz const called");
    }
    public Memeliler(char y) { // 1 p'li const
        super(34); // parent class'taki p'li const called
        System.out.println("memeliler class 1 p'li const called");
    }
    public void mC(){
        System.out.println("mC -> Memeliler class meth called");
    }

    @Override // anotation - dipnot
    public void mM() {  // parentten ezilen meth
        System.out.println("mM - > Memeliler class meth called");
    }
}
