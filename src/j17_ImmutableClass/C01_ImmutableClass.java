package j17_ImmutableClass;

public class C01_ImmutableClass {
    public static void main(String[] args) {
        String str1="Sema";//Ilk deger initial atamasi Sema yapilmis str1 variable String type olustu
        String str2="Sema";//str1 ve str2 ayni ayni deger ile ilk atamasi yapildi icin StringPool'dan ayni referans ile olustu
        String str3=new String("Sema");//ilk deger atamasi Sema value ile yapildi heap memory'de(unique referans deger cerate edildi
        String str4=new String("Sema");//ilk deger atamasi Sema value ile yapildi heap memory'de(unique referans deger cerate edildi
        String str5=str3;
        System.out.println("str1==str2 = " + (str1 == str2));//T->ayni havuz ref
        System.out.println("str3==str5 = " + (str3 == str5));//T->ayni havuz ref
        System.out.println("str2==str3 = " + (str2 == str3));//F->farkli havuz ve obj. ref
        System.out.println("str1.equals(str2) = " + (str1.equals(str2)));//T->ayni value
        System.out.println("str3==str4 = " + (str3 == str4));//F->farkli obj ref
        System.out.println("str3.equals(str4) = " + (str3.equals(str4)));//T->ayni variable value
        System.out.println("str1==str5 = " + (str1 == str5));//F->farkli havuz ref
        System.out.println("str1.equals(str5) = " + (str1.equals(str5)));//T->ayni variable value


    }
}
