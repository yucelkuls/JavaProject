package j21_Scope;

public class C02_StaticVariable {
    static String firmaIsim = "Clarusway";  // initial edilmis static variable
    static int firmaId;
    static boolean firmaIt;

    public static void main(String[] args) {

        /*  instance variable'lar obje'ye bagimlidir ve her obje farkli degerler alabilir
   ogrenci notlari veya ogretmen branslari gibi bir objeye ait bir variable'in son degerini
    bulmak icin sadece o objeyi dikkate alınır

  Static variabler ise class variable olarak tanimlanir
  ve değeri tum class uyeleri icin sabittir. Okul ismi, okul mudurunun adi gibi
  eger static variable'in degeri degistirilirse herkes icin degisir.-> güneş misali

*/
        System.out.println("firmaIt = " + firmaIt); // static var. old. icin dogrudan call edilebildi.
        firmaIt = true;  // static var. value atandi.
        System.out.println("C02_StaticVariable.firmaIsim = " + C02_StaticVariable.firmaIsim);
        staticMeth();
        System.out.println("C02_StaticVariable.firmaIsim = " + C02_StaticVariable.firmaIsim);
        System.out.println("firmaIsim = " + firmaIsim);

    }

    public static void staticMeth() {
        System.out.println("Static meth run");
        firmaId = 1001;
        C02_StaticVariable obj = new C02_StaticVariable();
        obj.nonStaticMeth(); // obj yardimiyla call edilebildi.
    }

    public void nonStaticMeth() {
        firmaIsim = "QA Tester";  // static var. old. icin dogrudan call edilebildi.
        System.out.println("Non-static meth run");
        //staticMeth(); // static meth, non-static scope'ta call direkt edilebilir.
    }
}
