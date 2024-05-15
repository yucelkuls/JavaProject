package j99_codeChallange.Challange05;

public class Task10 {
    /*
        Task-> java ifadesni j*a*v*a olarak print eden code create ediniz..
         */
    public static void main(String[] args) {

        String str ="";
        for (int i = 0; i < "java".length(); i++) {
            str += "java".charAt(i) + "*";
        }
        System.out.println(str.substring(0, str.length()-1));





    }
}
