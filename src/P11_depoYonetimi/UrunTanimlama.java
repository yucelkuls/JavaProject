package P11_depoYonetimi;

import java.util.HashMap;
import java.util.Map;

public class UrunTanimlama {
    static int id = 1000;
    String urunIsmi;
    String uretici;
    int miktar=0;
    String birim;
    String raf;
    static Map<Integer, UrunTanimlama> urunMap = new HashMap<>();

    public UrunTanimlama(Integer id, String urunIsmi, String uretici, int miktar, String birim, String raf) {
        UrunTanimlama.id = id;
        this.urunIsmi = urunIsmi;
        this.uretici = uretici;
        this.miktar = miktar;
        this.birim = birim;
        this.raf = raf;
    }

    public UrunTanimlama(String urunIsmi, String uretici, int miktar, String birim, String raf) {
        this.urunIsmi = urunIsmi;
        this.uretici = uretici;
        this.miktar = miktar;
        this.birim = birim;
        this.raf = raf;
    }

    public UrunTanimlama() {
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        id = id;
    } // fake urunlerden dolayı

    public String getUrunIsmi() {
        return urunIsmi;
    }

    public void setUrunIsmi(String urunIsmi) {
        this.urunIsmi = urunIsmi;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public String getRaf() {
        return raf;
    }

    public void setRaf(String raf) {
        this.raf = raf;
    }

    @Override
    public String toString() {
        return "\b\b\b\b\b\b\t" + urunIsmi + "\t\t\t\t\t" +
                uretici + "\t\t\t\t\t" +
                miktar + "\t\t\t\t\t" +
                birim + "\t\t\t\t\t" +
                raf;
    }
}
