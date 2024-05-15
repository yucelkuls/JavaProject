package j100_javaProjects.P04;

public class Ogretmen extends Kisi{//Kisi parent Class'a extend child pojo Class
    // fields - > instance variable (obje icin)
    private String sicilNo;
    private String bolum;

    // Constructor...

    public Ogretmen() { //p'siz const
    }

    public Ogretmen(String adSoyad, String kimlikNo, int yas, String sicilNo, String bolum) { //full
        super(adSoyad, kimlikNo, yas);
        this.sicilNo = sicilNo;
        this.bolum = bolum;
    }

    // getter and setter

    public String getSicilNo() {
        return sicilNo;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    //toString


    @Override
    public String toString() {
        return super.toString() +
               ", sicilNo='" + sicilNo + '\'' +
               ", bolum='" + bolum;
    }
}
