package P11_depoYonetimi;

import java.util.Scanner;

public class TryCatch {
    static Scanner scan = new Scanner(System.in);
    public static int intGirisi() {
        String giris = "";
        boolean flag = true;
        do {
            giris = "";
            try {
                giris = scan.nextLine();
                if (String.valueOf(giris).substring(0,1).contains(" ")){
                    throw new Exception("Bosluk olmaz");
                }
                for (int i = 0; i <String.valueOf(giris).length() ; i++) {
                    if (!Character.isDigit(String.valueOf(giris).charAt(i))){
                        throw new Exception("Harf olmaz");
                    }
                }
                flag = false;
            } catch (Exception e) {
                System.out.print("Lütfen geçerli rakamsal bir deger giriniz: ");
            }
        } while (flag);
        return Integer.parseInt(giris);
    }

    public static String stringGirisi() {
        String giris = "";
        boolean flag = true;
        do {
            giris = "";
            try {
                giris = scan.nextLine();
                if (giris.substring(0,1).contains(" ")){
                    throw new Exception("Bosluk olmaz");
                }
                for (int i = 0; i <giris.length() ; i++) {
                    if (!Character.isDigit(giris.charAt(i))){
                        continue;
                    } else{
                        throw new Exception("rakam olmaz");
                    }
                }
                flag = false;
            } catch (Exception e) {
                System.out.print(e.getMessage());
                System.out.print(". Lütfen geçerli metinsel bir deger giriniz : ");
            }
        } while (flag);
        return giris;
    }

}