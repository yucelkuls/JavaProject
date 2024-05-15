package j02_Data_Types_WrapperClass;

public class C04_WrapperClass {

    /*
       Note: Java primitive lere method'lar ekleyerek yeni bir
             yapi olusturdu, bu yapiya "Wrapper Class"
             Primitive         Wrapper
                byte     ==>    Byte
                short    ==>    Short
                ** int   ==>    Integer
                long     ==>    Long
                float    ==>    Float
                double   ==>    Double
                boolean  ==>    Boolean
                ** char  ==>    Character
    */

    public static void main(String[] args) {

        /*
        JAVA da bir degiskenin hangi data type oldugunu getClass() methodu ile bulunur.

         */
    String str = "JavaCAN";
    int yas = 45;
    double pi = 3.14;
        System.out.println(str.getClass());  // class java.lang.String

      //  System.out.println(yas.getClass());  // yas yani int primitive dir. Ona ait class yoktur.

        /*
        Integer.valueOf(yas) seklinde ilkel veri tiplerini Wrapper class a donusturulur
        ve getClass() methodu kullanilabilir.
         */

        String name = "Can";
        System.out.println(name.toUpperCase()); // CAN
        System.out.println(name.toLowerCase());  // can


        /*
        non-primitive data turleri data depolamak yaninda kullanışlı birçok method'a sahiptir
ancak primitive data turlerinin boyle bir ozelligi yoktur
primitive data turleri sadece degerleri saklarlar (container) ve hwerhangi bir özellik(method) vs bulundurmaz.
Ancak primitive data turleri icin de bazi işlemler için (String'den tamsayı çekme) method'lar ihtiyaç
olduğunda Java her bir primitive data turunu, non-primitive  Wrapper Class  oluşturarak ilgili methodlarla
ara çözüm imkanı sunmuştur.
         */

        // task-> id ve tc String değerlerini toplamını print code create ediniz..

        String id = "12345";
        String tc = "1234567";
        System.out.println(id+tc);  //123451234567

        Integer yeniID = Integer.valueOf(id);  //String olan id integere cevrildi.
        System.out.println("yeniID = " + yeniID);
        Integer yeniTc = Integer.valueOf(tc);  //String olan tc integere cevrildi.
        System.out.println("yeniTc = " + yeniTc);
        System.out.println("Toplam = "+(yeniID + yeniTc));  //123451234567

        String okulNo = "3435a";
    //  int yeniOkulNo = Integer.parseInt(okulNo);  //String olan okul no integere cevrildi. NumberFormat Exception
    //  System.out.println("yeniOkulNo = " + yeniOkulNo);



        // task-> byte short int data type max ve min değerlerini print eden code create ediniz.

        byte myByteMax = Byte.MAX_VALUE;
        byte myByteMin = Byte.MIN_VALUE;
        System.out.println("myByteMin = " + myByteMin);
        System.out.println("myByteMax = " + myByteMax);
        System.out.println("shortMaxValue = "+Short.MAX_VALUE);
        System.out.println("shortMinValue = "+Short.MIN_VALUE);
        System.out.println("intMaxValue = "+Integer.MAX_VALUE);
        System.out.println("intMinValue = "+Integer.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);




    }
}
