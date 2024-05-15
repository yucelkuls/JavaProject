package j06_SwitchStatement.Tasks;

import java.util.Scanner;

public class Task_SeyahatProjesi {

    public static void main(String[] args) {

        /*
        bulundugunuz yerden, bir yere yolculuk edeceksiniz.

        1. Köln veya Frankfurta gidebilirsiniz.
        2. Bilet fiyatı hesabı = Her 20 Km başına 5 euro. örn: (100 km yol. Bilet parası  (100/20)* 5 =25 euro

        todo İPUCU:  toplamTutar, işlem, FrankfurtKm, KmBirimFiyat   gibi sabit veri tipleri oluşturabilirsiniz.
            İşlemlerde direkt bunları cağırabilirsiniz.

        todo İLK OLARAK;

        "Nereye yolculuk etmek istiyorsunuz? (Frankfurt : 60 KM---Köln : 80 KM ---(20 KM başına 5 euro bilet parası alınmaktadir..)    yazısı gelsin.

    1.    Frankfurt veya Köln olarak bir giriş yapın. (Girdiğiniz sehrin harfleri , girildikten sonra büyük hale gelsin.

        todo    Frankfurt girildiyse,
             örn: girdi= Frankfurt
                case=FRANKFURT:

      Rota = Frankfurt yazdırın.
      Frankfurt km hesabı işlemi yapın.

      son olarak konsolda: Frankfurt 15 Euro         yazsın.
      todo  case: KÖLN ise

      "Rota = Köln" yazdırın.
       km hesabına göre işlemi yapınız.
       son olarak konsolda:  Köln   20 Euro             yazsın.

       2.  Sistem bize "Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir):   "   sorusunu sorsun.

       case:1  ise
        " 1 kişilik " yazdırın. (1 kişilik seçerseniz bir işlem yapmanıza gerek kalmaz, bilet ücreti yukarıda çoktan belirlenmiş olur.)

        case:2 ise

            "2 kişilik " yazdırın
            2 kişi için bilet fiyatını hesaplayın.
        todo  Son olarak yolculugunuzu check edin;

        konsolda örn:   Frankfurt  - 2 Kişilik    yazsın.
        1.Bakiyemi belirtin.
        2.Toplam Tutarı belirtin.
        3.double paraUstu oluşturun ve hesaplayın.
        4.Double para üstünü yazdırın.
         */

        Scanner input = new Scanner(System.in);
        double ticketFrnk = (60 / 20) * 5;
        double ticketKln = (80 / 20) * 5;
        double bakiye = 1000;
        double total = 0;
        double paraUstu = 0;
        int adet = 0;
        System.out.println("Nereye yolculuk etmek istiyorsunuz? \nFrankfurt : 60 KM---Köln : 80 KM ---(20 KM başına 5 euro bilet parası alınmaktadir..)");
        String city = input.next().toUpperCase();

        switch (city) {
            case "FRANKFURT":
                System.out.println("Rota: Frankfurt");
                System.out.println("Frankfurt "+ticketFrnk+" Euro");
                break;
            case "KOLN":
                System.out.println("Rota: Köln");
                System.out.println("Köln "+ticketKln+" Euro");
                break;
            default:
                System.out.println("Hatali giris!");
        }

        if (city.equals("FRANKFURT") || city.equals("KOLN")) {
            System.out.println("Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir)");
            adet += input.nextInt();

            if (city.equals("FRANKFURT")) {
                switch (adet) {
                    case 1:
                        System.out.println("1 kişilik" + ticketFrnk + "euro");
                        total = ticketFrnk;
                        paraUstu = bakiye - ticketFrnk;
                        break;
                    case 2:
                        total = ticketFrnk * 2;
                        System.out.println("2 kişilik " + total + " euro");
                        paraUstu = bakiye - total;
                        break;
                }
            } else if (city.equals("KOLN")) {
                switch (adet) {
                    case 1:
                        System.out.println("1 kişilik " + ticketKln + " euro");
                        total = ticketKln;
                        paraUstu = bakiye - ticketKln;
                        break;
                    case 2:
                        total = ticketKln * 2;
                        System.out.println("2 kişilik " + total + " euro");
                        paraUstu = bakiye - total;
                        break;
                }
            }
        }else {
            System.out.println("Tekrar deneyin!");
        }
        if(adet > 0 && adet < 3) {
            System.out.println("***Yolculugunuzu check ediniz***\n\n" + city + " - " + adet + " kişilik\nBakiyem: " + bakiye + "\nToplam tutar: " + total + "\nPara ustu: " + paraUstu);

        }else {
            System.out.println("Maksimum 2 kisilik alabilirsiniz!");
        }


    }
}
