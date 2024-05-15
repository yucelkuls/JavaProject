package j10_MethodCreation.Tasks;

public class Task24 {
    public static void main(String[] args) {
/*
       task-> girilen sayıya kadar olan Fİbonacci dizisi elemalarını print eden METHOD create ediniz.
       Fibonacci dizisi :0, 1, 1, 2, 3, 5, 8, 13, 21, 34

*/
        int n = 10;
        System.out.println("fibonacci() = " + fibonacci(n));
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int a = 0;
        int b = 1;
        int c = 0;

        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return c;
    }

}
