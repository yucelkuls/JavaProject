package j20_StaticKeyword.Tasks.Task01;

public class Runner {
     /*
     Task 01 >
     fields: width, length ve cevre ve alan hesaplayan method olan Rectangle isminde Class create ediniz.
     Runeer class'da obj ile cevre ve alan değelerini print eden code create ediniz.
    */

    public static void main(String[] args) {
        Rectangle obj1 = new Rectangle(5,10);
        obj1.areaMeth();
        obj1.perimeterMeth();

        Rectangle obj2 = new Rectangle();
        obj2.width = 4;
        obj2.length = 5;
        obj2.areaMeth();
        obj2.perimeterMeth();

        Rectangle obj3 = new Rectangle(3,7);
        obj3.areaMeth();
        obj3.perimeterMeth();
    }
}
