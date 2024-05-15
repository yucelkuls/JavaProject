package j33_Lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class C12_FlatMap {
    /*
  Stream.flatMap, adıyla tahmin edilebileceği gibi, bir map ve flat işleminin birleşimidir. Bu, ilk önce elemanlarınıza bir
  fonksiyon uyguladığınız ve daha sonra düzleştirdiğiniz anlamına gelir.
  Stream.map yalnızca akışı düzleştirmeden bir işlevi uygular.

  Bir akışın düzleştirme'in neyi içerdiğini anlamak için, "iki seviye" olan [ [1,2,3],[4,5,6],[7,8,9] ] gibi bir yapı düşünün.
  Bunun düzleştirilmesi, "bir seviye" yapısında dönüştürülmesi anlamına gelir: [ 1,2,3,4,5,6,7,8,9 ].
  flatMap yöntemi, bir akışın her bir değerini başka bir akışla değiştirmenizi sağlar
  ve ardından oluşturulan tüm akışları tek bir akışa birleştirir.

*/
    public static void main(String[] args) throws IOException {
        Path erisilecekDosya = Path.of("javaLearn/src/j33_Lambda/HalUk");//erisilecek dosyanin yolu tanimlandi
        Stream<String> dosyaAkisi = Files.lines(erisilecekDosya);//erisilecek dosya datalari satir olarak akisa alindi

        System.out.println("****Task 05* ****");
        //TASK 05 -> HalUk dosyasindaki farkli kelimeleri  print ediniz..
        Files.lines(erisilecekDosya) // Haluk dosayasina ersiildi
                .map(t -> t.split(" ")) // akistaki satir elemanlar " " bosluga gore parcalandi
                .flatMap(Arrays::stream) // " "gore parcalanan satirlar tek boyutlu array halinde akisa alindi
                .distinct() // akistaki kelimeler benzersiz hale getirildi
                .forEach(SeedMethods::strYazdir);


        System.out.println("\n****Task 06 *****");
        //TASK 06 -> HalUk dosyasindaki tum kelimeleri natural order  print ediniz..
        Files.lines(erisilecekDosya) // Haluk dosayasina ersiildi
                .map(t -> t.split(" ")) // akistaki satir elemanlar " " bosluga gore parcalandi
                .flatMap(Arrays::stream) // " "gore parcalanan satirlar tek boyutlu array halinde akisa alindi
                .sorted()
                .forEach(SeedMethods::strYazdir);


        System.out.println("\n****Task 07 *****");
        //TASK 07 -> HalUk dosyasinda "basari" kelimesinin kac kere gectigini
        // buyuk harf kucuk harf bagımsız print ediniz.

        System.out.println(Files.lines(erisilecekDosya)
                .map(t -> t.toLowerCase().split(" "))
                .flatMap(Arrays::stream)
                .filter(t -> t.contains("basari"))
                .count());  //5

        System.out.println("\n****Task 08 *****");
        //TASK 08 -> HalUk dosyasinda "a" harfi gecen kelimelerin sayisini print eden  programi create ediniz.
        System.out.println(Files.lines(erisilecekDosya)
                .map(t -> t.toLowerCase().split(" "))
                .flatMap(Arrays::stream)
                .filter(t -> t.contains("a"))
                .count()); //17

        System.out.println("\n****Task 09 *****");
        //TASK 09 -> HalUk dosyasinda icinde "a" harfi gecen kelimeleri print ediniz.
        Files.lines(erisilecekDosya)
                .map(t -> t.toLowerCase().split(" "))
                .flatMap(Arrays::stream)
                .filter(t -> t.contains("a"))
                .forEach(SeedMethods::strYazdir);
                //.collect(Collectors.toList())

        System.out.println("\n****Task 10 *****");

        System.out.println(Files.lines(erisilecekDosya)
                .map(t -> t.replaceAll("\\W", "").split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .count()); // 29

        System.out.println("\n****Task 11 *****");
        //TASK 11 -> HalUk dosyasinda kac farkli kelime kullanildigini print ediniz.
        System.out.println(Files.lines(erisilecekDosya)
                .map(t -> t.replaceAll("[.!,:)\\-]", "").split(" "))
                .flatMap(Arrays::stream)
                .distinct()
                .count()); // 22


        System.out.println("\n****Task 12 *****");
        //TASK 12 -> HalUk dosyasinda  farkli kelimeleri print ediniz.
        System.out.println(Files.lines(erisilecekDosya)
                .map(t -> t.replaceAll("[.!,:)\\-]", "").split(" "))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList())); //

    }
}
