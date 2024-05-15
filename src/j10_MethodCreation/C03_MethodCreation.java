package j10_MethodCreation;

import static j10_MethodCreation.C03_MethodDepo.gecmeNotu;

public class C03_MethodCreation {
    public static void main(String[] args) {
        String hlt = "en hakiki javaci";
        String sema = "javaNAZZZ";
        sayHello(); //tanimlandigi class scope ta method name ile direkt call edilebilir.
        System.out.println("hlt = " + hlt);
        System.out.println("sema = " + sema);
        /*
        Farkli calss lardan method call etmek icin className.methodName ile yada
        class import edilerek call islemi yapilir.
        static method olarak call edilir.
        Ayni class da method dogrudan name ile call edilir.
         */

        C03_MethodDepo.gecmeNotu(88);
        gecmeNotu(43);
    }
    private static void sayHello() {
        System.out.println("Hello");
        gecmeNotu(55);  // main disi ama method icine call edilir
    }
//    gecmeNotu(66);  j26_Abstract.Main disina method disina call edilemez. -> CTE

}
