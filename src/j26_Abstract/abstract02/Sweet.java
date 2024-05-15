package j26_Abstract.abstract02;

public abstract class Sweet extends Food{
    public abstract void madeIn();

    @Override
    public void taste() {
        System.out.println("good, sugar, sweet");
    }
}
