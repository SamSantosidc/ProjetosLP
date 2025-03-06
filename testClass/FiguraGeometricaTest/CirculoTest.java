package FiguraGeometricaTest;

import figurasGeometricas2D.Circulo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CirculoTest {

    private Circulo circulo;

    @BeforeEach
    void setUp() {
        circulo = new Circulo(3);
    }

    @Test
    void calcularArea() {
        assertEquals(113.09733552923255, circulo.calcularArea());
    }

    @Test
    void calcularPerimetro() {
        assertEquals(18.84955592153876, circulo.calcularPerimetro());
    }

    @Test
    void tipoFiguraGeometrica2D() {
        assertEquals("Círculo", circulo.tipoFiguraGeometrica2D());
    }
}