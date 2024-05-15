package j07_StringManipulation.Tasks;

public class Task03 {
    public static void main(String[] args) {
        // Task-> "Alamanya" Stringindeki ikinci 'a' caharacterinin indexini print eden code create ediniz


        String str = "Alamanya";
        System.out.println(str.indexOf('a',str.indexOf('a') + 1));
        // 1. 'a' karakteri 2.indexte, 2. 'a' karakteri 4.index'tedir.

    }
}