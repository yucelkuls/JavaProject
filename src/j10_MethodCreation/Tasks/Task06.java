package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task06 {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {
        //Task-> Girilen iki boyuta göre seçilen geometrik şeklin(kare, dikdörtgen , üçgen) alan ve çevre değerlerini
        // print eden METHOD  create ediniz.

        alanCevreHesapla();

    }//main sonu

    private static void alanCevreHesapla() {
        System.out.println("Enter the name of the geometric shape: ");
        String action = input.next().toLowerCase();
        switch (action) {
            case "square":
                System.out.println("Enter the length of one side of the square: ");
                int side = input.nextInt();
                System.out.println("Perimeter of square: " + (Math.pow(side, 2)));
                System.out.println("Area of square: " + (side * 4));
                break;
            case "rectangle":
                System.out.println("Enter the length of one side of the rectangle: ");
                int side1 = input.nextInt();
                System.out.println("Enter the length of another side of the rectangle: ");
                int side2 = input.nextInt();
                System.out.println("Perimeter of rectangle: " + ((side1 + side2) * 2));
                System.out.println("Area of rectangle: " + (side1 * side2));
                break;
            case "triangle":
                int perimeter = 0;
                double area = 0;
                int[] sides = new int[3];
                for (int i = 0; i < 3; i++) {
                    System.out.println("Enter the length of " + (i + 1) + ". side of the triangle. ");
                    int side3 = input.nextInt();
                    sides[i] = side3;
                    perimeter += side3;
                }
                System.out.println("Perimeter of rectangle: " + perimeter);
                int c = perimeter / 2;
                area += Math.sqrt(c * (c - sides[0]) * (c - sides[1]) * (c - sides[2])); // heron formul
                System.out.println("Area of rectangle: " + area);
                break;
            default:
                System.out.println("Incorrect entry");
        }
    }
}//Class sonu
