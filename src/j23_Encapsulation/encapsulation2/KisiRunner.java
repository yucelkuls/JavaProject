package j23_Encapsulation.encapsulation2;

public class KisiRunner {
    public static void main(String[] args) {

        Kisi obj1 = new Kisi("Jan", "de Vries", "123asd", -34);
        System.out.println("obj1 = " + obj1);
        System.out.println("obj1.getAd() = " + obj1.getAd());  //Jan
        System.out.println("obj1.getPassword() = " + obj1.getPassword()); //123asd
        System.out.println("obj1.getSoyAd() = " + obj1.getSoyAd()); // de Vries
        System.out.println("obj1.getYas() = " + obj1.getYas()); // 34
        obj1.setAd("Selma");
        System.out.println("obj1.getAd() = " + obj1.getAd()); // Selma

    }
}
