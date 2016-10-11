package Bicicleta;

public class Circulo extends FiguraGeometrica {

    private double radio;

    public Circulo(double radio, String color) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double calcArea() {
        return (Math.pow(this.radio, 2) * Math.PI);
    }
}
