package j05_ifStatementTernaryOperator.Tasks;

import java.util.Scanner;

public class _19_school_grade {

    public static void main(String[] args) {

        /*  Task->
        Bir öğrencinin notunu belirleyen bir Java programı yazın.
    Program üç tür puan (sınav, ara sınav ve final puanı) okuyacak ve notu aşağıdaki kurallara göre belirleyecektir:

        Eğer ortalama not >=90% =>not=A
        Eğer ortalama not >= 70% ve<90% => not=B
        Eğer ortalama not >=50% ve <70% =>not=C
        Eğer ortalama not <50% =>note=F

        Aşağıdaki örnek çıktıya bakın:
        int Quiz_score: 80
        int mid: 68
        int Final_score: 90
        print (Your grade is B)
                  (Notunuz B'dir) */


        // Code start here DO NOT CHANGE THE CODE BEFORE THIS LINE

        Scanner scan = new Scanner(System.in);
        System.out.print("Quiz_score: ");
        double quiz = scan.nextInt();
        System.out.print("mid: ");
        double mid = scan.nextInt();
        System.out.print("Final_score: ");
        double fin = scan.nextInt();
        double grade = (quiz + mid + fin)/3;

        if(quiz >= 0 && mid >= 0 && fin >= 0 && grade <= 100) {
            if (grade >= 90) System.out.println("Your grade is A");
            else if (grade >= 70) System.out.println("Your grade is B");
            else if (grade >= 50) System.out.println("Your grade is C");
            else System.out.println("Your grade is F");
        }else System.out.println("Invalid entry");
    }
}
