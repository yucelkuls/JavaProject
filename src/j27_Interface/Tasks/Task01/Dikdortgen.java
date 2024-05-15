package j27_Interface.Tasks.Task01;

public class Dikdortgen implements Sekil{

    @Override
    public int cevre(int... kenar) {
        if (kenar.length==1){//varargsa girilen int parametre 1 tane ise
            return (kenar[0]*4);
        }else {//varargsa girilen int parametre 1 tane ise
            return ((kenar[0]+kenar[1])*2);
        }
    }

    @Override
    public int alan(int... kenar) {
        if (kenar.length==1){//varargsa girilen int parametre 1 tane ise
            return (kenar[0]*kenar[0]);
        }else {//varargsa girilen int parametre 1 tane ise
            return (kenar[0]*kenar[1]);
        }
    }
}
