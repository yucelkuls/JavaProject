package j04_JavaOperators.j01_AritmeticOperators;

public class C03_MathMethods {
    /*
     Math.abs(a)
     Girilen degerin mutlak degerini verir.

    Math.max(a, b)
    Girilen iki degerden buyuk olani verir.

    Math.min(a, b)
    Girilen iki degerden kucuk olani verir.

    Math.round(a)
    Girilen degerin en yakin tamsayiya yuvarlar.

    Math.sqrt(a)
    Girilen degerin karekokunu verir.

    Math.pow(a, b)
    Girilen a ve b degerini a uzeri b olarak verir.

    Math.ceil(a) 3.1 => 4
    Girilen bir ondalikli sayiyi bir sonraki en yakin tam sayiya yukseltir.

    Math.floor(a) 3.7 => 3
    Girilen bir ondalikli sayiyi bir onceki en yakin tam sayiya indirger.
     */
    public static void main(String[] args) {

        //task-> 81'in karekokunu print eden code create ediniz

        System.out.println(Math.sqrt(81));

        System.out.println("Math.abs(-55) = " + Math.abs(-55));
        System.out.println("Math.max(24, 65) = " + Math.max(24, 65));
        System.out.println("Math.min(24, 65) = " + Math.min(24, 65));
        System.out.println("Math.round(24.65) = " + Math.round(24.65));
        System.out.println("Math.ceil(24.65) = " + Math.ceil(24.65));
        System.out.println("Math.floor(24.65) = " + Math.floor(24.65));
        System.out.println("Math.pow(2, 3) = " + Math.pow(2, 3));
        System.out.println("Math.sqrt(81) = " + Math.sqrt(81));
        System.out.println("Math.random() = " + Math.random()); // 0 ile 1 arasi rastgele sayi verir.

        System.out.println((int)(Math.random() * 100)); // 0 ile 100 arasi rastgele sayi verir.

        int sayi = (int) (Math.random() * 50); // 0 ile 50 arasinda rastgele bir sayi uret
        System.out.println(sayi); // sayiyi ekrana yazdir








    }
}
