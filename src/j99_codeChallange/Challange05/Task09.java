package j99_codeChallange.Challange05;

public class Task09 {

    /*
    Task-> 11'den 120'ye kadar 4 ve 6 ya tam bölünebilen sayı adedini ve toplamlarını print eden code create ediniz.
     */
    public static void main(String[] args) {

        int divideNum = 0;
        int sum = 0;

        for (int i = 11; i <= 120; i++) {
            if (i % 12 == 0) {
                divideNum++;
                sum += i;
            }
        }
        System.out.println("divideNum = " + divideNum);
        System.out.println("sum = " + sum);
    }
}
