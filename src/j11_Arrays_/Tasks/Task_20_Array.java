package j11_Arrays_.Tasks;

import java.util.Arrays;

public class Task_20_Array {
    public static void main(String[] args) {
        /*
    task->
      Tek bir String içerisinde verilen euro ve dolarların ayrı ayrı toplamlarıni print eden METHOD create ediniz

       [$1 $12 €34 €56 $45 €78]
        dolarToplami: 58
        euroToplami: 168
       */
        String str = "$1 $12 €34 €56 $45 €78";
        paraToplam(str);
    }
    public static void paraToplam(String para){
        String [] arr = para.split(" ");
        System.out.println(Arrays.toString(arr));
        int dollarToplam = 0;
        int euroToplam = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i].contains("$")){
                dollarToplam += Integer.parseInt(arr[i].replace("$", ""));
            } else if (arr[i].contains("€")) {
                euroToplam += Integer.parseInt(arr[i].replace("€", ""));
            }
        }
        System.out.println("dolarToplami = "+dollarToplam);
        System.out.println("euro toplami = "+euroToplam);
    }
}
