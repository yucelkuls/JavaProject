package j20_StaticKeyword.Tasks.Task02;

public class Runner {
    /*
    Task 02 ->
    ElektirikHesap Class:  fields : toplamTuketim(int), oran(double),
    fatura(double)

    Müşteriye ait tüketilen enerjiyi toplamTuketim'e toplayan tüketimEkle
    method
    oran(0.7)  katsaysı ile  toplamTuketim çarparak fatura değeri
    atayan odenecekTutar method

    Müsteri Class: fields: name ElektrikHesabi class obj.
    Runner Class obj ile enz 2  aylık elektrik tüketim faturası print eden code create ediniz
     */
    public static void main(String[] args) {
        new Musteri("Mehmet", 2000,3000);
        new Musteri("ali", 1000,3000);
        new Musteri("cengiz", 2500,3000);
        new Musteri("hakan", 2700,3000);
    }
}