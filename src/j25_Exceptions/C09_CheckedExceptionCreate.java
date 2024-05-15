package j25_Exceptions;

public class C09_CheckedExceptionCreate {
        /*
       Convantion Named -> Class name sonuna "Exception" kullanılır.
       "checked exception“ create etmek için , "Exception" class’ına extends edilmeli.
       "String" parametreli olan bir constructor’ın ilk satırına super(); create edilmeli
        */
}
class EnrolIdException extends Exception{
    private static final int serialVersionID=1001;
    private EnrolIdException(String message){
        super(message);
    }
}
