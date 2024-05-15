package j20_StaticKeyword.Tasks.Task02;

import java.text.DecimalFormat;

public class ElektrikHesabi {
    /*
    Task 02 ->
    ElektirikHesap Class:  fields : toplamTuketim(int), oran(double), fatura(double)
    Müşteriye ait tüketilen enerjiyi toplamTuketim'e toplayan tüketimEkle method
    oran(0.7)  katsaysı ile  toplamTuketim çarparak fatura değeri atayan odenecekTutar method
    Müsteri Class: fields: name ElektrikHesabi class obj.
    Runner Class obj ile enz 2  aylık elektrik tüketim faturası print eden code create ediniz
     */
    //fields:
    int toplamTuketim;
    String name;
    int aylik1;
    int aylik2;
    double oran = 0.7;
    double fatura;
    public ElektrikHesabi(String name, int i1, int i2) {
        this.name = name;
        this.aylik1 = i1;
        this.aylik2 = i2;
        tuketimEkle();
        odenecekTutar();
        System.out.println(this);
    }
    public void tuketimEkle() {

        toplamTuketim = aylik1 + aylik2;
    }
    public void odenecekTutar() {

        fatura = (oran * toplamTuketim);
    }
    @Override
    public String toString() {
        return "ElektrikHesabi{ " +
                "name=" + name + ", " +
                "toplamTuketim=" + toplamTuketim +
                ", aylik1=" + aylik1 +
                ", aylik2=" + aylik2 +
                ", oran=" + oran +
                ", fatura=" + fatura + "TL" +
                ", fatura=" + new DecimalFormat(".##").format(fatura) + "TL" +
                '}';
    }
}