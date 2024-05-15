package j100_javaProjects.P04;

public class Kisi { // parent pojo class
    // fields...
    private String adSoyad;
    private String kimlikNo;
    private int yas;

    // Constructor
    public Kisi() {  // p'siz const
    }

    public Kisi(String adSoyad, String kimlikNo, int yas) { // full p'li telescopic const..
        this.adSoyad = adSoyad;
        this.kimlikNo = kimlikNo;
        this.yas = Math.abs(yas);
    }

    // getter and setter

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    //toString meth
    @Override
    public String toString() {
        return
               "adSoyad='" + adSoyad + '\'' +
               ", kimlikNo='" + kimlikNo + '\'' +
               ", yas=" + yas
               ;
    }
}
