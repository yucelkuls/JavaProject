package j12_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task07 {
    public static void main(String[] args) {
        /* TASK :
         * 10 elamanli bir list olusturun. Ardindan dizinin 3. elemani ile
         * 8. elemaninin yerlerini degistirin.
         *
         * ORNEK:
         *
         * INPUT : String[] isimler={"Haluk","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
         * OUTPUT : String[] isimler={"Haluk","Emin","Furkan","Kerem","Taylan","Orhan","Sinan","Kemal","Ahmet","Ali"};
         */

        ArrayList<String > isimlist=new ArrayList<String>(Arrays.asList("Haluk","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"));
        String str3=isimlist.get(2);
        String str8=isimlist.get(7);
        System.out.println("isimlist = " + isimlist); //[Haluk, Emin, Kemal, Kerem, Taylan, Orhan, Sinan, Furkan, Ahmet, Ali]
        isimlist.set(2,str8);
        isimlist.set(7,str3);
        System.out.println("isimlist = " + isimlist); //[Haluk, Emin, Furkan, Kerem, Taylan, Orhan, Sinan, Kemal, Ahmet, Ali]
    }
}
