package j02_Data_Types_WrapperClass;

public class C01_VariableCreate {
    /*Variable
    bellekte (memory) ayrilmis olan alanin (reserved area) adidir.
    Variable icinde deger saklayan bir container'dir
    bir variable oluştururken içerisine koyacağimiz datanın değer alabileceği değerlere uygun bir data türü seçmeliyiz
    örneğin bir okulun öğrenci sayısı için variable data türü String,boolean,char veya double alınmamalı.
    geriye kalan tamsayı  turlerınden okulun öğrenci sayısını içine alabilecek büyüklükte bir data turu secilir
    *** genelde tam sayılar için int ondalıklı sayılar için double kullınılır..
*/

    public static void main(String[] args) {

        int canAge = 25;
        int salary = 5000;
        double height = 1.85;
        float weight = 70.5f;
        boolean isMarried = true;
        char gender = 'M';

        System.out.println(canAge);
        System.out.println(salary);
        System.out.println(height);
        System.out.println(isMarried);
        System.out.println(gender);
        System.out.println(weight);
        int gunluk=550, weight2=100, experience=5;

        System.out.println("gunluk = "+gunluk+ " weight2 = "+weight2 + " experience = "+experience);



    }
}
