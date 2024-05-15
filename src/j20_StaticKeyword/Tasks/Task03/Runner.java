package j20_StaticKeyword.Tasks.Task03;

import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
    /*
    Task 03 ->
    Lesson Class :  fields : name, credit (1-10 arasında değer almalı)
    Student Class : fields : name, maxCredit, dersleri(Lesson class obj) saklayacak list.
                   derslerin toplam kredi miktarını return eden  toplamKredisi method
    Runner Class :  3 adet  ders ve 1 adet öğrc (maxCredit=10) obj create ederek öğrencinin
    alabileceği ve alamayacagı dersleri print eden code create ediniz
     */
    public static void main(String[] args) {
        Student s1 = new Student("John Nash", 10);

        Lesson les1 = new Lesson("Math", 4);
        Lesson les2 = new Lesson("Science", 3);
        Lesson les3 = new Lesson("History", 6);
        Lesson les4 = new Lesson("Chemistry", 3);


        s1.availableLessons(les1);
        s1.availableLessons(les2);
        s1.availableLessons(les3);
        s1.availableLessons(les4);

        System.out.println("s1.toplamKredisi() = " + s1.toplamKredisi());
    }

}
