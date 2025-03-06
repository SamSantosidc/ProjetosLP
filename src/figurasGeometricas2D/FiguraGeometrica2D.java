package figurasGeometricas2D;

import java.util.List;

public interface FiguraGeometrica2D extends Comparable<FiguraGeometrica2D> {
    public double calcularArea();
    public double calcularPerimetro();
    public String tipoFiguraGeometrica2D();
}
