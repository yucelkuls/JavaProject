package j31_Debugging;

public class C01_Debugger {
    /*
 Debug yapiyorsan, kodu anlamadin demektir.
 Debug yaparken kodu anlamiyorsan, nasil debug yapilir, onu anlamadin demektir.
 Debug yaparken kodu anladigini dusunuyorsan, aslinda debuga ihtiyacin olmadigini anladin demektir.
 Debug etmek kodun mental bir modelinin eksikligine isarettir...


 İki durumda debugger gerekli olabilir:
 *  Mevcut kod devralındığında.
 *  Yeni kod yazıldığında.
 her iki durumda da debugger çalıştırmamaya dikkat edilmeli.
 Amac sıfır debug aktivitesi ile uygulamayı istenilen seviyeye getirebilmek.
 */
    static int available = 7;
    public static void main(String[] args) {
        method01();//ev temizligi
    }
    private static void method01() {
        System.out.println("**** Method-01 calisiyor ***");
        available++;
        int a = 0; // local variable tanimlandi
        for (int i = 1; i <=10 ; i++) {
            System.out.print(i+" ");
            a+=2*i;
        }
        System.out.println();//dummy
        System.out.println("*** Method-02 call ediliyor ***");
        method02();//mutfak temizligi
        System.out.println("*** Method-03 call ediliyor ***");
        method03();//otuma odasi temizligi
        System.out.println("*** Method-01 bitti ****");
    }

    private static void method02() {
        System.out.println("**** Method-02 calisiyor ***");
        available+=5;
        for (int x = 0; x <=7; x++) {
            System.out.print(x+" ");
        }
        System.out.println();//dummy
        System.out.println("*** Method-02 bitti ****");
    }

    private static void method03() {
        System.out.println("**** Method-03 calisiyor ***");
        available-=3;
        for (int y = 0; y <=5 ; y++) {
            System.out.print(y+" ");
        }
        System.out.println();//dummy
        System.out.println("*** Method-03 bitti ****");
    }
}
