package j23_Encapsulation.Tasks.Task03;

import java.time.LocalDate;

public class Employees {//outher Class level
    private String name;
    private int salary;
    private String dob;

    public Employees(String name, int salary, String dob) {
        this.name = name;
        this.salary = salary;
        this.dob = dob;
    }

    public Employees() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Employees{" +
               "name='" + name + '\'' +
               ", salary=" + salary +
               ", dob='" + dob + '\'' +
               '}';
    }
    public int ageCalculator(){
        return LocalDate.now().getYear() - Integer.valueOf(dob.substring(dob.length() - 4));
    }
    public void status(){
        if (ageCalculator() > 18){
            System.out.println("Welcome to our company Fernando your salary is 80000.");
        } else if (ageCalculator() < 18) {
            System.out.println("Come back when you are 18 years old.");
        }else {
            System.out.println("We can have inter with you after that you can have 80000 salary.");
        }
    }

}//outher class sonu

class  Runner {//inner class level
    public static void main(String[] args) {
        //Employees e1 = new Employees("Fernando", 80000,"11/23/2000");
        //e1.status();  //Welcome to our company Fernando your salary is 80000.

        Employees e2 = new Employees();
        e2.setName("Fernando");
        e2.setDob("11/23/2000");
        e2.setSalary(80000);
        e2.status();  //Welcome to our company Fernando your salary is 80000.
    }
}//inner class sonu
