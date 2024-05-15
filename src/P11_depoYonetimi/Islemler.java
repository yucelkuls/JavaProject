package P11_depoYonetimi;

import java.util.*;

public class Islemler implements IslemlerInterface {
    static Scanner scan = new Scanner(System.in);
    List<UrunTanimlama> valuesList = new ArrayList<>();
    Set<Integer> keySets = UrunTanimlama.urunMap.keySet();
    Collection<UrunTanimlama> valueSet = UrunTanimlama.urunMap.values();

    public static void fakeUrun() {

        int id = UrunTanimlama.id++;

        UrunTanimlama urunTanimlama2 = new UrunTanimlama();
        urunTanimlama2.setUrunIsmi("un");
        urunTanimlama2.setUretici("hekimoglu");
        urunTanimlama2.setBirim("cuval");
        UrunTanimlama.urunMap.put(id, urunTanimlama2);

        UrunTanimlama urunTanimlama3 = new UrunTanimlama();
        id = UrunTanimlama.id++;
        urunTanimlama3.setUrunIsmi("kalem");
        urunTanimlama3.setUretici("faber");
        urunTanimlama3.setBirim("adet");
        UrunTanimlama.urunMap.put(id, urunTanimlama3);

    }

    @Override
    public void urunTanimlama() {
        System.out.println("\n***** URUN TANIMLAMA SAYFASI ******");
        UrunTanimlama newUrun = new UrunTanimlama();
        System.out.print("Urun Ismini giriniz: ");
        newUrun.setUrunIsmi(TryCatch.stringGirisi());
        System.out.print("Uretici Ismini giriniz: ");
        newUrun.setUretici(TryCatch.stringGirisi());
        boolean temp = false;
        try {
            for (Integer each : keySets) {
                valuesList = Collections.singletonList(UrunTanimlama.urunMap.get(each));
                int index = 0;
                while (index < valuesList.size()) {
                    if (Objects.equals(valuesList.get(index).getUrunIsmi(), newUrun.urunIsmi) &&
                            Objects.equals(valuesList.get(index).getUretici(), newUrun.uretici)) {
                        temp = true;
                        break;
                    }
                    index++;
                }
            }
            if (!temp) {
                System.out.print("Urun Birimi giriniz: ");
                newUrun.setBirim(TryCatch.stringGirisi());
                int id = UrunTanimlama.id++;
                UrunTanimlama.urunMap.put(id, newUrun);
                System.out.println("Urun basariyla kaydedildi...");
            } else {
                throw new ConflictException("Ayni urun ve uretici daha once kaydedildi...");
            }
        } catch (ConflictException e) {
            System.out.println(e.getMessage());
            System.out.print("Devam etmek istiyor musun? [E/H]: ");
            if (TryCatch.stringGirisi().substring(0, 1).equalsIgnoreCase("e")) {
                System.out.print("Urun Birimi giriniz: ");
                newUrun.setBirim(TryCatch.stringGirisi());
                int id = UrunTanimlama.id++;
                UrunTanimlama.urunMap.put(id, newUrun);
                System.out.println("Urun basariyla kaydedildi...");
            } else {
                System.out.println("Ana Menuye Yonlendiriliyorsunuz...");
                AnaMenu.giris();
            }
        }
    }

