package j33_Lambda;

public class C10_University {
    private String universite;
    private String bolum;
    private int ogrcSayisi;
    private double notOrt;

    public C10_University() {
    }

    public C10_University(String universite, String bolum, int ogrcSayisi, double notOrt) {
        this.universite = universite;
        this.bolum = bolum;
        this.ogrcSayisi = ogrcSayisi;
        this.notOrt = notOrt;
    }

    public String getUniversite() {
        return universite;
    }

    public void setUniversite(String universite) {
        this.universite = universite;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getOgrcSayisi() {
        return ogrcSayisi;
    }

    public void setOgrcSayisi(int ogrcSayisi) {
        this.ogrcSayisi = ogrcSayisi;
    }

    public double getNotOrt() {
        return notOrt;
    }

    public void setNotOrt(double notOrt) {
        this.notOrt = notOrt;
    }

    @Override
    public String toString() {
        return
               "universite='" + universite + '\'' +
               ", bolum='" + bolum + '\'' +
               ", ogrcSayisi=" + ogrcSayisi +
               ", notOrt=" + notOrt;
    }
}
