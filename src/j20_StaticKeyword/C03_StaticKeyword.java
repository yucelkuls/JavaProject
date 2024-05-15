package j20_StaticKeyword;

public class C03_StaticKeyword { // Class level
    int ogrId;   // instance variable
    static int ogrSayisi; // static class variable

    public C03_StaticKeyword() {  // p siz const.
        ogrSayisi++;  // bu const call edildiginde, static olarak artirilir.
        ogrId++; // her obje icin ozel bir deger alir.
    }
    public void hesap(){
        System.out.println("ogrId = " + ogrId);
        System.out.println("ogrSayisi = " + ogrSayisi);
    }

    public static void main(String[] args) {
        System.out.println("a objesi oncesi ogrencisayisi: " + ogrSayisi);  // 0
        C03_StaticKeyword a = new C03_StaticKeyword();
        System.out.println("a objesi sonrasi ogrencisayisi: " + ogrSayisi); // 1
        C03_StaticKeyword b = new C03_StaticKeyword();
        C03_StaticKeyword c = new C03_StaticKeyword();
        C03_StaticKeyword d = new C03_StaticKeyword();
        System.out.println("a,b,c,d objeleri sonrasi ogrencisayisi: " + ogrSayisi); // 4

        C03_StaticKeyword e;
        System.out.println("e objesi sonrasi ogrencisayisi: " + ogrSayisi); // 4
        System.out.println("a.ogrId = " + a.ogrId); // 1
        System.out.println("b.ogrId = " + b.ogrId); // 1
        System.out.println("c.ogrId = " + c.ogrId); // 1
        System.out.println("d.ogrId = " + d.ogrId); // 1
//        System.out.println("e.ogrId = " + e.ogrId);


    }
}
