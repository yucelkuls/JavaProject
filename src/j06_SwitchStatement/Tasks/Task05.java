package j06_SwitchStatement.Tasks;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {
		/*
		TASK :
		Girilen note değerinin  aşağıdaki kurallara göre karşılığını print eden code create ediniz.
		1. 0(dahil) ile 50 arasi - D
		2. 50(dahil) ile 60 arası - C
		3. 60(dahil) ile 80 arası - B
		4. 80(dahil) ustu- A
		Yanlis not girilirse ekrana "Lütfen gecerli not giriniz" print ediniz
		
		AHAN DA  TRICK :) switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
		switch() de int, byte, short, char, String kullanilir.
		 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a note");
        int score = scanner.nextInt();

        if (score >= 0 && score <= 100) {
            switch (score / 10) {
                case 10:
                case 9:
                case 8:
                    System.out.println("A");
                    break;
                case 7:
                case 6:
                    System.out.println("B");
                    break;
                case 5:
                    System.out.println("C");
                    break;
                case 4:
                case 3:
                case 2:
                case 1:
                case 0:
                    System.out.println("D");
                    break;
                default:
                    System.out.println("Incorrect entry");
                    break;
            }
        } else {
            System.out.println("Incorrect entry");
        }



    }


}
