package Z_MyWork;

class Main {
    public static void main(String[] args) {
        Car c1 = new Car("Auto");
        Car c2 = new Car("4W", 150, "Manuel");
        System.out.println(c1.type + " " + c1.maxS + " " + c1.trans);
        System.out.println(c2.type + " " + c2.maxS + " " + c2.trans);
    }
}
