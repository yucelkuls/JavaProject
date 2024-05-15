package j27_Interface.Tasks.Task01;

public class Runner {
    public static void main(String[] args) {
        Cember c1=new Cember();
        System.out.println("c1.cevre(4) = " + c1.cevre(4));
        System.out.println("c1.alan(5) = " + c1.alan(5));

        Dikdortgen d1=new Dikdortgen();
        System.out.println("d1.alan(4,5) = " + d1.alan(4, 5));
        System.out.println("d1.cevre(4,5) = " + d1.cevre(4, 5));

        Kare k1=new Kare();
        System.out.println("k1.cevre(6) = " + k1.cevre(6));
        System.out.println("k1.alan(6) = " + k1.alan(6));

    }
}
