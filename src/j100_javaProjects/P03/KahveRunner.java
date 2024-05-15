package j100_javaProjects.P03;


public class KahveRunner {

    public static void main(String[] args) {
        Kahve customer1 = new Kahve();

        customer1.choiseCoffee(); // objName ile method call edildi.
        System.out.println(customer1);
        customer1.choiseMilk();
        System.out.println(customer1);
        customer1.choiseSugar();
        System.out.println(customer1);
        customer1.choiseSize();
        System.out.println(customer1);
        customer1.calculateFee();
        System.out.println(customer1);

    }


}