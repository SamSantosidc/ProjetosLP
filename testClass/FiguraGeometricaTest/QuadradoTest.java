package FiguraGeometricaTest;

import figurasGeometricas2D.Quadrado;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QuadradoTest {

    private Quadrado quadrado;

    @BeforeEach
    void setUp() {
        quadrado = new Quadrado(4);
    }

    @Test
    void calcularArea() {
        assertEquals(16.0, quadrado.calcularArea());
    }

    @Test
    void calcularPerimetro() {
        assertEquals(16.0, quadrado.calcularPerimetro());
    }

    @Test
    void tipoFiguraGeometrica2D() {
        assertEquals("Quadrado", quadrado.tipoFiguraGeometrica2D());
    }

}