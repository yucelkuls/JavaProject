package j07_StringManipulation;

public class C01_Concatenation {
    public static void main(String[] args) {

        /*
        concat() -> methodu içinde parametre aldığı String variable'ı çaliştığı string sonuna ekler(birleştirir)
        Java '+' işleminde en az bir string ifade varsa artimetik toplama değil birleştirme yapılır.
 */
        String name = "Nikola";
        String surname = "Tesla";
        System.out.println(name + surname);
        System.out.println(name.concat(surname));



    }
}
