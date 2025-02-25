package figurasGeometricas2D;

public class Circulo implements FiguraGeometrica2D{

    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return 4 * Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public String tipoFiguraGeometrica2D() {
        return "Círculo";
    }

    @Override
    public int compareTo(FiguraGeometrica2D o) {
        return 0;
    }
}
