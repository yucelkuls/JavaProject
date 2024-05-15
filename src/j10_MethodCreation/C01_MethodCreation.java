package j10_MethodCreation;

public class C01_MethodCreation {
    /*
      code okunabilirliği ve sadeliği için sürekli kullanılan aksiyonlar için method create edip
      main method'a call edip run etmek uygulamanın test edilmesi maintenance ve reusable açısından tercih edilir.
      1) Java method'larin sadece name  değil  name + parametre'lere göre run eder
      parametre sayisi, parametre'lerin data tiplerin ve parametrelerin sırası methodu belirler.

      str.endsWith("el");   Bu method'un gorevi gidip kelimenin son kismini kontrol etmek
                            bu method'u kullanmak icin bu method'un kontrol ettikten sonra
                            bana rapor olarak ne getirdigini bilmem lazim (true/false)

      2) Bir method create edildiğinde  method'un aksiyonuna ve aksiyon çıktısı da method içinde create edilir

      3) Bir method olusturulurken  " str.indexOf(String str, int fromIndex) "
         de oldugu gibi
         disaridan kabul edecegi parametreleri ve bu parametrelerin data tiplerini
         deklare edilmeli

         method call edildiğinde  Parametre olarak
         declare edilen data tiplerine uygun value'ler (ARGUMENT)  girilmeli.
  */
    public static void main(String[] args) {   // start of main
        selam();
        sum();
        selam();          // Methodlar call edildigi siraya gore calisir.
        sum();
        System.out.println(sum1());
        // return type olan method sout edilmezse veya bir variableye atanip yazdirilmazsa
        // consolda cikti alamayiz!!!
        // ama method run edilir!!!
//        sum1(); selam();  yan yana call edilebilir...
        sum2(23,47,61);
        sum2(21,12,61);  // 3 parametre girmek zorundayiz.
        System.out.println("sum3(12,32,41) = " + sum3(12, 32, 41));


    } // end of main

    private static double sum3(int a, double b, int c) {
        return a + b + c;
    }

    private static void sum2(int hadi, int bakalim, int java) {
        System.out.println("sum = " + (hadi + bakalim + java));
    }

    private static String sum1() {    // parametresiz method create edildi.(return type)
        int a = 27;
        int b = 55;
        System.out.println("Return type method ");
        return "Hi, I am a sum1 method javaCAN " +(a + b);
    }

    // Methodlar main method disinda tanimlanir.

    public static void selam() {   // parametresiz method create edildi.(return type olmayan)
        System.out.println("Hi guys!");
    }
    public static void sum(){      // parametresiz method create edildi.(return type olmayan)
        int a = 53;
        int b = 75;
        int sum = a + b;
        System.out.println("sum = " + sum);
    }
} // end of class
