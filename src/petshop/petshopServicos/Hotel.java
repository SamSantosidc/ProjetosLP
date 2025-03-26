package petshop.petshopServicos;

import petshop.ServicoPetShop;
import petshop.petshopEnums.TamanhoAnimal;

import java.time.LocalDate;
import java.util.Objects;

public class Hotel extends ServicoPetShop {
    private int qtdHoras;

    public Hotel(LocalDate data, int codigo, TamanhoAnimal tamanho, int qtdHoras) {
        super(data, codigo, tamanho);
        this.qtdHoras = qtdHoras;
    }

    @Override
    public double calculaPreco() {
        double precoBase;
        switch (getTamanho()){
            case PEQUENO:
                precoBase = 12.0 * qtdHoras;
                break;
            case MÉDIO:
                precoBase = 18.0 * qtdHoras;
                break;
            case GRANDE:
                precoBase = 25.0 * qtdHoras;
                break;
            default:
            throw new IllegalArgumentException("Tamanho invalido" + getTamanho());
        }

        return precoBase;
    }

    @Override
    public String descricao() {
        return "Hotel";
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "data=" + getData() +
                ", codigo=" + getCodigo() +
                ", tamanho=" + getTamanho() +
                "horas=" + qtdHoras +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Hotel hotel = (Hotel) o;
        return qtdHoras == hotel.qtdHoras;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), qtdHoras);
    }
}

