package j32_Enum.enum04;

public enum Aylar {
    //OCAK(31,"Kis","Semra hanim hayirli seneler"),
    OCAK(31),
    SUBAT(28),
    MART(31),
    NISAN(30),
    MAYIS(31),
    HAZIRAN(30),
    TEMMUZ(31),
    AGUSTOS(31),
    EYLUL(30),
    EKIM(31),
    KASIM(30),
    ARALIK(31);
    int gunSayisi;
    //Aylar(int gunSayisi,String mevsim,String birthday){}
    Aylar(int gunSayisi){
        this.gunSayisi=gunSayisi;
    }
    void gunMiktari(){
        System.out.println(gunSayisi);
    }
}