    @Override
    public void urunListele() {
        System.out.println("\n***** URUN LISTELEME SAYFASI ******");
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s\n", "ID", "Ürün", "Üretici", "Miktar", "Birim", "Raf");
        System.out.println("====================================================================================");
        for (Integer each : keySets) {
            valuesList = Collections.singletonList(UrunTanimlama.urunMap.get(each));
            int index = 0;
            while (index < valuesList.size()) {
                System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s\n", each, valuesList.get(index).getUrunIsmi(), valuesList.get(index).getUretici(),
                        valuesList.get(index).getMiktar(), valuesList.get(index).getBirim(), valuesList.get(index).getRaf());
//                System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s\n", each, UrunTanimlama.urunMap.get(each).getUrunIsmi());
                index++;
            }
        }
        // map in get i ile listeleme yapılacak!
    }

    @Override
    public void urunGirisi() {
        System.out.println("\n" + AnaMenu.Y + "***** URUN GIRIS SAYFASI ******");
        System.out.print("Giris yapmak isteginiz urun Id'sini girin: ");
        int id = TryCatch.intGirisi();
        try {
            if (UrunTanimlama.urunMap.containsKey(id)) {
                System.out.print("Girisini yapmak istediginiz urun: " + (AnaMenu.R + UrunTanimlama.urunMap.get(id).getUrunIsmi().toUpperCase()) + AnaMenu.Y + " bu mu? [E/H]: "+AnaMenu.B);
                if (TryCatch.stringGirisi().substring(0, 1).equalsIgnoreCase("e")) {
                    System.out.print("Urun miktarini giriniz: ");
                    int miktar = TryCatch.intGirisi();
                    int oldMiktar = UrunTanimlama.urunMap.get(id).getMiktar();
                    UrunTanimlama.urunMap.get(id).setMiktar(oldMiktar + miktar);
                    System.out.println("Id : " + id + ", urun girisi : " + miktar + ", toplam miktar: " + (oldMiktar + miktar));
                } else urunGirisi();
            } else {
//                System.out.println(id + " id'ye sahip urun bulunamadi!");
                throw new ResourceNotFoundException(id + " id'ye sahip urun bulunamadi!");
            }
        } catch (ResourceNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.print(" Urun girisine devam etmek istiyor musunuz? [E/H]: ");
            if (TryCatch.stringGirisi().substring(0, 1).equalsIgnoreCase("e")) urunGirisi();
            else {
                System.out.println("Ana Menuye Yonlendiriliyorsunuz...");
                AnaMenu.giris();
            }
        }
    }

    @Override
    public void urunuRafaKoy() {
        System.out.println("\n" + AnaMenu.Y + "***** URUN RAFA YERLESTIRME SAYFASI ******");
        System.out.print("Rafa koymak istediginiz urun ID'sini giriniz: ");
        int id = TryCatch.intGirisi();
        try {
            if (UrunTanimlama.urunMap.get(id).miktar != 0) {
                try {
                    if (UrunTanimlama.urunMap.containsKey(id)) {
                        System.out.print("Rafa koymak istediginiz urun: " + (AnaMenu.R + UrunTanimlama.urunMap.get(id).getUrunIsmi().toUpperCase()) + AnaMenu.Y + " bu mu? [E/H]: "+AnaMenu.B);
                        if (TryCatch.stringGirisi().substring(0, 1).equalsIgnoreCase("e")) {
                            System.out.print("Urunu hangi Raf'a koymak istersiniz: ");
                            String raf = TryCatch.stringGirisi();
                            boolean temp = false;
                            try {
                                for (Integer each : keySets) {
                                    valuesList = Collections.singletonList(UrunTanimlama.urunMap.get(each));
                                    int index = 0;
                                    while (index < valuesList.size()) {
                                        if (Objects.equals(valuesList.get(index).getRaf(), raf)) {
                                            temp = true;
                                            break;
                                        }
                                        index++;
                                    }
                                }
                                if (!temp) {
                                    UrunTanimlama.urunMap.get(id).setRaf(raf);
                                    System.out.println("Id: " + id + ", raf: " + raf);
                                } else {
                                    throw new ConflictException("Bu raf dolu. Baska bir raf seciniz...");
                                }
                            } catch (ConflictException e) {
                                System.out.println(e.getMessage());
                                System.out.print("Herhangi bir urunu Rafa yerleştirmeye devam etmek istiyor musun? [E/H]: ");
                                if (TryCatch.stringGirisi().substring(0, 1).equalsIgnoreCase("e")) urunuRafaKoy();
                                else AnaMenu.giris();
                            }
                        } else urunuRafaKoy();
                    } else {
//                System.out.println(id + " id'ye sahip urun bulunamadi!");
                        throw new ResourceNotFoundException(id + " id'ye sahip urun bulunamadi!");
                    }
                } catch (ResourceNotFoundException e) {
                    System.out.println(e.getMessage());
                    System.out.print("Rafa yerleştirmeye devam etmek istiyor musun? [E/H]: ");
                    if (TryCatch.stringGirisi().substring(0, 1).equalsIgnoreCase("e")) urunuRafaKoy();
                    else {
                        System.out.println("Ana Menuye Yonlendiriliyorsunuz...");
                        AnaMenu.giris();
                    }
                }
            } else {
                throw new RuntimeException("Urun miktari \"0\" oldugu icin Raf'a koyamazsin...");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Ana Menuye yonlendiriliyorsun...");
        }
    }

    @Override
    public void urunCikisi() {
        System.out.println("\n" + AnaMenu.Y +"***** URUN CIKIS SAYFASI ******");
        System.out.print("Cikis yapmak isteginiz urun Id'sini girin: ");
        int id = TryCatch.intGirisi();
        try {
            if (UrunTanimlama.urunMap.containsKey(id)) {
                System.out.print("Cikisini yapmak istediginiz urun: " + (AnaMenu.R + UrunTanimlama.urunMap.get(id).getUrunIsmi().toUpperCase()) + AnaMenu.Y + " bu mu? [E/H]: "+AnaMenu.B);
                if (TryCatch.stringGirisi().substring(0, 1).equalsIgnoreCase("e")) {
                    System.out.print("Cıkısı yapılacak Urun miktarini giriniz: ");
                    int miktar = TryCatch.intGirisi();
                    int oldMiktar = UrunTanimlama.urunMap.get(id).getMiktar();
                    try {
                        if (oldMiktar >= miktar) {
                            UrunTanimlama.urunMap.get(id).setMiktar(oldMiktar - miktar);
                            System.out.println("Id : " + id + ", urun cikisi : " + miktar + ", toplam miktar: " + (oldMiktar - miktar));
                            if ((oldMiktar - miktar) == 0) {
                                UrunTanimlama.urunMap.get(id).setRaf(null);
                            }
                        } else {
                            throw new ConflictException("Stok miktarindan fazla cikis yapamazsin!");
                        }
                    } catch (ConflictException e) {
                        System.out.println(e.getMessage());
                        System.out.print("Baska Urun cikisina devam etmek istiyor musunuz? [E/H]: ");
                        if (TryCatch.stringGirisi().substring(0, 1).equalsIgnoreCase("e")) urunCikisi();
                        else AnaMenu.giris();
                    }
                } else urunGirisi();
            } else {
//                System.out.println(id + " id'ye sahip urun bulunamadi!");
                throw new ResourceNotFoundException(id + " id'ye sahip urun bulunamadi!");
            }
        } catch (ResourceNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.print("Urun girisine devam etmek istiyor musunuz? [E/H]: ");
            if (TryCatch.stringGirisi().substring(0, 1).equalsIgnoreCase("e")) urunCikisi();
            else {
                System.out.println("Ana Menuye Yonlendiriliyorsunuz...");
                AnaMenu.giris();
            }
        }
    }

    public void cikis() {
        System.out.println("Cikisa yonlendiriliyorsunuz...");
        System.exit(0);
    }
}