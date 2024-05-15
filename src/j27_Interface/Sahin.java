package j27_Interface;

public class Sahin extends Tofask implements DisDonanim,IcDonanim,Lastik{
    @Override
    public void motor() {
        System.out.println("1.6 MOTOR az yakar cok kacar");
    }

    @Override
    public void yakit() {
        System.out.println("TUP yoksa eve ates duser");
    }

    @Override
    public void kapi() {
        System.out.println("4 KAPI sedan");
    }

    @Override
    public void kaporta() {
        System.out.println("Akordion KAPORTA");
    }

    @Override
    public void koltuk() {
        System.out.println("Deri KOLTUK yazin sikinti");
    }

    @Override
    public void klima() {
        System.out.println("KLIMA icin cam neyine yetmiyor");
    }

    @Override
    public void ebatLastik() {
        System.out.println("LASTIK gibi sundurme");
    }

    @Override
    public void jant() {
        System.out.println("Jilet Ahmet JANTi giyinir");
    }
}
