package j33_Lambda;

import j26_Abstract.abstract01.Lastik;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q03 {
    public static void main(String[] args) {
/*
 Write a return method  that can find the unique characters from the String
 Ex:unique("AAAABBBCCCDEF")=>"DEF"
*/
        String str = "AAAABBBCCCDEF";
        System.out.println(unique(str));
    }

    private static String unique(String str) {
        if (str == null) return null;
        List<String> list = Arrays.asList(str.split(""));
        return list.stream()
                .map(t -> {
                    if (str.indexOf(t) == str.lastIndexOf(t)) return t;
                    else return null;
                }).filter(t -> t != null).collect(Collectors.joining(", "));

    }

}
