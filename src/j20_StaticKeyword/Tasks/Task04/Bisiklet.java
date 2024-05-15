package j20_StaticKeyword.Tasks.Task04;

import java.util.Scanner;

public class Bisiklet {

    int speed;
    int gear;

    static String c_RED = "\u001B[31m";
    static String BOLD = "\033[0;1m";
    static String c_PURPLE = "\u001B[35m";
    static String c_GREEN = "\u001B[32m";

    public Bisiklet(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
    }

    public Bisiklet() {
//        speed=0;
//        gear=0;
    }

    public void islemYap(){
        Scanner input = new Scanner(System.in);
        while (true){
        System.out.println(BOLD + "Welcome to bike simulation\n"+
                          c_RED +"Enter 1 -> to change the speed\n"+
                           c_GREEN + "Enter 2 -> to increase the gear\n"+
                           c_RED + "Enter 3 -> to decrease the gear\n"+
                           c_GREEN + "Enter 4 -> to show status\n"+
                           c_PURPLE + "Enter 5 -> to close");
        int choise = input.nextInt();
            switch (choise) {
                case 1:
                    System.out.println("Please enter speed: ");
                    changeSpeed(input.nextInt());
                    break;
                case 2:
                    vitesArtir();
                    break;
                case 3:
                    vitesAzalt();
                    break;
                case 4:
                    showStatus();
                    break;
                case 5:
                    System.out.println("The program is over...");
                    return;
                default:
                    System.out.println("Invalid entry, please try again...");
            }
        }
    }

    public void changeSpeed(int newSpeed){
        this.speed = newSpeed;
    }
    public void vitesArtir(){
        if (gear<5){
            gear++;
        }else {
            System.out.println("The gear cannot be greater than 5");
        }
    }
    public void vitesAzalt(){
        if (gear>1){
            gear--;
        }else {
            System.out.println("The gear cannot be lower than 1");
        }
    }
    public void showStatus(){
        System.out.println("speed = " + speed + "gear = " + gear);
    }

    @Override
    public String toString() {
        return "Bisiklet{" +
               "speed=" + speed +
               ", gear=" + gear +
               '}';

    }
}
