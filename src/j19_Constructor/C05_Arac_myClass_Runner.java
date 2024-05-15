package j19_Constructor;

public class C05_Arac_myClass_Runner {
    public static void main(String[] args) {

        C05_Arac_myClass a1 = new C05_Arac_myClass("Fiesta");
        C05_Arac_myClass a2 = new C05_Arac_myClass("Mondeo", 250);
        C05_Arac_myClass a3 = new C05_Arac_myClass();
        a3.model = "Mustang";
        a3.maxSpeed = 285;
        a2.model = "Mini";
        System.out.println("a2 = " + a2);
        System.out.println("a3 = " + a3);
        System.out.println("a1 = " + a1);
    }
}
