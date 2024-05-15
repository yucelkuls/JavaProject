package j33_Lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class C11_TextRead {
    public static void main(String[] args) throws IOException {
 /*
dosya eklemek icin 2 yol kullanılır
1) Files.lines(Path.of("path")  buradan stream e eklemek icin
Stream <String> satir=Files.lines(Path.of(".........."));
bu bize tekrardan stream tanimlamadan kullanmayi saglar
2) //Files.lines(Paths.get("..........")).  kullanilir
==========================================================
intellj dosya eklemek icin src => new=>file=>text diyoruz ve istedigimiz metni buraya kopyaliyoruz
bu dosyanin path almak icin dosyanin uzerine gelip sag tikliyoruz(burada dosya HalUk)
sonrasinda copy path seciyoruz bundan sonra iki secenek var
1) absolute path seciyoruz yada
2) path from content root seciyoruz
her ikisinde de path kopyalamis oluyoruz

cevirirken EXCEPTION OLUSMASIN DIYE => throws IOException <= EKLEMELIYIZ
buda lines altinda kirmizi uyari veriyor uzerine tiklayinca kendiliginden oluyor.
*/

        System.out.println("****Task 01*****");
        //TASK 01 --> haluk dosyasini Console'a print eden code create ediniz.
        Path erisilecekDosya = Path.of("javaLearn/src/j33_Lambda/HalUk");//erisilecek dosyanin yolu tanimlandi
        Stream<String> dosyaAkisi = Files.lines(erisilecekDosya);//erisilecek dosya datalari satir olarak akisa alindi
        //Stream<String> dosyaAkisi=Files.lines(Path.of("src/j33_Lambda/HalUk"));

        //dosyaAkisi.forEach(SeedMethods::strYazdir);//erisilecek dosyadaki satirlar yanyana print edildi
        dosyaAkisi.forEach(System.out::println);//erisilecek dosyadaki satirlar alt alta print edildi
        System.out.println("\n****Task 02*****");
        //TASK 02 --> haluk.txt dosyasini Console'a buyuk harflerle print eden code create ediniz.
        Files.lines(erisilecekDosya)
                .map(String::toUpperCase)
                .forEach(System.out::println);
        System.out.println("\n****Task 03*****");
        //TASK 03 --> haluk dosyasindaki sadece ilk satiri kucuk harflerle print eden code create ediniz.
        Files.lines(erisilecekDosya)
                .map(String::toLowerCase)
                .limit(1)
                .forEach(System.out::println);
        System.out.println("\n****Task 04*****");
        //TASK 04 --> haluk dosyasinda "basari" kelimesinin kac satirda gectigini print eden code create ediniz.
        System.out.println(Files.lines(erisilecekDosya)
                .filter(t -> t.contains("basari"))
                .count());

    }
}
