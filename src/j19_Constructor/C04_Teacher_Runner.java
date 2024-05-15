package j19_Constructor;

import static j19_Constructor.C04_Teacher.maasHesapla;

public class C04_Teacher_Runner {
    public static void main(String[] args) {
        C04_Teacher t1=new C04_Teacher("Dogukan","Sakar","QA Tester",5,70000,false);
        System.out.println("t1 = " + t1);
        t1.emekli=true;
        t1.tecrube=7;
        System.out.println("t1 = " + t1);
        t1.tebrik();//obj ile nonStatic meth call edildi
        //t1.maasHesapla();//static meth obj ile degil meth name ile veya class ismi ile call edilir
        maasHesapla();//static meth import ile call edildi
        maasHesapla();//static meth class name ile call edildi
        C04_Teacher t2=new C04_Teacher("Selim","Halid","Dev",5,55000,false);
        System.out.println("t2 = " + t2);
    }
}
