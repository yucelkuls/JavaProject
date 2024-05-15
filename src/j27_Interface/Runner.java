package j27_Interface;

public class Runner {
    public static void main(String[] args) {
        Sahin daganGorunumlu=new Sahin();
        daganGorunumlu.kapi();//4 KAPI sedan
        daganGorunumlu.motor();//1.6 MOTOR az yakar cok kacar
        daganGorunumlu.yakit();//TUP yoksa eve ates duser
        daganGorunumlu.kaporta();//Akordion KAPORTA
        daganGorunumlu.klima();//KLIMA icin cam neyine yetmiyor
        daganGorunumlu.jant();//Jilet Ahmet JANTi giyinir
        daganGorunumlu.ebatLastik();//LASTIK gibi sundurme
        daganGorunumlu.sunroof();//non-static concrete meth obj ile call edildi->Soguk havada sunroof usutur
        System.out.println(daganGorunumlu.sisLamp());//non-static concrete meth obj ile call edildi->Sisli havada Can kurtarir
        DisDonanim.anten();//static concrete meth interfaceName ile call edildi->Cekemeyen anten taksin
        System.out.println("DisDonanim.RENK = " + DisDonanim.RENK);//Kirmizi
        System.out.println("IcDonanim.RENK = " + IcDonanim.RENK);//Yavru agzi
        System.out.println("Lastik.RENK = " + Lastik.RENK);//Cingene pembasi
        System.out.println("IcDonanim.KUMAS = " + IcDonanim.KUMAS);//Kadife
        System.out.println("IcDonanim.MUSIC = " + IcDonanim.MUSIC);//Selvi boylum
    }
}
