package Herencias;

public class Main {

    public static void main(String[] args) {
        A a = new A(1,"a");
        a.yy();
        B b = new B("w",4,7);
        b.yy();
    
        A c = new B("1",8,6);
        c.yy();
    }

}
