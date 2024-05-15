package j07_StringManipulation.Tasks;

public class Task08 {
    public static void main(String[] args) {
        /*  TASK :
   Asagidaki String degiskenini kullanarak  konsolda isminizi print eden code create ediniz.
   String  harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    */
        String harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.print("" + harfDepo.charAt(harfDepo.indexOf("Y")) +
                         harfDepo.charAt(harfDepo.indexOf("U")) +
                         harfDepo.charAt(harfDepo.indexOf("C")) +
                         harfDepo.charAt(harfDepo.indexOf("E")) +
                         harfDepo.charAt(harfDepo.indexOf("L")));


    }
}
