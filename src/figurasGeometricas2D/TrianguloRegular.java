package figurasGeometricas2D;

public class TrianguloRegular implements FiguraGeometrica2D{

    private double lado;

    @Override
    public double calcularArea() {
        return  lado * lado * Math.sqrt(3) / 4;
    }

    @Override
    public double calcularPerimetro() {
        return 3 * lado;
    }

    @Override
    public String tipoFiguraGeometrica2D() {
        return "Triângulo Regular";
    }

    @Override
    public int compareTo(FiguraGeometrica2D o) {
        return Double.compare(this.calcularArea(), o.calcularArea());
    }
}

/*
Resposta escrita dqa qst 3
Não precisei modificar a classe RepositorioFigurasGeometricas2D.
Pois o repositório foi projetado para armazenar qualquer objeto que implemente a interface FiguraGeometrica2D.

A interface define os métodos que todas as figuras geométricas devem ter (calcularArea(), calcularPerimetro() e tipoFiguraGeometrica2D()),
então, desde que a nova classe TrianguloRegular siga essa estrutura, o repositório pode armazená-la sem precisar de ajustes.

Esse comportamento é possível graças ao polimorfismo, que permite tratar diferentes objetos da mesma forma,
desde que sigam um contrato comum (a interface FiguraGeometrica2D).
Assim, novas figuras podem ser adicionadas ao sistema sem modificar o repositório.
 */
