package j25_Exceptions;

public class C12_Errors {
    public static void main(String[] args) {
        // System.out.println(20/0);// RTE->ArithmeticException : unchecked excp
        // String  str="Haluk;// CTE -> checked excp.
        // Error ->handle dilemeyen checked,  code ile çözülemeyen sistem kaynaklı(donanım hard ware pc mimari)
        // buyuk hatalardır. öngörülemez ancak gerçekleştiğinde stop axecution yapar app. durur
        String str="";
        for (int i = 0; i < 1000; i--) {
            str.concat(String.valueOf(i));
            System.out.println(str);
        }
    }
}
