package j19_Constructor;

public class C04_Teacher { //obj create edilen kaliphane
    String ad;
    String name;
    String soyad;
    String brans;
    int tecrube;
    double maas;
    boolean emekli;

    public C04_Teacher() {
    }

    public C04_Teacher(String ad, String soyad, String brans, int tecrube, double maas, boolean emekli) {
        //this.ad = ad;
        name=ad;
        this.soyad = soyad;
        this.brans = brans;
        this.tecrube = tecrube;
        this.maas = maas;
        this.emekli = emekli;
    }

    @Override
    public String toString() {
        return
                "ad='" + ad + '\'' +
                ", name='" + name + '\'' +
                ", soyad='" + soyad + '\'' +
                ", brans='" + brans + '\'' +
                ", tecrube=" + tecrube +
                ", maas=" + maas +
                ", emekli=" + emekli;
    }

    public static void maasHesapla(){
        System.out.println("Maasiniz hayirli olsun");
    }

    public void tebrik(){
        System.out.println("Yeni isiniz hayirli olsun");
    }
}
