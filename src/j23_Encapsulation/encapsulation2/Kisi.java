package j23_Encapsulation.encapsulation2;

public class Kisi {
    /* task
Kisi pojo class için fields-> ad, soyad, password(String), yas
tum field'ları kullanıcı görebilmeli ve password haric update edebilmeli
(password encapsulated update edilmemeli.)
yas variable negatif değer girmeye karsı encapsulated

runner class'da obj ile field ları print eden code create ediniz
 */
    //1.step -> fileds
    private String ad;
    private String soyAd;
    private String password;
    private int yas;
    //2.step -> const

    public Kisi(String ad, String soyAd, String password, int yas) {
        this.ad = ad;
        this.soyAd = soyAd;
        this.password = password;
      //this.yas = Math.abs(yas);  //mutlak deger
        setYas(yas);
    }

    public Kisi() {
    }

    //3.step -> getter/setter

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public String getPassword() {
        return password;
    }

    /*
        public void setPassword(String password) {
            this.password = password;
        }
    */

    public int getYas() {

        return yas;
    }

    public void setYas(int yas) {

        this.yas = Math.abs(yas);
    }
    //4.step -> toString

    @Override
    public String toString() {
        return
               "ad='" + ad + '\'' +
               ", soyAd='" + soyAd + '\'' +
               ", password='" + password + '\'' +
               ", yas=" + yas;
    }
}
