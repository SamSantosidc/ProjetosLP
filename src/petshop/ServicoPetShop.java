package petshop;

import petshop.petshopEnums.TamanhoAnimal;

import java.time.LocalDate;
import java.util.Objects;

public abstract class ServicoPetShop implements ServicoPetShopIF{

    private LocalDate data;
    private int codigo;
    private TamanhoAnimal tamanho;

    public ServicoPetShop(LocalDate data, int codigo, TamanhoAnimal tamanho) {
        this.data = data;
        this.codigo = codigo;
        this.tamanho = tamanho;
    }

    public abstract double calculaPreco();

    public abstract String descricao();

    public TamanhoAnimal getTamanho() {
        return tamanho;
    }
    public int getCodigo() {
        return codigo;
    }
    public LocalDate getData() {
        return data;
    }

    @Override
    public String toString() {
        return "ServicoPetShop{" +
                "data=" + data +
                ", codigo=" + codigo +
                ", tamanho=" + tamanho +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServicoPetShop that = (ServicoPetShop) o;
        return Objects.equals(data, that.data) &&
                tamanho == that.tamanho;
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, codigo, tamanho);
    }
}

