package j27_Interface;

public interface DisDonanim {
    void kapi();//public abs meth
    void kaporta();//public abs meth
    //String renk;//CTE->final static String variable initial edilmek zorundadir
    //public final static String renk="Kirmizi";//initial edilmis variable
    String RENK="Kirmizi";//public static final initial variable
    public static void anten(){
        System.out.println("Cekemeyen anten taksin");
    }
    public default String sisLamp(){
        return "Sisli havada Can kurtarir";
    }

//    public static void main(String[] args) {//interfacede main tanimlanabilir fakat bad practice
//        System.out.println(RENK);
//        anten();//meth call
//        //DisDonanim obj=new DisDonanim();//interface'nin const olmadigi icin obj create edilemez
//    }
}
