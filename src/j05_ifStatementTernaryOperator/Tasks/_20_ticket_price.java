package j05_ifStatementTernaryOperator.Tasks;

import java.util.Scanner;

public class _20_ticket_price {

    public static void main(String[] args) {

        /* Task->
        Trafik cezasının değerini hesaplayan code create ediniz
45 hız sınırıdır.

Eğer hızınız 55-74 arasında ise:
Ceza 100 $'dır.

Eğer hızınız 75 - 84 arasında ise:
Ceza 150 $'dır.

Eğer hızınız 85 -94 arasında ise:
Ceza 320 $'dır.

Eğer hızınız 94'den daha fazla ise:
Ceza 500 $'dır.

ve ayrıca,
Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.


-----------------------------------------


Örn;

currentSpeed(Hızınız) 87
ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;

sonuç 320 olmalıdır.

currentSpeed(Hızınız) 65
ve isDriverLicenceAvailable(Ehliyeti var mı?) = false;

sonuç 300 olmalıdır.  */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your current speed:");
        int currentSpeed = scan.nextInt();
        System.out.println("Do you have a driver licence?");
        boolean isDriverLicenceAvailable = scan.nextBoolean();

//Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.

        if (currentSpeed > 94 && isDriverLicenceAvailable) {
            System.out.println("Traffic penalty is 500 $");
        }  else if (currentSpeed>94){
            System.out.println("Traffic penalty is 700 $");
        } else if (currentSpeed > 84 && isDriverLicenceAvailable) {
            System.out.println("Traffic penalty is 320 $");
        } else if (currentSpeed > 84) {
            System.out.println("Traffic penalty is 520 $");
        } else if (currentSpeed > 74 && isDriverLicenceAvailable) {
            System.out.println("Traffic penalty is 150 $");
        } else if (currentSpeed > 74) {
            System.out.println("Traffic penalty is 350 $");
        } else if (currentSpeed > 54 && isDriverLicenceAvailable) {
            System.out.println("Traffic penalty is 100 $");
        } else if (currentSpeed > 54) {
            System.out.println("Traffic penalty is 300 $");
        }
    }
    }



