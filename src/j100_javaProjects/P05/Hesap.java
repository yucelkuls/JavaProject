package j100_javaProjects.P05;

public class Hesap {
    public static int getRam(String ram) {
        int fiyatRam = 0;
        switch (ram) {
            case "4gb":
                fiyatRam += 50;
                break;
            case "8gb":
                fiyatRam += 100;
                break;
            case "16gb":
                fiyatRam += 200;
                break;
            case "32gb":
                fiyatRam += 300;
                break;
        }
        return fiyatRam;
    }

    public static int getCPU(String cpu) {
        int fiyatCPU = 0;
        switch (cpu) {
            case "i3":
                fiyatCPU += 200;
                break;
            case "i5":
                fiyatCPU += 300;
                break;
            case "i7":
                fiyatCPU += 500;
                break;
        }
        return fiyatCPU;
    }
    public static int getColor(String color){
        int fiyatColor = 0;
        if (color.equalsIgnoreCase("red")){
            fiyatColor+=400;
        } else if (color.equalsIgnoreCase("orange")) {
            fiyatColor+=300;
        } else if (color.equalsIgnoreCase("silver")) {
            fiyatColor+=200;
        } else if (color.equalsIgnoreCase("black")) {
            fiyatColor+=150;
        }
        return fiyatColor;
    }

    public static int getSize(String size){
        int fiyatSize = 0;
        if (size.equalsIgnoreCase("max")){
            fiyatSize+=300;
        } else if (size.equalsIgnoreCase("middle")) {
            fiyatSize+=200;
        } else if (size.equalsIgnoreCase("mini")) {
            fiyatSize+=100;
        }
        return fiyatSize;
    }

}
