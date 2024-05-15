package j04_JavaOperators.j02_Assaignment_Atama_Operators;

public class C01_AtamaOperatoru {

    //    =         x = 8      x = 8
//    +=        x += 3     x = x + 3
//    -=        x -= 3     x = x - 3
//    *=        x *= 3     x = x * 3
//    /=        x /= 3     x = x / 3
//    %=        x %= 3     x = x % 3

    public static void main(String[] args) {

        int yas = 48;
        System.out.println("yas + 5 = " + (yas + 5)); // 53  Burada atama yapilmiyor dikkat!!!
        System.out.println("yas = " + yas); // 48
        System.out.println("yas+=11 = " + (yas += 11)); // 59 Burada atama yapiliyor ve artik yas degisti(59)
        System.out.println("yas = " + yas); // 59


    }
}
