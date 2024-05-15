package j20_StaticKeyword.Tasks.Task03;

import java.util.ArrayList;

public class Student {
    String name;
    int maxCredit;
    ArrayList<Lesson> listLessons;

    public Student(String name, int maxCredit) {
        this.name = name;
        this.maxCredit = maxCredit;
        this.listLessons = new ArrayList<>();
    }

    public Student() {
    }

    public void availableLessons(Lesson les) {
        if (toplamKredisi() + les.credit <= maxCredit) {
            listLessons.add(les);
            System.out.println(les.name + " was added successfully");
        } else {
            System.out.println(les.name + " could not be added. Credit limit exceeded");
        }
    }

    public int toplamKredisi() {
        int totalCredit = 0;
        for (Lesson each : listLessons) {
            totalCredit += each.credit;
        }
        return totalCredit;
    }

}

