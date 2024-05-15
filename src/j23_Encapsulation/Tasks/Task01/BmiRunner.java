package j23_Encapsulation.Tasks.Task01;

public class BmiRunner {
    public static void main(String[] args) {
        Bmi p1 = new Bmi("John",35,84.9,1.85);
        System.out.println("p1.getStatus() = " + p1.getStatus()); // Normal
        System.out.println("p1.getBMI() = " + p1.getBMI());  // 24.81
        p1.setWeight(85.80);
        System.out.println("p1.getStatus() = " + p1.getStatus()); // Overweight
    }
}
