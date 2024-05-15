package j19_Constructor;
public class myTest {

    public static void swing() {
        System.out.print("swing ");
    }
    public void climb() {
        System.out.println("climb ");
    }
    public static void play() {
        swing();
    //    climb();    does not compile because static methods are not allowed to call instance methods.
    }
    public static void main(String[] args) {
        myTest rope = new myTest();
        rope.play();
        myTest rope2 = null;
        rope2.play();

    }
}
