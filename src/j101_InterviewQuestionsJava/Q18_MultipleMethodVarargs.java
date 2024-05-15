package j101_InterviewQuestionsJava;

public class Q18_MultipleMethodVarargs {
    /* Task->
	farklı 4 öğrencinin sırasıyla 6,4,3 ve 5 yazılı notlarının ortalamasını
	print eden  parametreli method create ediniz.
 */
    public static void main(String[] args) {

        notHesapla("Yucel", 85,77,66,83,51,61);
        notHesapla("Sema", 97);
        notHesapla("Saim", 90,53,87);
        notHesapla("Safvet", 91,87,56,43,71);

    }//main sonu

    private static void notHesapla(String str, double... notes) {
        double toplam = 0;
        for(double avuc:notes){
            toplam += avuc;
        }
        System.out.println(str + " notlarinin ortalaması : " + Math.round(toplam/notes.length));
    }


}//Class sonu
