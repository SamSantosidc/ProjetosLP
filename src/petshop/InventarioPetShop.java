package petshop;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class InventarioPetShop {
    List<ServicoPetShopIF> lista = new ArrayList<ServicoPetShopIF>();


    public ServicoPetShopIF adicionaServicoPetShop(ServicoPetShopIF servico) {
        if (servico == null) {
            throw new IllegalArgumentException("Serviço não pode ser nulo");
        }
        lista.add(servico);
        return servico;
    }

    public double calculaValorServico(){
        double valorTotal = 0.0;
        for (ServicoPetShopIF servico : lista)
            valorTotal += servico.calculaPreco();
        return valorTotal;
    }

    public String listarServicos(){
        if (lista.isEmpty()) {
            return "Nenhum serviço cadastrado.";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("\n=== RELATÓRIO DE SERVIÇOS ===\n");
        for (int i = 0; i < lista.size(); i++) {
            sb.append("Servico #").append(i + 1).append(":\n");
            sb.append("Tipo: ").append(lista.get(i).descricao()).append("\n");
            sb.append(lista.get(i).toString()).append("\n");
            sb.append("Preço: R$").append(lista.get(i).calculaPreco()).append("\n");
            sb.append("----------------------------\n");
        }
        sb.append("Total de serviços: ").append(lista.size()).append("\n");
        sb.append("Valor total: R$").append(calculaValorServico()).append("\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        InventarioPetShop that = (InventarioPetShop) o;
        return Objects.equals(lista, that.lista);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(lista);
    }

    @Override
    public String toString() {
        return "InventarioPetShop{" +
                "lista=" + lista +
                '}';
    }
}
