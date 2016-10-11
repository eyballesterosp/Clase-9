package Herencias;

public class B extends A {

    public int y;

    public B(String a, int x, int y) {
        super(x, a);
        this.y = y;
    }

    @Override
    public void yy() {
        System.out.println("xx");
    }
}
