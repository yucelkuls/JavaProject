package j24_Inheritance.Task02;

public class SubClass extends SuperClass {
    int sayi = 17;

    public String ebikGabik(){
        return "Agam SubClass'dan selam dewamkeee. ";
    }

    public void javaCan(){
        System.out.println(ebikGabik());
        System.out.println(super.ebikGabik());
        System.out.println("SubClasstaki sayi = " + sayi);
        System.out.println("superClasstaki sayi = " + super.sayi);
    }

}//Class sonu
