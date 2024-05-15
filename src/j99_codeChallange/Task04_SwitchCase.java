package j99_codeChallange;

import java.util.Scanner;

public class Task04_SwitchCase {
    /*
    switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
	switch() de int, byte, short, char, String kullanilir.
     */
 /*  Task->
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a day");
        String day = scan.next().toLowerCase();
        String lesson = switch (day) {
            case "monday", "tuesday" -> "The day of Java";
            case "thursday", "friday" -> "The day of Selenium";
            case "saturday", "wednesday" -> "The day of SQL";
            case "sunday" -> "A day off";
            default -> "Invalid day";
        };

        System.out.println(lesson);

    }// main sonu

}