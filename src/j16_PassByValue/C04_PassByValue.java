package j16_PassByValue;

public class C04_PassByValue {
    static double priceTag;
    static double rateOfDiscount;
    public static void main(String[] args) {
        priceTag = 100;
        rateOfDiscount = 0.1;
        System.out.println("Price tag before discount : " + priceTag);
        discount();
        System.out.println("Price tag after discount : " + priceTag);


    }

    private static void discount() {
        priceTag *= (1 - rateOfDiscount);
        System.out.println("Discounted price tag : "+ priceTag);
    }
}
