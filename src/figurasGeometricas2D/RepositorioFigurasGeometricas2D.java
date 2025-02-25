package figurasGeometricas2D;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RepositorioFigurasGeometricas2D {
    private final List<FiguraGeometrica2D> figurasGeometricas2D;

    public RepositorioFigurasGeometricas2D() {
        this.figurasGeometricas2D = new ArrayList<>();
    }

    public boolean addFiguraGeometrica2D(FiguraGeometrica2D fg) {
        if (fg == null) {
            throw new IllegalArgumentException("A figura não pode ser nula.");
        }
        return figurasGeometricas2D.add(fg);
    }

    public FiguraGeometrica2D removerFiguraGeometrica2D(int indice) {
        if (indice < 0 || indice >= figurasGeometricas2D.size()) {
            throw new IndexOutOfBoundsException("Índice inválido: " + indice);
        }
        return figurasGeometricas2D.remove(indice);
    }

    public void organizarPorArea(){
        Collections.sort(figurasGeometricas2D);
    }

    public List<FiguraGeometrica2D> getFigurasGeometricas2D() {
        return Collections.unmodifiableList(figurasGeometricas2D);
    }

}
