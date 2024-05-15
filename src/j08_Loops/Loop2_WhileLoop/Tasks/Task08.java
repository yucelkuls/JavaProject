package j08_Loops.Loop2_WhileLoop.Tasks;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        // task-> girilen şifrenin asagidaki sartlari kontrol edin
        // ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        // eger tum sartlari saglarsa, "sifre basariyla kaydedildi" print edin
        // - ilk harf kucuk harf olmali
        // - son karakter rakam olmali
        // - sifre bosluk icermemeli
        // - uzunlugu en az 10 karakter olmali

        Scanner scanner = new Scanner(System.in);
        String password = "";
        boolean passwordTrue = true;

        while (passwordTrue) {
            System.out.println("Please enter your password: ");
            password = scanner.nextLine();
            if (passwordControl(password)) {
                System.out.println("Your password has been successfully saved.");
                passwordTrue = false;
            }
        }
    }

    private static boolean passwordControl(String password) {
        int flag = 0;
        if (!(password.charAt(0) >= 'a' && password.charAt(0) <= 'z')) {
            System.out.println("The first character must be a small letter");
            flag++;
        }
        if (!Character.isDigit(password.charAt(password.length() - 1))) {
            System.out.println("The last character must be a digit");
            flag++;
        }
        if (password.contains(" ")) {
            System.out.println("The password cannot contain spaces");
            flag++;
        }
        if (password.length() < 10) {
            System.out.println("The password must be at least 10 characters long");
            flag++;
        }
        return flag == 0;

    }
}


