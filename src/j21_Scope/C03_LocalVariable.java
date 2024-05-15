package j21_Scope;

public class C03_LocalVariable {
    public static void main(String[] args) {
        int yas = 33; // main ici primitive local variable create edildi
        System.out.println("yas = " + yas);
        for (int i = 0; i < 10; i++) { // loop level
            System.out.println(yas + " "+ i); // main scope variable for icine yani loop level e call edilebilir.
            i+=3;
        }// loop sonu
//        i+=7; // i loop variable old. icin scope disina call edilemez  CTE
        yas = 49; // main scope variable call edildi ve atama yapildi.
    }  // main sonu

    // yas = 50;  CTE
}
