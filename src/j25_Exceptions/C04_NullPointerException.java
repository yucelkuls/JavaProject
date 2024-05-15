package j25_Exceptions;

public class C04_NullPointerException {
    public static void main(String[] args) {
        // NullPointerException -> null ataması yapılan bir String variable length() meth call edildiğinde oluşan RTE
        String str1="";
        System.out.println("str1.length() = " + str1.length());
        String str2=null;
        //System.out.println("str2.length() = " + str2.length()); //NullPointerException->RTE
        try {
            System.out.println("str2.length() = " + str2.length()); // RTE exc firlatir, alt satira inmeden catch blok calisir
            System.out.println("Try blok sorunsuz calisti");
        }catch (NullPointerException e){
            System.out.println("Try blok exc firlatti");
            System.out.println("Catch blok calisti");
        }
        System.out.println("*******************************");
        try {
            System.out.println("str1.length() = " + str1.length()); // RTE exc firlatmaz, alt satira iner, catch blok calismaz
            System.out.println("Try blok sorunsuz calisti");
        }catch (NullPointerException e){
            System.out.println("Try blok exc firlatti");
            System.out.println("Catch blok calisti");
        }
        System.out.println("Bu mesaji okuyorsan app sorunsuz calisti");
    }
}
