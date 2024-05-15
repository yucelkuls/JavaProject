package j25_Exceptions;

public class C05_NumberFormatException {
    public static void main(String[] args) {
        // NumberFormatException -> numerik formetta olmayan bir value parseInt() meth call edilirse oluşan RTE
        String str1="1234567";
        System.out.println("str1 = " + str1);//1234567
        System.out.println("str1+28 = " + (str1 + 28));//123456728
        int sayi=Integer.parseInt(str1);
        System.out.println("sayi = " + sayi);//1234567
        System.out.println("sayi+28 = " + (sayi + 28));//1234595
        String id="12345l678";
//        int invalidId=Integer.parseInt(id);//RTE->NumberFormatException
//        System.out.println("invalidId = " + invalidId);
        int invalidId;
        try {
            invalidId=Integer.parseInt(id);//RTE->NumberFormatException->catch blok run
            System.out.println("Bu mesaji okuyorsan try sorunsuz calisti");
        }catch (NumberFormatException e){
            id="123451678";
            invalidId=Integer.parseInt(id);
            System.out.println("Gercek id ="+invalidId);
            System.out.println("Bu mesaji okuyorsan try exc firlatti catch blok run oldu");
        }
        System.out.println("Bu mesaji okuyorsan app sorunsuz calisti");
    }
}
