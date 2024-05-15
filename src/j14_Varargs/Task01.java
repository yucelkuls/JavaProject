package j14_Varargs;

public class Task01 {
    public static void main(String[] args) {
        /*
Task -> verilen Stringleri birlestiren concat isimli METHOD create ediniz.

input : "h", "a", "l", "u", "k";
output : haluk

input : "a", "l", "i";
output : ali

 */
        String[] arr = {"D", "o", "g", "u", "k", "a", "n"};
        concat("h", "a", "l", "u", "k");
        concat("a", "l", "i");
        concat(arr);
    }

    private static void concat(String... str) {
        String yeniStr = "";
        for(String w: str){
//            yeniStr += w;
            yeniStr = yeniStr.concat(w);
        }
        System.out.println(yeniStr);
    }
}
