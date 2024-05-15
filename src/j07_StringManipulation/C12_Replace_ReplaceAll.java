package j07_StringManipulation;

public class C12_Replace_ReplaceAll {
    public static void main(String[] args) {
        /* replace()
         * Metin icerisindeki karakter ya da bir parcasinin, istenilen karakter ya da metinle degistirilmesini
         * (update -set) saglar. Sonuc String'dir..
         */
        String str = "madem geldin dunyaya calis JAVA'ya";
        System.out.println("str = " + str);
        System.out.println("str.replace(\"a\", \"*\") = " + str.replace("a", "*")); // m*dem geldin duny*y* c*lis JAVA'y*
        System.out.println("str.replace(\"yaya\", \"$\") = " + str.replace("yaya", "$")); //madem geldin dun$ calis JAVA'ya
        System.out.println("str.replace(\"ya ca\", \"*\") = " + str.replace("ya ca", "*")); // madem geldin dunya*lis JAVA'ya

        // replaceAll() method u replace() methoduna benzer ama 2 fark vardır
//1-replace() methodu char kabul eder ama replaceAll kabul etmez
//2-replaceAll() method u regex kullanımına izin verir (Regular Expressions)
//(Regular Expressions)
//   \\s bosluk
//   \\S bosluk disindaki tum karakterler
//   \\w harfler ve rakamlar (a z A Z, 0 9)
//   \\W harfler ve rakamlar disindaki tum karakterler
//   \\d rakamlar 0 9
//   \\D rakamlar disindaki tum karakterler

        str = "javaCAN'lara selam olsun 1234567 $ # @ 5 %    :)";
        System.out.println("str = " + str);
        System.out.println("str.replaceAll(\"\\\\s\", \"*\") = " + str.replaceAll("\\s", "*"));
        System.out.println("str.replaceAll(\"\\\\S\", \"*\") = " + str.replaceAll("\\S", "*"));
        System.out.println("str.replace(\"\\\\w\", \"*\") = " + str.replaceAll("\\w", "*"));
        System.out.println("str.replaceAll(\"\\\\D\", \"\") = " + str.replaceAll("\\D", ""));
        System.out.println("str.replaceAll(\"\\\\d\", \"*\") = " + str.replaceAll("\\d", "*"));


    }
}
