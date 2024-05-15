package j19_Constructor;

public class C05_Arac_Runner {
    public static void main(String[] args) {
        C05_Arac a1=new C05_Arac("Toros");
        C05_Arac a2=new C05_Arac("Tosbik",250);
        C05_Arac a3=new C05_Arac();
        a3.model="Brodway";
        a3.maxHiz=150;
        a2.model="Vosvos";
        System.out.println("a2 = " + a2);
        System.out.println("a3 = " + a3);
        System.out.println("a1 = " + a1);
    }
}
