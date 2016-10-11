package Bicicleta;

public class Bicicleta {

    private FiguraGeometrica[] fgs;
    private int numfgs;

    public Bicicleta() {
        this.fgs = new FiguraGeometrica[6];
        this.numfgs = 0;
    }

    public boolean addFiguraGeometrica(FiguraGeometrica f) {

        if (numfgs < 6) {
            this.fgs[this.numfgs] = f;
            this.numfgs++;
            return true;
        }
        return false;
    }

    public double calcAreaTotal() {
        double area = 0;
        for (FiguraGeometrica fg : fgs) 
            area += fg.calcArea();
        
        System.out.println("Area Total: " + area);
        return area;
    }

}
