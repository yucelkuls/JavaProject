package j06_SwitchStatement.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        // Task-> Girilen güne  göre 100 gün sonraki hangi günü print eden code create ediniz.
        //  hafta başlangıcı:pazartesi alınız

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day");
        String day = scanner.next().toLowerCase();
        // 100 % 7 = 2 oldugu icin girilen gunden 2 gun sonrasi bize 100 gunu verir.
        switch (day) {
            case "monday":
                System.out.println("Wednesday");
                break;
            case "tuesday":
                System.out.println("Thursday");
                break;
            case "wednesday":
                System.out.println("Friday");
                break;
            case "thursday":
                System.out.println("Saturday");
                break;
            case "friday":
                System.out.println("Sunday");
                break;
            case "saturday":
                System.out.println("Monday");
                break;
            case "sunday":
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Incorrect input");
                break;


        }



    }
}

