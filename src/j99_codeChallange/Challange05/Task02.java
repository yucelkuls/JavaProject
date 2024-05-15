package j99_codeChallange.Challange05;

public class Task02 {
    //Interview Question
    // Task->0-255 e kadar olan sayıların karakter değerini print eden code create ediniz...

    public static void main(String[] args) {
        char c;
        System.out.println("   ***   for loop   ***   ");
        for (int i = 0; i <= 255; i++) {
            //char c = (char) i;//dönguden gelen herbir sayı değeri char larak atandı
            c = (char) i;
            System.out.println(i + " nin karakter değeri : " + c);
        }


        System.out.println("   ***   while loop   ***   ");
        int sayı = 0;
        while (sayı <= 255) {//durum döngü-> sayı 255den kucuk oluncaya kadar tekrar tanımlandı
            c = (char) sayı;
            System.out.println(sayı + " nin karakter değeri : " + c);
            sayı++;
        }


        System.out.println("   ***   do-while loop   ***   ");
        int a=0;
        do {
            c = (char) a;
            System.out.println(a + " nin karakter değeri : " + c);
            a++;
        }
        while (a <= 255);

    }//main sonu

}// class sonu
