package figurasGeometricas2D;

import java.util.List;

public interface FiguraGeometrica2D extends Comparable<FiguraGeometrica2D>, List<T> {
    public double calcularArea();
    public double calcularPerimetro();
    public String tipoFiguraGeometrica2D();
}
