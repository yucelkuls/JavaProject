package j26_Abstract.abstract02;

public abstract class Salad extends Food {
    public abstract void madeIn();

    @Override
    public void taste() {
        System.out.println("limonlu, sirkeli");
    }
}
