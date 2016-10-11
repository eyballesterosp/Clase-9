package Bicicleta;


public class MainB {

    public static void main(String[] args) {
        Circulo llanta1 = new Circulo(10, "negro");
        Circulo llanta2 = new Circulo(10, "negro");
        Circulo plato = new Circulo(2, "plata");
        Triangulo marco1 = new Triangulo(5, "rojo");
        Triangulo marco2 = new Triangulo(5, "rojo");
        Triangulo marco3 = new Triangulo(5, "rojo");
        
        Bicicleta b = new Bicicleta();
        
        b.addFiguraGeometrica(plato);
        b.addFiguraGeometrica(llanta1);
        b.addFiguraGeometrica(llanta2);
        b.addFiguraGeometrica(marco1);
        b.addFiguraGeometrica(marco2);
        b.addFiguraGeometrica(marco3);
        
        double area = b.calcAreaTotal();
        System.out.println("2: "+area);
    }
    
}
