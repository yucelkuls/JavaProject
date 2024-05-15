package j07_StringManipulation;

import java.util.Arrays;

public class StringClassMethods {
    public static void main(String[] args) {


        System.out.println("Java String Sınıfı Metotları!");

        // charAt(): Belirtilen indisteki (konum) karakteri verir. char döndürür
        String myStr = "Hello";
        char result1 = ((String) myStr).charAt(0);
        System.out.println(result1);

        // codePointAt(): Belirtilen indisteki karakterin Unicode'unu verir. int döndürür.
        int result2 = ((String) myStr).codePointAt(0);
        System.out.println(result2);

        // codePointBefore(): Belirtilen indisteki önceki karakterin Unicode'unu verir. int döndürür.
        int result3 = ((String) myStr).codePointBefore(1);
        System.out.println(result3);

        // codePointCount(): Bu dizenin belirtilen metin aralığındaki Unicode'u döndürür. int döndürür.
        int result4 = ((String) myStr).codePointCount(0, 5);
        System.out.println(result4);

        // compareTo(): İki dizeyi sözlükbilimsel olarak karşılaştırır. int döndürür.
        String myStr1 = "Hello";
        String myStr2 = "Hello";
        System.out.println(((String) myStr1).compareTo(myStr2)); // Returns 0 because they are equal

        // concat(): Başka bir String'in sonuna bir karakter ekler. String döndürür.
        String firstName = "Hivel ";
        String lastName = "K";
        System.out.println(((String) firstName).concat(lastName));

        // contains(): Bir dizenin bir dizi karakter içerip içermediğini kontrol eder. boolean döndürür.
        String myStr3 = "Hello";
        System.out.println(((String) myStr3).contains("Hel"));   // true
        System.out.println(((String) myStr3).contains("e"));     // true
        System.out.println(((String) myStr3).contains("Hi"));    // false

// contentEquals(): Bir dizenin, belirtilen aynı karakter dizisini içerip içermediğini kontrol eder. boolean döndürür.

        String myStr5 = "Hello";
        System.out.println(((String) myStr5).contentEquals("Hello"));  // true
        System.out.println(((String) myStr5).contentEquals("e"));      // false
        System.out.println(((String) myStr5).contentEquals("Hi"));     // false

        // endsWith(): Bir dizenin belirtilen karakter (ler) ile bitip bitmediğini kontrol eder. boolean döndürür.
        String myStr6 = "Hello";
        System.out.println(((String) myStr6).endsWith("Hel"));   // false
        System.out.println(((String) myStr6).endsWith("llo"));   // true
        System.out.println(((String) myStr6).endsWith("o"));     // true

        // equals(): İki dizgiyi karşılaştırır. Dizeler eşitse doğru, değilse yanlış döndürür. boolean döndürür.
        String myStr7 = "Hello";
        String myStr8 = "Hello";
        String myStr9 = "Another String";
        System.out.println(myStr7.equals(myStr8)); // Returns true because they are equal
        System.out.println(myStr7.equals(myStr9)); // false

        // equalsIgnoreCase(): Büyük / küçük harfe ilişkin hususları göz ardı ederek iki dizeyi karşılaştırır. boolean döndürür.
        String myStr10 = "Hello";
        String myStr11 = "HELLO";
        String myStr12 = "Another String";
        System.out.println(((String) myStr10).equalsIgnoreCase(myStr11)); // true
        System.out.println(((String) myStr10).equalsIgnoreCase(myStr12)); // false

        // hashCode(): Bir dizenin karma kodunu verir. int döndürür.
        String myStr13 = "Hello";
        System.out.println(myStr13.hashCode());

        // indexOf(): Bir dizede belirtilen karakterlerin ilk bulunan oluşumunun konumunu verir. int döndürür.
        String myStr14 = "Hello planet earth, you are a great planet.";
        System.out.println(((String) myStr14).indexOf("planet"));


        // isEmpty(): Bir dizenin boş olup olmadığını kontrol eder. boolean döndürür.
        String myStr15 = "Hello";
        String myStr16 = "";
        System.out.println(myStr15.isEmpty());
        System.out.println(myStr16.isEmpty());


        // lastIndexOf(): Bir dizede belirtilen karakterlerin son bulunan oluşumunun konumunu verir. int döndürür.
        String myStr17 = "Hello planet earth, you are a great planet.";
        System.out.println(myStr17.lastIndexOf("planet"));

        // length(): Belirtilen bir dizenin uzunluğunu verir. int döndürür.
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(txt.length());

        // replace(): Belirli bir değer için bir dize arar ve belirtilen değerlerin değiştirildiği yeni bir dize döndürür. String döndürür.
        String myStr18 = "Hello";
        System.out.println(myStr18.replace('l', 'p'));

        // startsWith()	Bir dizenin belirtilen karakterlerle başlayıp başlamadığını kontrol eder. boolean döndürür.
        String myStr19 = "Hello";
        System.out.println(myStr19.startsWith("Hel"));   // true
        System.out.println(myStr19.startsWith("llo"));   // false
        System.out.println(myStr19.startsWith("o"));     // false

        // // toLowerCase(): Bir dizeyi küçük harflere dönüştürür. String döndürür.
        String txt1 = "Hello World";
        System.out.println(txt1.toUpperCase());
        System.out.println(txt1.toLowerCase());

        // toUpperCase(): Bir dizeyi büyük harflere dönüştürür. String döndürür.
        String txt2 = "Hello WorldI";
        System.out.println(txt2.toUpperCase());
        System.out.println(txt2.toLowerCase());

        // trim(): Bir dizenin her iki ucundaki boşluğu kaldırır. String döndürür.
        String myStr20 = "       Hello World!       ";
        System.out.println(myStr20);
        System.out.println(myStr20.trim());


        // copyValueOf(): Karakter dizisinin karakterlerini temsil eden bir Dizi döndürür. String döndürür.
        char[] myStr21 = {'H', 'e', 'l', 'l', 'o'};
        String myStr22 = "";
        myStr22 = myStr22.copyValueOf(myStr21, 0, 5);
        System.out.println("Returned String: " + myStr22); // Sonuc: Returned String: Hello

        // getChars(): Karakterleri bir dizeden bir karakter dizisine kopyalar.	void döndürür.
        String str23 = "Welcome! to GeeksforGeeks";

        char[] destArray = new char[20];
        try {
            str23.getChars(12, 25, destArray, 0);
            System.out.println(destArray); // Sonuc: GeeksforGeeks
        } catch (
                Exception ex) {
            System.out.println(ex);
        }

        // matches(): Normal bir ifadeye karşı bir eşleşme için bir dize arar ve eşleşmeleri döndürür. boolean döndürür.
        String Str24 = new String("Welcome to geeksforgeeks");

        // Initializing test string
        String Str25 = new String("GEEKS");

        // Tests whether GEEKS starts in geeksforgeeks
        // starting from pos 11 and
        // compares 5 characters of GEEKS
        System.out.print("Checking if GEEKS is in geeksforgeeks( case sensitive ) : ");
        System.out.println(Str24.regionMatches(11, Str25, 0, 5)); // Sonuc: (case sensitive) : false

// offsetByCodePoints(): CodePointOffset kod noktaları tarafından verilen dizinden uzak olan bu Dize içindeki dizini döndürür. int döndürür.

        // 1. Örnek
        String strNew = "Merhaba dünya!";
        int startIndex = 0; // Başlangıç indeksi
        int codePointOffset = 3; // İleri gitmek istenen karakter sayısı
        int newIndex = strNew.offsetByCodePoints(startIndex, codePointOffset);

        System.out.println("Başlangıç indeksi: " + startIndex); // 0
        System.out.println("İleri gitmek istenen karakter sayısı: " + codePointOffset); // 3
        System.out.println("Yeni indeks: " + newIndex); // 3
        char c = strNew.charAt(newIndex);
        System.out.println("Yeni karakter: " + c); // h

        // 2. Örnek

        String strNew1 = "Hello, World";
        int offset = strNew1.offsetByCodePoints(2, 3); // "llo, W" stringindeki 5. karakterin indexi (0'dan başlayarak)
        System.out.println(offset); // 5
        char c1 = strNew1.charAt(offset);
        System.out.println("Yeni karakter: " + c1); // ,

        // 3. Örnek
        String strNew2 = "Java is awesome!";
        int offset2 = strNew2.offsetByCodePoints(5, -1); // "is" kelimesinin ilk karakterinin indexi (0'dan başlayarak)
        System.out.println(offset2); // 4


// regionMatches(): İki dizi bölgesinin eşit olup olmadığını test eder. boolean döndürür.

// replaceFirst(): Verilen normal ifadeyle eşleşen bir alt dizenin ilk oluşumunu verilen değiştirmeyle değiştirir. String döndürür.

// replaceAll(): Verilen normal ifadeyle eşleşen bu dizenin her bir alt dizesini verilen değiştirmeyle değiştirir. String döndürür.

        // split(): Bir dizeyi bir alt dizeye böler. String[] döndürür.
        String isim = "Ayse, Fatma, Hayriye";
        String[] isimler = isim.split(",");
        System.out.println("Arrays.toString(isimler) = " + Arrays.toString(isimler));//[Ayse,  Fatma,  Hayriye]


// subSequence(): Bu dizinin bir alt dizisi olan yeni bir karakter dizisi verir. CharSequence döndürür.

// substring(): Karakterleri bir dizeden, belirtilen bir başlangıç konumundan başlayarak ve belirtilen karakter sayısıyla ayıklar. String döndürür.

        String sehirler = "Ankara, Antalya, Mersin";
        String x = sehirler.substring(0, 6);
        System.out.println("x = " + x);//x = Ankara

// toCharArray(): Bu iodize yeni bir karakter dizisine dönüştürür. char[] döndürür.

        String str = "Merhaba dünya!";
        char[] charArray = str.toCharArray();
        System.out.println("Arrays.toString(charArray) = " + Arrays.toString(charArray)); // [M, e, r, h, a, b, a,  , d, ü, n, y, a, !]

        for (
                char each : charArray) {
            System.out.print(each + " "); // M e r h a b a   d ü n y a !
        }

// valueOf(): Bir String nesnesinin ilkel değerini verir. String döndürür.

        // regionMatches(): İki dizi bölgesinin eşit olup olmadığını test eder. boolean döndürür.
        String str1 = "Merhaba, Dünya!";
        String str2 = "merhaba, dünya!";

        // Başlangıç pozisyonu, karşılaştırılacak dizeler ve
        // Başlangıç dizininden itibaren kaç karakter karşılaştırılacağı
        boolean result = str1.regionMatches(true, 0, str2, 0, 8);

        if (result) {
            System.out.println("İki dize de aynı karakterleri içeriyor.");
        } else {
            System.out.println("İki dize aynı karakterleri içermiyor.");

        }
    }
}
