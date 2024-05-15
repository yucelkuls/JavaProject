package j02_Data_Types_WrapperClass;

public class C02_DataTypes {
    /*
             Java'da  2 farkli data type tanımlanır.
             1)Primitive Data Type (8 tane)
               a)boolean: Sadece True veya False değerlerini alabilir. sadece iki farkli deger alabildigi icin memory'de az(bir bit'lik) alan kaplar
               b)char :Tek character'li (S, ?, 3, * gibi her bir sembol) ifadeler icin char data type'i kullanilir.
                    her bir char memory'de 16 bit'lik yer kaplar.char deger mutlaka tek tirnak icine konulmalıdilir.
                    char değerler aritmetik islemler için charlarin ASCII ("American Standard Code for Information Interchange") Table'daki degerlerini alır.
               c)byte : -128'den +127 ye kadar tum tam sayi degerlerini alır.
                    byte variable -> memory'de 8 bitlik alan kaplar.
               d)short : -32768'den 32767'ye kadar tum tam sayi degerlerini alır.
                    short variable -> memory'de 16 bıt alan kaplar.
               e)int : -2,147,483,648'den 2,147,483,647'ye kadar tum tam sayi degerlerini alır.
                    int variable -> memory'de 32 bit alan kaplar.
               f)long : -9,223,372,036,854,755,808'den 9,223,372,036,854,755,807'ye kadar tum tam sayi degerlerini alır.
                    long variable -> memory'de 64 bit alan kaplar.
               g)float : ondalikli sayilar icin kullanilır.
                    float variable -> memory'de 32 bit kullanir.
                    float variable -> ondalik kisimlarinda en fazla 7 rakam barindirabilir.
                    0.1234567
                    Bir ondalikli sayinin float oldugunu belirlemek icin en sona(1.23f veya 1.23F) 'f' veya 'F' yazılmalıdır aksi halde variable double olarak tanımlanır.
               h)double : ondalikli sayilar icin kullanılır.
                    double variable -> memory'de 64 bit kullanir.
                    double variable -> ondalik kisimlarinda en fazla 16 rakam barindirabilirler.
                    0.1234567890123456
             2)Non-Primitive Data Type
                String: Cift tirnak arasina yazilan sifir veya daha fazla character'lerden olusan variable.
             */
            /*
        1)Java'da iki turlu "memory" vardır.
            i)Stack Memory: -> gömlek cebi
                a)Kucuk memory'dir
                b)Primitve ve Non-Primitive'lerin adreslerini(Reference) icerir
           ii)Heap Memory: -> cüzdan
                a)Buyuk Memory'dir
                b)Non-Primitive'leri icerir
        2)Java Heap Memory'ye yerlestirilen her non-primitve data icin bir address(Reference) olusturur ve bu adresi(Reference)
         Stack Memory'yde depolanır. Herhangi bir sebeple address(Reference) silinirse Java adresi(Reference) olmayan Heap deki
         non-primitive data yi otomatik siler.  Memory'nin temizligini saglayan "Garbage Collector" çalışır.
     */
        /*
        PRIMITIVE DATA TYPE - NON-PRIMITIVE  DATA TYPE  FARKLARI...
        1)primitive'de tum harfler kucuk; non-primitive'de ilk harf buyuk kullanılır.
        2)primitive data typelarini Java olusturmustur, biz primitive data typelarini olusturamayiz.
        ama non-primitive data type larini Java programcilari tarafindan istenildigi kadar olusturulabilir.
        3)primitive data typelarin memoryde kapladigi yer degisirken; non-primitivelerin memoryde kapladigi yer hep aynidir
        4)primitive data typelarinin memoryde ayirdigi alanda sadece o primitive datanin degeri vardir.
        non-primitive'lerde ise degeri ve methodlari vardir.
        5)primitive 'ler renklenirken mavi renklenirken ; non-primitiveler renklenmez.Or: String siyah kalir
     */
    public static void main(String[] args) {
        //hap bilgi-> bir varibleye deger atamasi yapilirken data type uygun deger atanmali
        // aksi takdirde CTE hatasi aliriz.

        String name = "Can Yucel";
        String unvan = "Team Lead";
        // String sene = 22; CTE data type hatasi aliriz.

        double maas = 40000;
        // double maas1 = "30000"; // CTE data type hatasi aliriz.
        boolean acemi = true;
        // boolean emekli = "true"; // CTE data type hatasi aliriz.
        char ch1 = '$';
        // char ch2 = '';  // CTE data type hatasi aliriz. Bos olamaz
        char ch3 = ' ';  // Space 1 bosluk kabul eder.

        // Task-> 1999 yılında doğan kisinin yasını print eden code create ediniz...

        int dogum = 1999;
        int yas;
        int sene = 2024;
        yas = sene - dogum;


        System.out.println("Yas = " +yas);

        //Task -> iki farklı tamsayı türünde sayı  tanımlayıp toplam farkını print ediniz

        int sayi1 = 10 ;
        short sayi2 = 20;  //tamsayi turunde int, short, long, byte

        System.out.println(sayi1 + sayi2);
        System.out.println(sayi1 - sayi2);


        //Task -> tamsayı ve ondalıklı sayı tanımlayıp toplam  print ediniz

        int myNumber = 10;
        float myNumber1 = 10.0f;  //ondalikli turler; double ve float.

        System.out.println(myNumber + myNumber1);


        //Task -> tamsayı ve char data type iki variable  tanımlayıp toplam  print ediniz.

        int myNumber2 = 10;
        char myChar = 'a';

        System.out.println(myNumber2 + myChar);

        // Task -> ad ve soyadınızı ve yasınızı print ediniz.

        String myName = "Can";
        String surname = "Yucel";
        int age = 39;

        System.out.println(myName + " " + surname + " " + age);




    }
}
