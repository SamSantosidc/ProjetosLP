package petshop.petshopServicos;

import petshop.ServicoPetShop;
import petshop.petshopEnums.TamanhoAnimal;

import java.time.LocalDate;

public class Tosa extends ServicoPetShop {

    public Tosa(LocalDate data, int codigo, TamanhoAnimal tamanho) {
        super(data, codigo, tamanho);
    }

    @Override
    public double calculaPreco() {
        double precoBase;
        switch (getTamanho()){
            case PEQUENO:
                precoBase = 30.00;
                break;
            case MÉDIO:
                precoBase = 40.00;
                break;
            case GRANDE:
                precoBase = 50.00;
                break;
            default:
                throw new IllegalArgumentException("Tamanho Invalido" + getTamanho());
        }

        return precoBase;
    }

    @Override
    public String descricao() {
        return "Tosa";
    }

    @Override
    public String toString() {
        return "Tosa{" +
                "data=" + getData() +
                ", codigo=" + getCodigo() +
                ", tamanho=" + getTamanho() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
