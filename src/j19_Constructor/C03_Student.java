package j19_Constructor;

public class C03_Student { // Class level
    String name;
    String surname;
    int className;
    double average;
    int number;
    boolean thanks;

    public C03_Student() {
    }

    @Override
    public String toString() {
        return
               "name='" + name + '\'' +
               ", surname='" + surname + '\'' +
               ", className=" + className +
               ", average=" + average +
               ", number=" + number +
               ", thanks=" + thanks;
    }

    public C03_Student(String name, String surname, int className, double average, int number, boolean thanks) {
        this.name = name;
        this.surname = surname;
        this.className = className;
        this.average = average;
        this.number = number;
        this.thanks = thanks;
    }

    public static void main(String[] args) { // main level
        /*
Task-> fields: ad, soyad, sınıf, ortalama, okulNo, takdirBelgesi olan 2 farklı obj ile
mezuniyet(ortalama 50 üstü ise mezun oldunuz) sosyalFaaliyet methodlarını  print eden code create ediniz.
 */
        C03_Student s1 = new C03_Student(); //p'siz const.s1 obj create edildi.
        s1.name = "John";
        s1.surname = "Deep";
        s1.number = 1453;
        s1.className = 12;
        s1.average = 85.0;
        s1.thanks = true;
        C03_Student s2 = new C03_Student("Leo", "Hoffman", 11,45.0,123,false);
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s2.graduation(s2.average) = " + s2.graduation(s2.average));
        System.out.println("s1.graduation(s1.average) = " + s1.graduation(s1.average));
        s1.hobby();
        s2.hobby();

    } // end of main

    private void hobby(){
        System.out.println("You are very social");
    }
    public String graduation(double avrg){
        return avrg > 50? "You graduated.":"You couldn't graduate.";
    }
} // end of Class
