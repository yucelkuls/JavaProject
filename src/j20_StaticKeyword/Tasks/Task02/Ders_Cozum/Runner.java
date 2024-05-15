package j20_StaticKeyword.Tasks.Task02.Ders_Cozum;

public class Runner {
    /*
    Task 02 ->
    ElektirikHesap Class:  fields : toplamTuketim(int), oran(double), fatura(double)
    Müşteriye ait tüketilen enerjiyi toplamTuketim'e toplayan tüketimEkle method
    oran(0.7)  katsaysı ile  toplamTuketim çarparak fatura değeri atayan odenecekTutar method

    Müsteri Class: fields: name ElektrikHesabi class obj.
    Runner Class obj ile enz 2  aylık elektrik tüketim faturası print eden code create ediniz
     */

    public static void main(String[] args) {
        Musteri obj=new Musteri();
        obj.name="Sema hanim";
        ElektrikHesabi hesap=new ElektrikHesabi();
        obj.elektrikHesabi=hesap;
        obj.elektrikHesabi.tuketimEkle(100);
        obj.elektrikHesabi.tuketimEkle(150);
        System.out.println("Toplam tuketim : "+obj.elektrikHesabi.toplamTuketim);
        System.out.println("Odenecek miktar : "+obj.elektrikHesabi.odenecekTutar());//1.yontem
        System.out.println("Odenecek miktar 2: "+obj.elektrikHesabi.fatura);//2.yontem
        System.out.println("obj = " + obj);

        Musteri obj2=new Musteri();
        obj2.name="Savfet bey";
        obj2.elektrikHesabi=new ElektrikHesabi();
        obj2.elektrikHesabi.tuketimEkle(250);
        obj2.elektrikHesabi.tuketimEkle(200);
        obj2.elektrikHesabi.odenecekTutar();
        System.out.println("obj2 = " + obj2);

    }


}
