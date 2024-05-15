package j20_StaticKeyword.Tasks.Task03;

public class Lesson {
    String name;
    int credit;

    public Lesson(String name, int credit) {
        this.name = name;
        this.credit = credit;
    }
    public Lesson() {
    }
    @Override
    public String toString() {
        return
               "name='" + name + '\'' +
               ", credit=" + credit;
    }
}
