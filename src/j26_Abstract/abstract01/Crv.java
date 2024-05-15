package j26_Abstract.abstract01;

public class Crv extends Honda { // concrete child class
    @Override
    public void motor() {
        System.out.println("2.4 motor cok yakar");
    }

    @Override
    void koltuk() {
        System.out.println("Deri koltuk avantajlidir");
    }

    @Override
    void kapi() {
        System.out.println("4 kapi araba");
    }

    @Override
    void sunroof() {
        System.out.println("Sunrooflu CRV");
    }
}
