package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task03 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //task-> girilen Saati saniyeye mil'i km'ye kg'yi gr'a çeviren METHOD create ediniz.
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter the birim -> hour / mile / kg");
//        String birim = scanner.next().toLowerCase();
//        System.out.println("Please enter the birim value");
//        double miktar = scanner.nextDouble();
        converter(birimVer(), miktarVer());

    }//main sonu

    private static void converter(String birim, double miktar) {

        switch (birim){

            case "hour":
                hourSecond(miktar);// System.out.println(miktar * 3600);
                break;
            case "mile":
                mileKm(miktar);//System.out.println(miktar * 1.609);
                break;
            case "kg":
                kgGram(miktar);//System.out.println(miktar * 1000);
                break;
            default:
                System.out.println("Invalid entry");
        }
    }

    private static void kgGram(double miktar) {
        System.out.println(miktar * 1000);
    }

    private static void mileKm(double miktar) {
        System.out.println(miktar * 1.609);
    }

    private static void hourSecond(double miktar) {
        System.out.println(miktar * 3600);
    }
    public static String birimVer(){
        System.out.println("Please enter the birim -> hour / mile / kg");
        String birim = scanner.next().toLowerCase();
        return birim;
    }
    public static double miktarVer(){
        System.out.println("Please enter the birim value");
        double miktar = scanner.nextDouble();
        return miktar;
    }

}// Class sonu
