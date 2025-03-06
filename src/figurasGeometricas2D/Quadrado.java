package figurasGeometricas2D;

public class Quadrado implements FiguraGeometrica2D {

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return lado * 4;
    }

    @Override
    public String tipoFiguraGeometrica2D() {
        return "Quadrado";
    }

    @Override
    public int compareTo(FiguraGeometrica2D o) {
        return Double.compare(this.calcularArea(), o.calcularArea());
    }
}
