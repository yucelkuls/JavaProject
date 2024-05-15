package j27_Interface.Tasks.Task01;

public class Cember implements Sekil{

    @Override
    public int cevre(int... kenar) {
        return (int) (2*PI*kenar[0]);
    }

    @Override
    public int alan(int... kenar) {
        return (int) (PI*kenar[0]*kenar[0]);
    }
}
