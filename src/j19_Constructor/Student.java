package j19_Constructor;

public class Student {
     int id;
     char ch;
     static char sch;


    public Student() {
        id ++;
        System.out.println(id);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println("sch = " + sch);
        System.out.println("s1.ch = " + s1.ch);
    }
}
