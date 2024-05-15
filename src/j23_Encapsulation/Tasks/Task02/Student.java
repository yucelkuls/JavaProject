package j23_Encapsulation.Tasks.Task02;

public class Student {//outher Class level
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
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

    @Override
    public String toString() {
        return
                "Student name is " + name +
                "\nHe is " + age + " years old";
    }
}//outher Class sonu

class StudentRunner {//inner class level

    public static void main(String[] args) {
        Student s1 = new Student("JavaCAN", 33);
        System.out.println(s1); // Student name is JavaCAN
                                // He is 33 years old

        s1.setName("Javatar");
        s1.setAge(28);
        System.out.println(s1); //Student name is Javatar
                                //He is 28 years old

    }
}//inner class sonu
