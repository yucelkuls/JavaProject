package j04_JavaOperators.j01_AritmeticOperators;

public class C02_IncrementDecrement {

    public static void main(String[] args) {

        int a = 8;

        System.out.println(a); // 8
        System.out.println(a++ + ++a); // 8 + 10 = 18

        System.out.println(++a + a++ + a++); // 11 + 11 + 12 = 34

        System.out.println(a); // 13 oldu.


        System.out.println("***Decrement - Azaltma***");

        int b = 3;

        System.out.println(b); // 3
        System.out.println(b--); // 3
        System.out.println(--b); // 1

        int x = 20;
        int y = 15;

        System.out.println(++x + y--); // 21 + 15 = 36
        System.out.println(x);
        System.out.println(y);
        System.out.println(y++ + x++ + --x); // 56

        System.out.println(x);
        System.out.println(y);

        int k = 5;
        int sonuc = ++k + k++ + --k + k-- + k;
        System.out.println("Sonuc = " + sonuc); // 6 + 6 + 6 + 6 + 5 = 29






    }
}
