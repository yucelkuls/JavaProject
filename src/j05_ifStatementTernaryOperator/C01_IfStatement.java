package j05_ifStatementTernaryOperator;

public class C01_IfStatement {

    /*
    if statement blok herhangi bir actionun belirli bir şarta bağlı çalışmasını sağlamak için kullanılır.
    */

    public static void main(String[] args) {

        int semraYas = 16;
        int merveYas = 28;

        if (semraYas == merveYas) {

            System.out.println("Yastas arkadaslar");
            System.out.println("Yoksa siz ikiz misiniz?");
        }
        if (merveYas >= 40)  System.out.println("Merve hanim yasi 40 tan buyuk");

        // eger if blok tan sonra tek satirlik islem varsa suslu parantez gerek yok.

        if (merveYas + semraYas >= 45) System.out.println("Tek satirlik aksiyonlarda {} kullanilmaz");
        System.out.println("Selam");

        System.out.println("Bu ciktiyi goruyorsan kodlar calisiyordur.");



    }






}

