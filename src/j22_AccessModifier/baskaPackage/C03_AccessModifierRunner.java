package j22_AccessModifier.baskaPackage;

import j22_AccessModifier.C01_AccessModifier;

public class C03_AccessModifierRunner {

    private String privateName = "Safvet";
    protected String protectedName = "Halit";
    String defaultName = "Sema Hanim";
    public String publicName = "saim bey";

    public static void main(String[] args) {
       // C01_AccessModifier obj1 = new C01_AccessModifier(); //p'siz const private old.icin call edilemedi.
        C01_AccessModifier obj1 = new C01_AccessModifier(33,40);
        System.out.println("obj1.publicYas = " + obj1.publicYas); // farkli package daki public variable call edilebildi.
        //obj1.protectedYas -> farklı packageden public olmayan parent-chil olmayan protected variable call edilemez:CTE
        //obj1.defaultYas-> farklı packageden public olmayan deafult variable call edilemez:CTE
        //obj1.privateYas-> farklı packageden public olmayan private variable call edilemez:CTE

        C03_AccessModifierRunner obj2 = new C03_AccessModifierRunner();

        System.out.println("obj2.privateName = " + obj2.privateName);  //kendi clasindan obj old icin tum member'lara obj ulasabildi
        System.out.println("obj2.defaultName = " + obj2.defaultName);
        System.out.println("obj2.protectedName = " + obj2.protectedName);
        System.out.println("obj2.publicName = " + obj2.publicName);

        //C01_AccessModifier.privateMeth();//static ama className ile call edilemeyen private meth
        //C01_AccessModifier.defaultMeth();//farli packageden old. icin static ama className ile call edilemeyen private meth
    }
}
