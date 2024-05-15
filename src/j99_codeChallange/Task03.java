package j99_codeChallange;

public class Task03 {

    // Task-> asagidaki fiyatlarin toplamini print eden code create ediniz.
    // String  str 1= "$13.99"
    // String str 2= "$10.55"
    // ipucu: Double parseDouble() methodunu kullanabilirsiniz.

     /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar
		  	 \\D    ==> tum rakam disi character ler
		 2) \\w   ==> A->Z		a->z			0->9    _
		 	 \\W  ==> A->Z		a->z			0->9    _ disindaki hersey
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey  */

    public static void main(String[] args) {

        String str1= "$13.99";
        String str2= "$10.55";
        double newStr1 = Double.parseDouble(str1.replaceAll("[^\\d.]", ""));
        double newStr2 = Double.parseDouble(str2.replaceAll("[^\\d.]",""));
        System.out.println(newStr1 + newStr2);

        // rakamlar ve . disindakileri sectik ^ sayesinde.

    }
}
