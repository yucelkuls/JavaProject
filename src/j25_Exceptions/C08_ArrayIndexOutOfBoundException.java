package j25_Exceptions;

import java.time.DateTimeException;
import java.time.LocalDate;

public class C08_ArrayIndexOutOfBoundException {
    public static void main(String[] args) {
        // ArrayIndexOutOfBoundException-> array'lerde olmayan index elemanı ile işlem yapıldıgında oluşan  RTE
        int[] sayi={38,33,61,52,10,59,16,15};
        System.out.println("sayi[5] = " + sayi[5]);
        //System.out.println("sayi[21] = " + sayi[21]);//RTE->.ArrayIndexOutOfBoundsException
        try {
            System.out.println("sayi[21] = " + sayi[21]);//RTE exc firlatir alt satira gecmeden catch blok calisir
            System.out.println("Bu mesaji okuyorsan try sorunsuz calisti catch calismadi");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Olmayan eleman istersen try exc firlatir catch de exc yakalar");
        }
        System.out.println("Bu mesaji okuyorsan app sorunsuz calisti");
    }
}
