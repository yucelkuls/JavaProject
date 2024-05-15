package j23_Encapsulation.Tasks.Task01;

import java.text.DecimalFormat;

public class Bmi {//pojo Class
    private String name;
    private int age;
    private double weight;
    private double height;

    public Bmi(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    public Bmi() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBMI(){
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.parseDouble(df.format(weight / (height * height)));
    }

    @Override
    public String toString() {
        return "Bmi{" +
               "name='" + name + '\'' +
               ", age=" + age +
               ", weight=" + weight +
               ", height=" + height +
               '}';
    }

    public String getStatus(){
        if (getBMI() > 30){
            return "Obese";
        } else if (getBMI() > 25) {
            return "Overweight";
        } else if (getBMI() > 18.5) {
            return "Normal";
        }else {
            return "Weak";
        }

    }

}//Class sonu
