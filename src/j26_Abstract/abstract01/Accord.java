package j26_Abstract.abstract01;

public class Accord extends Honda{ //concrete child class
    @Override
    public void motor() {
        System.out.println("Accord 2.0 motor");
    }

    @Override
    void koltuk() {
        System.out.println("Accord deri koltuk");
    }

    @Override
    void kapi() {
        System.out.println("Accord 5 kapi");
    }

    @Override
    void sunroof() {
        System.out.println("Accord sunroof'lu");
    }
}
