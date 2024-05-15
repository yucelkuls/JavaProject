package j20_StaticKeyword.Tasks.Task02;

public class Musteri {
    String name;
    public Musteri(String name, int i1, int i2) {
        this.name = name;
//        ElektrikHesabi elkHesap = new ElektrikHesabi(name, i1, i2);
        new ElektrikHesabi(name, i1, i2);
    }
}