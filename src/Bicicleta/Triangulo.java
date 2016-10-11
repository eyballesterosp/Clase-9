
package Bicicleta;

public class Triangulo extends FiguraGeometrica{
    private int lado;

    public Triangulo(int lado, String color) {
        super(color);
        this.lado = lado;
    }
    @Override
    public double calcArea(){
        return(Math.pow(this.lado, 2) * (Math.sqrt(3)/4));
    }

    @Override
    public String toString() {
        return "Triangulo{" + "lado=" + lado + '}';
    }
       
}
