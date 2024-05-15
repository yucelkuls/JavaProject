package j20_StaticKeyword.Tasks.Task01;

public class Rectangle {

    double width;
    double length;
    double area;
    double perimeter;
    public Rectangle() { // psiz const
    }
    public Rectangle(double width, double length) {  // full parametreli
        this.width = width;
        this.length = length;
    }
    @Override
    public String toString() {
        return "Rectangle{" +
               "width=" + width +
               ", length=" + length +
               '}';
    }

    public void areaMeth() {
        area = width * length;
        System.out.println("area = " + area);
    }

    public void perimeterMeth() {
        perimeter = (width + length) * 2;
        System.out.println("perimeter = " + perimeter);
    }
}
