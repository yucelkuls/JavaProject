package j07_StringManipulation;

public class C09_Upper_LowerCase {
    public static void main(String[] args) {
        /*
        toUpperCase()-> verilen string'i tum harflerini BUYUK harfe çevirir.
        toLowerCase()-> verilen string'i tum harflerini kucuk harfe çevirir.
        ignoreCase()-> verilen string'i BUYUK-kucuk harf duyarlılığını kaldırır.
        */
        String str = "Madem Geldin Dunyaya Calis JAVA'ya";
        System.out.println("str = " + str); // Madem Geldin Dunyaya Calis JAVA'ya
        System.out.println("str.toUpperCase() = " + str.toUpperCase()); //MADEM GELDIN DUNYAYA CALIS JAVA'YA
        System.out.println("str.toLowerCase() = " + str.toLowerCase()); //madem geldin dunyaya calis java'ya
        System.out.println("str.toUpperCase().equals(str.toLowerCase()) = " + str.toUpperCase().equals(str.toLowerCase())); // false
        System.out.println("str = " + str); // Madem Geldin Dunyaya Calis JAVA'ya'




    }
}
