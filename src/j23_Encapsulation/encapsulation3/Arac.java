package j23_Encapsulation.encapsulation3;

public class Arac {
    /*
1- fieldları(encapsulated) model(String), renk(String), motor(int), yil (int)
   olan Araba  isimli bir class cretae ediniz.
2- bütün fieldları parametre alan bir constructor tanımlayınız.
3- Runner isminde main için bir class oluşturunuz.
4- İki adet parametreli const 1 adet parametresiz cons ile
    3 adet araba creat ediniz
5- aracların motor hacmi 1000 cc ve altı olması ve yılını
    hatalı veri girisine karsi kontrol ediniz.
  */

    //1.step
    private String model;
    private String renk;
    private int motor;
    private int yil;

    //2.step


    public Arac(String model, String renk, int motor, int yil) {
        this.model = model;
        this.renk = renk;
        //this.motor = motor;
        setMotor(motor);
        //this.yil = yil;
        setYil(yil);
    }

    public Arac() {
    }

    //3.step

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        if (motor < 1000){
            this.motor = 1000;
        }else this.motor = motor;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        if(yil < 1990){
            this.yil=yil;
            System.out.println("Take a taxi");
        }else this.yil = yil;
    }
    //4.step

    @Override
    public String toString() {
        return
               "model='" + model + '\'' +
               ", renk='" + renk + '\'' +
               ", motor=" + motor +
               ", yil=" + yil ;
    }
}
