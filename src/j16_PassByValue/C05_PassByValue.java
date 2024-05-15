package j16_PassByValue;

public class C05_PassByValue {
    public static void main(String[] args) {
        /*
        eger bir method'a yapılan değişiklik kalıcı olsun istenirse
        2 .değişklik  yapılan variable'lar atama tanımlanır.
        */
        double priceTag = 100;
        double rateOfDiscount = 0.1;
        System.out.println("Price tag before discount : " + priceTag); // 100.0
        priceTag = discount(priceTag, rateOfDiscount);  // assignment
        System.out.println("Price tag after discount : " + priceTag); // 90.0
    }

    private static double discount(double priceTag, double rateOfDiscount) {
        return priceTag * (1 - rateOfDiscount);
    }
}
