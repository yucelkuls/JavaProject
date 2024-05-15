package j24_Inheritance.inheritance02;

public class Hayvanlar {  // Grandparent Class
    int a; // default int type instance variable
    int m = 3; // initial edilmis int type variable

    public Hayvanlar() {
        System.out.println("Hayvanlar class p'siz const called");
    }

    public Hayvanlar(int x) {
        System.out.println("Hayvanlar class p'li const called");
    }
    public void mA(){
        System.out.println("mA -> Hayvanlar class meth called");
    }
    public void mM(){
        System.out.println("mM -> Hayvanlar class meth called");
    }

}
