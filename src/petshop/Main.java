package petshop;

import petshop.petshopEnums.TamanhoAnimal;
import petshop.petshopEnums.TamanhoPelo;
import petshop.petshopServicos.Banho;
import petshop.petshopServicos.Hotel;
import petshop.petshopServicos.Tosa;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        InventarioPetShop inventario = new InventarioPetShop();

        inventario.adicionaServicoPetShop(new Banho(LocalDate.now(), 1, TamanhoAnimal.PEQUENO, TamanhoPelo.CURTO));
        inventario.adicionaServicoPetShop(new Tosa(LocalDate.now(), 2, TamanhoAnimal.MÉDIO));
        inventario.adicionaServicoPetShop(new Hotel(LocalDate.now(), 3, TamanhoAnimal.GRANDE, 5));

        System.out.println("Serviços no inventário:");
        System.out.println(inventario.listarServicos());

        System.out.println("Valor total dos serviços: R$" + inventario.calculaValorServico());
    }
}