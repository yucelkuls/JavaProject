package j25_Exceptions;

import java.util.Objects;
import java.util.Scanner;

public class C03_ClassCastingException {
    public static void main(String[] args) {
        //ClassCastingException-> Biribirine donusturulemeyen data type'lar donusturme isleminde olusan RTE
        Object obj = "JavaCan'lara selam";
        System.out.println("obj = " + obj);
        String str = (String) obj;
        System.out.println("str = " + str);
        Object num = 49;
//        String numStr = (String) num;
//        System.out.println("numStr = " + numStr);
        try {
            String numStr = (String) num;
            System.out.println("numStr = " + numStr);
            System.out.println("Bu mesaji okuyorsan try blok calisti.");

        }catch (ClassCastException e){
            System.out.println("Int data type String e donusturulemez");
            System.out.println("Catch blok calisti");
        }
        System.out.println("*******************************************");
        try {
            String str2 = (String) obj;
            System.out.println("numStr = " + str2);
            System.out.println("Bu mesaji okuyorsan try blok calisti.");

        }catch (ClassCastException e){
            System.out.println("Int data type String e donusturulemez");
            System.out.println("Catch blok calisti");
        }
        System.out.println("Eger bu mesaji okuyorsan app sorunsuz calisti.");

    }
}
