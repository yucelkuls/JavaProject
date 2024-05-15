package j26_Abstract.abstract01;

public class Civic extends Lastik { //concrete child class
    /*
  extends Honda yazılarak Honda Class'a concrete bir Civic class tanımlandı
  java CTE verdi
  çözüm:
  a) Unımplemented (uyarlanmamış) method implement edilmeli
  b)parent Honda class'dan abstarct keyword kaldırılmalı
  c)concrete olan child Civic class abstract tanımlanmalı
*/


    //concrete child Class abs. meth tanımlanır mı? nayır nolamazzzz
    //public  abstract void absMeth();
    // TRİCK -> child concrete class parent abs class'ın abs methodlarını mutlaka implement override etmeli
    @Override
    public void motor() {
        System.out.println("1.6 motor Civic");
    }

    @Override
    void koltuk() {
        System.out.println("Civic deri koltuk");
    }

    @Override
    void kapi() {
        System.out.println("Civic hatchback 5 kapi");
    }

    @Override
    public void lastikEbat() {
        System.out.println("Civic 17' lastik ebati");
    }
    //Polymorphism -> obj cok bicimlilik (farkli data type ve farkli const)

//    Civic obj = new Civic(); // Civic concrete child class
//    Honda obj1 = new Civic();
}
