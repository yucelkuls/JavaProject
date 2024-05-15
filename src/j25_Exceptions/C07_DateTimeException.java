package j25_Exceptions;

import java.time.DateTimeException;
import java.time.LocalDate;

public class C07_DateTimeException {
    public static void main(String[] args) {
        //DateTimeException -> tarih zaman value'lerde oluşan RTE
        try {
            LocalDate date=LocalDate.of(2023,2,29);
            System.out.println("Bu mesaji okuyorsan try sorunsuz calisti catch calismadi");
        }catch (DateTimeException e){
            System.out.println(e.getMessage()+" try exc firlatti catch yakaladi");
        }
        System.out.println("Bu mesaji okuyorsan app sorunsuz calisti");
    }
}
