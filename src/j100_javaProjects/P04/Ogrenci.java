package j100_javaProjects.P04;

public class Ogrenci extends Kisi{ //Kisi parnet Class'a extend child pojo Class
    // fields - > instance variable (obje icin)
    private String ogrcNumara;
    private String sinif;

    // Constructor...

    public Ogrenci() { //p'siz const
    }

    public Ogrenci(String adSoyad, String kimlikNo, int yas, String ogrcNumara, String bolum) { //full
        super(adSoyad, kimlikNo, yas);
        this.ogrcNumara = ogrcNumara;
        this.sinif = bolum;
    }

    // getter and setter

    public String getOgrcNumara() {
        return ogrcNumara;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    //toString

    @Override
    public String toString() {
        return super.toString() +
               ", ogrcNumara=" + ogrcNumara + '\'' +
               ", sinif=" + sinif;
    }
}