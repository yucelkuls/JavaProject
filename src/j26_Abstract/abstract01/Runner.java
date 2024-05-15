package j26_Abstract.abstract01;

public class Runner {
    public static void main(String[] args) {
        Civic c1 = new Civic();
        c1.motor(); // 1.6 motor Civic
        c1.kapi();  // Civic hatchback 5 kapi
        c1.koltuk(); // Civic deri koltuk
        c1.sunroof(); // Honda concrete meth called
        c1.lastikEbat(); //Civic 17' lastik ebati
        c1.name = "Enes";
        System.out.println("c1.name = " + c1.name); //c1.name = Enes

        Accord c2 = new Accord();
        c2.motor(); // Accord 2.0 motor
        System.out.println("c2.name = " + c2.name); // c2.name = Ahmet
        c2.koltuk(); //Accord deri koltuk
        c2.kapi(); //Accord 5 kapi
        c2.sunroof(); //Accord sunroof'lu

        Crv c3 = new Crv();
        c3.name = "Seher";
        System.out.println("c3.name = " + c3.name); //c3.name = Seher
        c3.motor(); //2.4 motor cok yakar
        c3.kapi(); // 4 kapi araba
        c3.koltuk(); //Deri koltuk avantajlidir
        c3.sunroof(); //Sunrooflu CRV
    }
}
