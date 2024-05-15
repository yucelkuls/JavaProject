package j21_Scope;

public class C01_InstanceVariable { // Class level
    static String kurs="Clarusway";//initial edilmis class variable
    static String prLanguage;//initial edilmemis class variable

    int yas=49;//initial edilmis obj variable->0
    int tecrube;//initial edilmemis obj variable->0
    String isim;//initial edilmemis obj variable->nul
    boolean developer;//initial edilmemis obj variable->false
    double boy;//initial edilmemis obj variable->0.0
    char unvan;//initial edilmemis obj variable->' '
    /*												INSTANCE VARIABLE

 1) j26_Abstract.Main method'un ve urettiginiz diger methodlarin disinda  (ustunde veya altinda), class'in icinde
     olusturulan variable'lara non-Static Class level "instance variable" denir.
 2) Instance variable'lar object olusturulurken olusturulur ve her obje'ye bu variable'lar monte edilir.
 3) Instance variable'lara deger atamasi yapsaniz da olur, yapmasaniz da olur.
     Asagida goruldugu gibi "yas" variable'ina deger atamasi yapıldı ama "tecrube" variable'ina yapılmadı
     Note : Bir variable'a deger atamasi yapma "Initialize" olarak adlandirilir.
         "yas" variable'i initialize edildi, digerleri initialize edilmedi.
 4) Initialize edilmeyen "instance variable" lar icin Java "default value" atamasi yapar.
             byte, short, int, long icin default value 0'dir.
             float, double --> default value 0.0'dir.
             char --> default value ' ''dir.
             boolean --> default value false'dur.
             String --> default value "null" dir.

*/
    public static void main(String[] args) {//main level
        //static int kg=99;//Class level haricinde main veya baska bir meth static(class) variable tanimlanamaz->CTE
        int kg=99;//inital edilmis LOCAL VARIABLE
        int id;//inital edilmemis LOCAL VARIABLE
        //System.out.println(id);//Initial edilmeis local variable herhangi bir actiona tabi tutulamaz->CTE
        id=100;//local variable deger atandi
        System.out.println("id scope icinde dogrudan call edildi "+id);//value atanan variable scpoe icinde dorudan actiona tabi tutulabilir
        //System.out.println("yas :"+yas);//obj variable obj olmadan dorudan call edilemez
        prLanguage="Java";
        System.out.println("prLanguage static variable old. icin obj olmadan dorudan call edilebilir "+prLanguage);
        staticMeth();//static meth dorudan call edildi
        //nonStaticMeth();//nonStaticMeth main icinde dorudan call edilemez
        C01_InstanceVariable obj1=new C01_InstanceVariable();//obj create edildi
        obj1.nonStaticMeth();//non-static meth obj yardimi ile call edildi
        System.out.println("obj1.boy = " + obj1.boy);//ins variable obj yardimi ile call edildi
        System.out.println("obj1.kurs = " + obj1.kurs);//bad practice->obj yardimi ile static variable call edildi
        //obj1.id;//local variable obj ile call edilemez
        System.out.println("id = " + id);

    }//main sonu
    public static void staticMeth(){
        System.out.println("Static meth run edildi");
    }
    public void nonStaticMeth(){
        System.out.println("Non-Static meth run edildi");
    }
}
