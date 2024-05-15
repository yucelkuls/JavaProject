package j20_StaticKeyword;

public class C01_Ogretmen_Runner {
    public static void main(String[] args) {
        C01_Ogretmen t1 = new C01_Ogretmen("Selma", 11);
        System.out.println("t1.name = " + t1.name); // obj ile instance var. call // Selma
        System.out.println("t1.experience = " + t1.experience);// obj ile instance var. call // 11
        t1.congratulate(); // obj ile non-static meth call    // Congratulations on your marriage!
        t1.calculateSalary(); // BAD PRACTICE   //  Enjoy your salary
        C01_Ogretmen.calculateSalary(); //BEST PRACTICE  //  Enjoy your salary
        System.out.println("C01_Ogretmen.scoolName = " + C01_Ogretmen.scoolName); // C01_Ogretmen.scoolName = Harvard
        C01_Ogretmen.scoolName = "MIT";
        System.out.println("t1.scoolName = " + t1.scoolName); // Bad  // t1.scoolName = MIT
        System.out.println("C01_Ogretmen.scoolName = " + C01_Ogretmen.scoolName);  // C01_Ogretmen.scoolName = MIT
        C01_Ogretmen t2 = new C01_Ogretmen("Marry", 8);
        System.out.println("t2.experience = " + t2.experience);  // 8
        System.out.println("t2.name = " + t2.name); // Marry
        System.out.println("t2.scoolName = " + t2.scoolName); // MIT
        C01_Ogretmen t3 = new C01_Ogretmen();
        System.out.println("t3.name = " + t3.name);  // null
        System.out.println("t3.experience = " + t3.experience); //  0
        System.out.println("t3.scoolName = " + t3.scoolName); //  MIT (static old. icin son degeri aldi)


    }
}
