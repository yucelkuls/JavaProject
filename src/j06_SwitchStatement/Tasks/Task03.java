package j06_SwitchStatement.Tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        // Task-> Girilen hafta gün sayısına karşılık gelen gün adını print eden code create ediniz.
        // 1.gün Pazartesi olsun

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kac hafta oldugunu giriniz: ");
        int hafta = scanner.nextInt();
        System.out.println("Gun sayısını giriniz: ");
        int gunSayisi = scanner.nextInt();
        int topGun = (hafta * 7) + gunSayisi;
        int modTop = topGun % 10;

        switch (modTop) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Incorrect entry");
        }






    }
}
