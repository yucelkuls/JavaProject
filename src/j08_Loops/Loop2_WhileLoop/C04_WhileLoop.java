package j08_Loops.Loop2_WhileLoop;

public class C04_WhileLoop {
    public static void main(String[] args) {
        //task-> 3 basamaklı 4 ile tam bölünen sayıları print eden code create ediniz

        int i = 100;
        while (i <= 999) {
            System.out.print(i % 4 == 0 ? i +" ": "");
            i++;
        }
    }
}
