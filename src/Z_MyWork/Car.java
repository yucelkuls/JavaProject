package Z_MyWork;

class Car extends Vehicle {
    String trans;

    public Car(String trans) {
        this.trans = trans;
    }

    public Car(String type, int maxS, String trans) {
        super(type, maxS);
        this.trans = trans;
    }

}
