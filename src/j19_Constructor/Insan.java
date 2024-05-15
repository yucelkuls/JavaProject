package j19_Constructor;

public class Insan {  // Class level

    String name = "Adam";
    int age;
    String nameOfFather = "Mr. Adam";
    char gender = 'M';

     // Trick -> Class da parametreli bir const olustugu an
    // javanin olusturdugu default const ezilir.
    //Istenirse parametresiz const manuel olarak create edilir

    public Insan(String name, int age, String nameOfFather, char gender) {  // full parameter telescopic const
        this.name = name;
        this.age = age;
        this.nameOfFather = nameOfFather;
        this.gender = gender;
    }

    public Insan(String name, String nameOfFather) {    // 2 parameter const
        this.name = name;
        this.nameOfFather = nameOfFather;

    }

    public Insan(String name, int age) {   // 2 parameter const

        this.name = name;
    }

    public Insan() {

    }

    public static void main(String[] args) {  // main level

        Insan insan1 = new Insan();
        Insan insan2 = new Insan("Sema", 27);
        Insan insan3 = new Insan("Safvet", "Muzaffer");
        Insan insan4 = new Insan("Dogukan", 39, "Mehmet", 'E');

        System.out.println("insan1 = " + insan1.name); // default deger geldi
        System.out.println(insan4.name+" "+ insan4.age+" "+insan4.nameOfFather+" "+insan4.gender); // Dogukan 39 Mehmet E


    }  // end of main
} // end of Class
