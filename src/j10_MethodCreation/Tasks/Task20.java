package j10_MethodCreation.Tasks;

import java.util.Arrays;

public class Task20 {
    /*
    task->
      Tek bir String içerisinde verilen euro ve dolarların ayrı ayrı toplamlarıni print eden METHOD create ediniz

       [$1 $12 €34 €56 $45 €78]
        dolarToplami: 58
        euroToplami: 168
       */

    public static void main(String[] args) {

        String para = "$1 $12 €34 €56 $45 €78";
        euroSum(para);
        dollarSum(para);
        paraToplam(para);
    }

    private static void paraToplam(String para) {
        String arr[]=para.split(" ");
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        int dolarToplam=0;
        int euroToplam=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("$")){
                dolarToplam+=Integer.parseInt(arr[i].replace("$",""));
            }else {
                euroToplam+=Integer.parseInt(arr[i].replace("€",""));
            }
        }
        System.out.println("euroToplam = " + euroToplam);
        System.out.println("dolarToplam = " + dolarToplam);
    }

    private static void euroSum(String para) {
        int sum = 0;
        for (int i = 0; i < para.length(); i++) {
            if (para.charAt(i) == '€') {
                for (int j = i + 1; j < para.length(); j++) {
                    if (para.charAt(j) == ' ' && para.charAt(i) == '€') {
                        sum += Integer.parseInt(para.substring(i + 1, j));
                        break;
                    } else if(para.charAt(i) == '€' && para.length()-1==j){
                        sum += Integer.parseInt(para.substring(i + 1));
                        break;
                    }
                }
            }
        }
        System.out.println("Euro total: " + sum);
    }
    private static void dollarSum(String para) {
        int sum = 0;
        for (int i = 0; i < para.length(); i++) {
            if (para.charAt(i) == '$') {
                for (int j = i + 1; j < para.length(); j++) {
                    if (para.charAt(j) == ' ' && para.charAt(i) == '$') {
                        sum += Integer.parseInt(para.substring(i + 1, j));
                        break;
                    } else if(para.charAt(i) == '$' && para.length()-1==j){
                        sum += Integer.parseInt(para.substring(i + 1));
                        break;
                    }
                }
            }
        }
        System.out.println("Dollar total: " + sum);
    }
}
