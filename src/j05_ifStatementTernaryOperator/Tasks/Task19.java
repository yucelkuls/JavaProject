package j05_ifStatementTernaryOperator.Tasks;

import java.util.Scanner;

public class Task19 {

    /*
    Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.
    Doğum Tarihi %12 = 0 ➜ Maymun
    Doğum Tarihi %12 = 1 ➜ Horoz
    Doğum Tarihi %12 = 2 ➜ Köpek
    Doğum Tarihi %12 = 3 ➜ Domuz
    Doğum Tarihi %12 = 4 ➜ Fare
    Doğum Tarihi %12 = 5 ➜ Öküz
    Doğum Tarihi %12 = 6 ➜ Kaplan
    Doğum Tarihi %12 = 7 ➜ Tavşan
    Doğum Tarihi %12 = 8 ➜ Ejderha
    Doğum Tarihi %12 = 9 ➜ Yılan
    Doğum Tarihi %12 = 10 ➜ At
    Doğum Tarihi %12 = 11 ➜ Koyun
    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("When is your birth year?");
        int birthYear = input.nextInt();
        String birth = "";
        if (birthYear % 12 == 0) birth = "Maymun";
        else if (birthYear % 12 == 2) birth = "Köpek";
        else if (birthYear % 12 == 3) birth = "Domuz";
        else if (birthYear % 12 == 4) birth = "Fare";
        else if (birthYear % 12 == 5) birth = "Öküz";
        else if (birthYear % 12 == 6) birth = "Kaplan";
        else if (birthYear % 12 == 7) birth = "Tavşan";
        else if (birthYear % 12 == 8) birth = "Ejderha";
        else if (birthYear % 12 == 9) birth = "Yılan";
        else if (birthYear % 12 == 10) birth = "At";
        else if (birthYear % 12 == 11) birth = "Koyun";
        else if (birthYear % 12 == 1) birth = "Horoz";
        System.out.println(birth);
    }
}
