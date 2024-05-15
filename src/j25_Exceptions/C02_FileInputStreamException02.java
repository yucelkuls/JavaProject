package j25_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_FileInputStreamException02 {
    public static void main(String[] args) { // zorunlu exc. throws eklendi

        try {//outer try blok->file erisim exc
            FileInputStream fis = new FileInputStream("C:\\Users\\Gebruiker\\Desktop\\IdeaProjects_\\javaLearn\\src\\j25_Exceptions\\ebikGabik");
            int k; // erisilen file her char ascii degerinin atanacagi bos kutu
            try { // inner try blok -> erisilen file daki data okunamazsa
                while ((k = fis.read()) != -1){
                    System.out.print((char) k);//k int ascii olan file degeri char icin casting yapildi->type donusumu
                }
                System.out.println("Bunu okuyorsan inner try blok nsorunsuz run edildi.");
            } catch (IOException e) {  // inner catch blok -> file erisiliyor fakat dosya okunamiyorsa calisacak
                System.out.println("Istedigin file ulasildi ama dosaya okunamadi");
                System.out.println("Inner catch blok run edildi");
            }
            System.out.println("Bunu okuyorsan outer try blok sorunsuz run edildi.");

        } catch (FileNotFoundException e) { // outer catch blok -> file erisilemezse bu catch calisacak
            System.out.println("EbikGabik dosyasina erisilemiyor");
            System.out.println("Eger bu mesaji okuyorsan try exc. yakaladi");
            throw new RuntimeException(e);
        }
        System.out.println("If you read this message, the application is running smoothly");
    }
}
