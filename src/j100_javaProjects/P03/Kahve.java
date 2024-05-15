package j100_javaProjects.P03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Kahve {
    static Scanner input = new Scanner(System.in);
    static ArrayList<String> kahveListesi = new ArrayList<>(Arrays.asList("Türk Kahvesi", "Latte", "Espresso"));
    static String c_RED = "\u001B[31m";
    static String BOLD = "\033[0;1m";
    static String c_PURPLE = "\u001B[35m";
    static String c_GREEN = "\u001B[32m";

    //fields ler once tanimlanir...

    String coffeeName;
    String coffeeSize;
    String milk;
    String sugar;
    int price;

    public Kahve() {
    }

    @Override
    public String toString() {
        return
                "CoffeeName='" + coffeeName + '\'' +
                ", CoffeeSize='" + coffeeSize + '\'' +
                ", milk='" + milk + '\'' +
                ", sugar='" + sugar + '\'' +
                ", price=" + price;
    }

    public Kahve(String coffeeName, String coffeeSize, String milk, String sugar, int price) {
        this.coffeeName = coffeeName;
        this.coffeeSize = coffeeSize;
        this.milk = milk;
        this.sugar = sugar;
        this.price = price;
    }

    public void choiseCoffee() {
        System.out.println(BOLD + "Java Kahve'ye Hoşgeldiniz: \n                 Fiyat Menüsü:\n" +
                           "\n" +
                           BOLD + "                 Küçük        Orta        Büyük   \n" +
                           c_RED + "1.Türk kahvesi   30Tl         40Tl          50Tl \n" +
                           c_PURPLE + "2.Latte          35Tl         45Tl          55Tl \n" +
                           c_GREEN + "3.Espresso       40Tl         50Tl          60Tl \n" +
                           "\n" +
                           "* İlave Süt 10Tl  ");

        System.out.println(BOLD + "Hangi Kahveyi istersiniz?Lütfen dilediğiniz kahve numarasını seçin :");
        System.out.println(c_RED + " 1.Türk kahvesi\n" +
                           c_PURPLE + " 2.Latte\n" +
                           c_GREEN + " 3.Espresso");

        int choice = input.nextInt();
        if (choice == 1) {
            System.out.println(kahveListesi.get(choice - 1) + " hazirlaniyor");
            coffeeName = kahveListesi.get(choice - 1);
            price = 30;
        } else if (choice == 2) {
            System.out.println(kahveListesi.get(choice - 1) + " hazirlaniyor");
            coffeeName = kahveListesi.get(choice - 1);
            price = 35;
        } else if (choice == 3) {
            System.out.println(kahveListesi.get(choice - 1) + " hazirlaniyor");
            coffeeName = kahveListesi.get(choice - 1);
            price = 40;
        } else {
            System.out.println("Invalid entrty, please try again");
            choiseCoffee();
        }
    }

    public void choiseMilk() {
        System.out.println(BOLD + "Would you like milk in your coffee?\n"
                           + c_GREEN + "if you say YES - > Enter Y\n"
                           + c_RED + "or NO - > Enter N \n");
        String milkChoise = input.next().substring(0, 1);
        if (milkChoise.equalsIgnoreCase("Y")) {
            System.out.println(BOLD + "Milk is added to your coffee.");
            milk = "Coffee with milk";
            price += 10;
        } else if (milkChoise.equalsIgnoreCase("N")) {
            System.out.println(BOLD + "No milk in your coffee.");
            milk = "Coffee without milk";
        } else {
            System.out.println("Invalid entry, please try again...");
            choiseMilk();
        }
    }

    public void choiseSugar() {
        System.out.println(BOLD + "Would you like sugar in your coffee?\n"
                           + c_GREEN + "if you say YES - > Enter Y\n"
                           + c_RED + "or NO - > Enter N \n");
        String sugarChoise = input.next().substring(0, 1);
        if (sugarChoise.equalsIgnoreCase("Y")) {
            System.out.println("How much sugar would you like?");
            int sugarNumber = input.nextInt();
            System.out.println(BOLD + sugarNumber + " sugar added to your coffee.");
            sugar = "Coffee with sugar";
            price += 10;
        } else if (sugarChoise.equalsIgnoreCase("N")) {
            System.out.println(BOLD + "No sugar in your coffee.");
            sugar = "Coffee without sugar";
        } else {
            System.out.println("Invalid entry, please try again...");
            choiseSugar();
        }
    }

    public void choiseSize() {
        System.out.println(BOLD + "What size coffee would you like to buy?\n"
                           + c_GREEN + "If it is large, enter L\n"
                           + c_RED + "If it is medium, enter M\n"
                           + c_PURPLE + "If it is small, enter S");
        String sizeChoise = input.next().substring(0, 1);
        if (sizeChoise.equalsIgnoreCase("L")) {
            System.out.println(BOLD + "Your coffee is large");
            coffeeSize = "Large";
            price += 20;
        } else if (sizeChoise.equalsIgnoreCase("M")) {
            System.out.println(BOLD + "Your coffee is medium");
            coffeeSize = "Medium";
            price += 10;
        } else if (sizeChoise.equalsIgnoreCase("S")) {
            System.out.println(BOLD + "Your coffee is small");
            coffeeSize = "Small";

        } else {
            System.out.println("Invalid entry, please try again...");
            choiseSize();
        }
    }
    public void calculateFee(){
        System.out.println("The fee is $"+ price);
        int pay = input.nextInt();
        System.out.println("You pay is "+pay);
        if (price > pay){
            System.out.println(price - pay + "$ still need to be paid");
            calculateFee();
        }else {
            System.out.println("Thanks for paying :) \n" +
                               "Your change is : " + (pay - price));
        }
    }
}




