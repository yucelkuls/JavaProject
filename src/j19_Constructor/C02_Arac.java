package j19_Constructor;

public class C02_Arac {//class level
    //fields->instance variable->obje variable
    String marka;
    String model;
    int km;
    int motorHacim;
    boolean vitesAuto;
    boolean ikinciEl;
    int yil;

    public C02_Arac(String marka, String model, int km, int motorHacim, boolean vitesAuto, boolean ikinciEl, int yil) {//full p'li telescopic const
        this.marka = marka;
        this.model = model;
        this.km = km;
        this.motorHacim = motorHacim;
        this.vitesAuto = vitesAuto;
        this.ikinciEl = ikinciEl;
        this.yil = yil;
    }

    public C02_Arac() {

    }

    @Override
    public String toString() {//obje icin girilen fieldleri stringe cevirir
        return
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", km=" + km +
                ", motorHacim=" + motorHacim +
                ", vitesAuto=" + vitesAuto +
                ", yil=" + yil;
    }

    public static void main(String[] args) {//main level
        /*
        Task-> fields: marka,model,km,motorHacim,vitesAotu,ikinciEl,yıl olan
         3 obj  create ederek fields print eden code create ediniz.
         */
        C02_Arac arac1=new C02_Arac();//p'siz default const call edilerek arac1 obj create edildi
        arac1.marka="Volvo";
        arac1.model="xc90";
        arac1.ikinciEl=false;
        arac1.yil=2015;
        arac1.motorHacim=2000;
        arac1.km=130000;
        arac1.vitesAuto=true;
        //                    Volvo             xc90                  true                  2015              130000             2000                   false
        System.out.println(arac1.marka + " " + arac1.model + " " + arac1.vitesAuto + " " + arac1.yil + " " + arac1.km + " " + arac1.motorHacim + " " + arac1.ikinciEl);

        C02_Arac arac2=new C02_Arac("BMW","X6",333000,4000,true,true,2012);
        System.out.println(arac2.marka + " " + arac2.model + " " + arac2.vitesAuto + " " + arac2.yil + " " + arac2.km + " " + arac2.motorHacim + " " + arac2.ikinciEl);
        System.out.println("arac1 = " + arac1);//j19_Constructor.C02_Arac@32e6e9c3
        System.out.println("arac1 = " + arac1);//marka='Volvo', model='xc90', km=130000, motorHacim=2000, vitesAuto=true, yil=2015
        System.out.println("arac2 = " + arac2);//marka='BMW', model='X6', km=333000, motorHacim=4000, vitesAuto=true, yil=2012

    } // end of main

} // end of Class
