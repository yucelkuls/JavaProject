package j100_javaProjects.P05;

import java.util.*;

public class Fiyat {
    static Scanner scan = new Scanner(System.in);
    static List<Data> list = new ArrayList<>();
    static List<Integer> idList = new ArrayList<>();
    public void mainMenu() throws InterruptedException, ResourceNotFoundException {
        System.out.println("\n **** ANA MENU ****");
        System.out.println("Admin Girisi -> 1");
        System.out.println("User Girisi -> 2");
        System.out.println("Exit -> 3");
        System.out.println("Seciniz : ");
        int secim=0;
        try {
            secim = scan.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Invalid entry, please try again");
            scan.next();
            mainMenu();
        }
        if (secim==1){
            scan.nextLine();
            System.out.println("\nAdmin username giriniz : ");
            String admin = scan.nextLine();
            System.out.println("Sifrenizi giriniz :");
            String sifre = scan.next();
            String adminUser = "admin";
            String adminPass = "admin01";
            if (admin.equals(adminUser)&& sifre.equals(sifre)){
                System.out.println("\n Admin menuye yonlendiriliyorsunuz");
                Thread.sleep(2000);
                adminMenu();
            }else {
                System.out.println("Sifreniz ve kullanici adiniz hatali. Tekrar deneyin");
                mainMenu();
            }
        } else if (secim==2) {
            if (!list.isEmpty()){
                printf();
                System.out.println("Lutfen ID girerek bir bilgisayar seciniz");
                int id = scan.nextInt();
                if (idList.contains(id)){
                    int totalFiyat = getFiyat(id);
                    System.out.println("Laptop fiyati = "+totalFiyat);
                    System.out.println("Indirimli Fiyat = "+getDiscount(totalFiyat,20));
                }else {
                    System.out.println("Kayitli olmayan bir bilgisayar sectiniz");
                    mainMenu();
                }
            }else {
                System.out.println("Sitemiz bakimda, cikis yapiyorsunuz yeniden bekleriz");
            }

        }


    }

    private double getDiscount(int totalFiyat, int discount) {
        return totalFiyat - (totalFiyat * discount) / 100;
    }

    private int getFiyat(int id) {
        int index = idList.indexOf(id);
        Data data = list.get(index);
        return Hesap.getRam(data.getRam())+Hesap.getCPU(data.getCpu())+
               Hesap.getColor(data.getColor())+Hesap.getSize(data.getBoyut());
    }

    private void adminMenu() throws InterruptedException, ResourceNotFoundException {
        System.out.println("*** ADMİN MENÜSÜ ***");

        System.out.println("Bilgisayar eklemek için - 1");
        System.out.println("Bilgisayar silmek için - 2");
        System.out.println("Bilgisayarlari görüntülemek için - 3");
        System.out.println("Bilgisayar guncelleme - 4");
        System.out.println("Ana menüye dönmek icin - 5");
        System.out.println("Çıkış için - 6");
        System.out.print("Seçiniz : ");
        int secim = scan.nextInt();
        scan.nextLine();
        if (secim == 1) bilgisayarEkleme();
       else if (secim == 2) bilgisayarSilme();
       else if (secim == 3) bilgsayarlariGoruntule();
//        else if (secim == 4) bilgisayarGuncelleme();
//        else if (secim == 5) mainMenu();
        else if (secim == 6) System.out.println("\nÇıkış yaptnız.");
        else {
            System.out.println("\nHatalı Giriş. Yeniden Deneyiniz.");
            adminMenu();
        }
    }

    private void bilgsayarlariGoruntule() throws InterruptedException, ResourceNotFoundException {
        System.out.println("Bilgisayar listemiz asagidadir : ");
        printf();
        Thread.sleep(2000);
        adminMenu();
    }

    private void bilgisayarSilme() throws ResourceNotFoundException, InterruptedException {
        System.out.println();
        printf();
        System.out.println("Silmek istediginiz bilgisayar ID'si giriniz : ");
        int id = scan.nextInt();
        if (idList.contains(id))    {
            int index = idList.indexOf(id);
            Data data = list.remove(index);
            System.out.println(data+" bilgisayari silindi");
            idList.remove(index);
            Thread.sleep(2000);
            adminMenu();
        }else {
            throw new ResourceNotFoundException(id + " no'lu id sistemde yoktur");
        }
    }

    private void bilgisayarEkleme() throws InterruptedException, ResourceNotFoundException {
        try {
            System.out.println();
            System.out.println("Bilgisayarin markasini giriniz: ");
            String marka = scan.nextLine();
            marka = marka.substring(0, 1).toUpperCase() + marka.substring(1);
            System.out.println("Bilgisayarin modelini giriniz: ");
            String model = scan.nextLine();
            model = model.substring(0, 1).toUpperCase() + model.substring(1);
            System.out.println("Bilgisayarin ram ini giriniz: ");
            String ram = scan.next().toLowerCase();
            ram = ram.substring(0, 1).toUpperCase() + ram.substring(1);
            System.out.println("Bilgisayarin cpu giriniz: ");
            String cpu = scan.next().toLowerCase();
            cpu = cpu.substring(0, 1).toUpperCase() + cpu.substring(1);
            System.out.println("Bilgisayarin boyutunu giriniz: ");
            String size = scan.next();
            size = size.substring(0, 1).toUpperCase() + size.substring(1);
            System.out.println("Bilgisayarin rengini giriniz: ");
            scan.nextLine();
            String color = scan.nextLine();
            color = color.substring(0, 1).toUpperCase() + color.substring(1);
            Data data = new Data();
            data.setMarka(marka);
            data.setModel(model);
            data.setRam(ram);
            data.setCpu(cpu);
            data.setBoyut(size);
            data.setColor(color);
            list.add(data);
            int dataId = Data.laptopID++;
            idList.add(dataId);
            System.out.println("Bilgisayar eklendi");
            Thread.sleep(2000);
            adminMenu();
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Her degiskene bir deger atamak gerekiyor");
            bilgisayarEkleme();
        }
    }

    private void printf() {
        System.out.printf("%20s%20s%20s%20s%20s%20s%20s", "LaptopID", "Marka", "Model", "Ram", "CPU", "Boyut", "Color");
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%20s%20s%20s%20s%20s%20s%20s\n", idList.get(i), list.get(i).getMarka(),
                    list.get(i).getModel(), list.get(i).getRam(), list.get(i).getCpu(), list.get(i).getBoyut(), list.get(i).getColor());
        }
    }


}
