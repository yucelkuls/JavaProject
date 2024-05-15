package j19_Constructor;

public class C05_Arac_myClass {
    // fields -> obj.variable -> instance variable
    String model;
    int maxSpeed;

    public C05_Arac_myClass() {
        System.out.println("If you read this sentence, this Constructor is being run without parameter");
    }

    public C05_Arac_myClass(String model) {
        this("Ford", 185);
        // this();//p'siz const 2. satırda olg için call edilemedi->CTE
    /*
     1) Constructor icinden baska bir Constructor call  icin "this()" kullanılır.
        this() keyword mutlaka constructor body'nin ilk satirına yazılmalı
        Aksi takdirde CTE verir
    2) Bir Constructor icinden sadece bir tane Constructor call  yapılır.Cunku birden cok const. call edilirse
        birisi ilk satirda olamayacaktir, bu da ilk kuralla celisir.
    */
        this.model = model;
        System.out.println("If you read this sentence, it means that this Constructor is being run with a parameter");
    }

    public C05_Arac_myClass(String model, int maxSpeed) {  // full parameters const.
        this();
        this.model = model;
        this.maxSpeed = maxSpeed;
        System.out.println("If you read this sentence, it means that this Constructor is being run with full parameters");
    }
    @Override
    public String toString() {
        return
               "model='" + model + '\'' +
               ", maxSpeed=" + maxSpeed;
    }
}
