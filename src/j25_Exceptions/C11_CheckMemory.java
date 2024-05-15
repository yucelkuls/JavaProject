package j25_Exceptions;

import java.util.Date;

public class C11_CheckMemory {
    public static void main(String[] args) {
        Runtime rt=Runtime.getRuntime();
        System.out.println("Total memory ="+rt.totalMemory());
        System.out.println("Loop oncesi Free memory ="+rt.freeMemory());
        Date dt=null;
        for (int i = 0; i <10000 ; i++) {//obj create eden loop tanimlandi->memory yuklemesi yapildi
            dt=new Date(i);//10000 adet obj create edildi
            dt=null;
        }
        System.out.println("Loop sonrasi Free memory ="+rt.freeMemory());
        rt.gc();//rt obj ile garbage collector JVM de silmesi icin gc() meth call edildi
        System.out.println("gc(silme) sonrasi Free memory ="+rt.freeMemory());
        // GC tum olusturalan objeleri silmeyi garanti etmedigi icin After GC Free Memory farkliliklar gosterebilir.
    }
}
