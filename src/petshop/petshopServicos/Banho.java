package petshop.petshopServicos;

import petshop.ServicoPetShop;
import petshop.petshopEnums.TamanhoAnimal;
import petshop.petshopEnums.TamanhoPelo;

import java.time.LocalDate;
import java.util.Objects;

public class Banho extends ServicoPetShop {
    private TamanhoPelo tamanhoPelo;

    public Banho(LocalDate data, int codigo, TamanhoAnimal tamanho, TamanhoPelo tamanhoPelo) {
        super(data, codigo, tamanho);
        this.tamanhoPelo = tamanhoPelo;
    }

    @Override
    public double calculaPreco() {
        double precoBase;

        switch (getTamanho()){
            case PEQUENO:
                precoBase = 50.00;
                break;
            case MÉDIO:
                precoBase = 60.00;
                break;
            case GRANDE:
                precoBase = 70.00;
                break;
            default:
                throw new IllegalArgumentException("Tamanho Invalido" + getTamanho());
        }

        switch (tamanhoPelo){
            case CURTO:
                precoBase += 0.0;
                break;
            case MÉDIO:
                precoBase += 15.00;
                break;
            case LONGO:
                precoBase += 25.00;
                break;
            default:
                throw new IllegalArgumentException("Tamanho Invalido" + tamanhoPelo);
        }

        return precoBase;
    }

    @Override
    public String descricao() {
        return "Banho";
    }

    @Override
    public String toString() {
        return "Banho{" +
                "data=" + getData() +
                ", codigo=" + getCodigo() +
                ", tamanho=" + getTamanho() +
                ", tamanhoPelo=" + tamanhoPelo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Banho banho = (Banho) o;
        return tamanhoPelo == banho.tamanhoPelo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tamanhoPelo);
    }
}
