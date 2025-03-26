package petshop;

import petshop.petshopEnums.OpcaoMenu;
import petshop.petshopEnums.TamanhoAnimal;
import petshop.petshopEnums.TamanhoPelo;
import petshop.petshopServicos.Banho;
import petshop.petshopServicos.Hotel;
import petshop.petshopServicos.Tosa;

import java.time.LocalDate;
import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean lojaAberta = true;
        InventarioPetShop petShop = new InventarioPetShop();

        while (lojaAberta) {

            System.out.println("Bem-vindo ao Petbô!");
            System.out.println("Escolha uma opção:");
            for (OpcaoMenu opcao : OpcaoMenu.values()) {
                System.out.println(opcao.getValor() + ". " + opcao.name().replace("_", " ").toLowerCase());
            }
            System.out.print("Digite o número da opção desejada: ");

            int escolha = sc.nextInt();
            sc.nextLine();

            try {

                OpcaoMenu opcao = OpcaoMenu.fromValor(escolha);

                switch (opcao) {
                    case BANHO:
                        System.out.println("Você escolheu: Solicitar banho");

                        LocalDate dataBanho = LocalDate.now();

                        System.out.print("Digite o código do serviço: ");
                        int codigoBanho = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Selecione o tamanho do animal:");
                        for (TamanhoAnimal tamanhoBanho : TamanhoAnimal.values()) {
                            System.out.println((tamanhoBanho.ordinal() + 1) + ". " + tamanhoBanho.name());
                        }
                        System.out.print("Opção: ");
                        int opcaoTamanhoBanho = sc.nextInt();
                        sc.nextLine();
                        TamanhoAnimal tamanhoBanho = TamanhoAnimal.values()[opcaoTamanhoBanho - 1];

                        System.out.println("Selecione o tamanho do pelo:");
                        for (TamanhoPelo peloBanho : TamanhoPelo.values()) {
                            System.out.println((peloBanho.ordinal() + 1) + ". " + peloBanho.name());
                        }
                        System.out.print("Opção: ");
                        int opcaoPeloBanho = sc.nextInt();
                        sc.nextLine();
                        TamanhoPelo tamanhoPelo = TamanhoPelo.values()[opcaoPeloBanho - 1];

                        Banho banho = new Banho(dataBanho, codigoBanho, tamanhoBanho, tamanhoPelo);
                        petShop.adicionaServicoPetShop(banho);

                        System.out.println("Banho agendado com sucesso para hoje (" + dataBanho + ")!");
                        System.out.println("Preço: R$" + banho.calculaPreco());
                        break;
                    case TOSA:
                        System.out.println("Você escolheu: Solicitar tosa");

                        LocalDate dataTosa = LocalDate.now();

                        System.out.println("Digite o código do serviço: ");
                        int codigoTosa = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Selecione o tamanho do animal: ");
                        for (TamanhoAnimal tamanhoTosa : TamanhoAnimal.values()) {
                            System.out.println((tamanhoTosa.ordinal() + 1) + ". " + tamanhoTosa.name());
                        }
                        System.out.print("Opção: ");
                        int opcaoTamanhoBanhoTosa = sc.nextInt();
                        sc.nextLine();
                        TamanhoAnimal tamanhoTosa = TamanhoAnimal.values()[opcaoTamanhoBanhoTosa - 1];

                        Tosa tosa = new Tosa(dataTosa, codigoTosa, tamanhoTosa);
                        petShop.adicionaServicoPetShop(tosa);

                        System.out.println("Tosa agendado com sucesso para hoje (" + dataTosa + ")!");
                        System.out.println("Preço: R$" + tosa.calculaPreco());
                        break;
                    case HOTEL:
                        System.out.println("Você escolheu: Solicitar hospedagem no hotel");

                        LocalDate dataHotel = LocalDate.now();

                        System.out.print("Digite o código do serviço: ");
                        int codigoHotel = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Selecione o tamanho do animal:");
                        for (TamanhoAnimal tamanhoHotel : TamanhoAnimal.values()) {
                            System.out.println((tamanhoHotel.ordinal() + 1) + ". " + tamanhoHotel.name());
                        }
                        System.out.print("Opção: ");
                        int opcaoTamanhoHotel = sc.nextInt();
                        sc.nextLine();
                        TamanhoAnimal tamanhoHotel = TamanhoAnimal.values()[opcaoTamanhoHotel - 1];

                        System.out.println("Digite quantas horas você deseja hospedar seu pet: ");
                        int quantHorasHotel = sc.nextInt();
                        sc.nextLine();

                        Hotel hotel = new Hotel(dataHotel, codigoHotel, tamanhoHotel, quantHorasHotel);
                        petShop.adicionaServicoPetShop(hotel);

                        System.out.println("Hospedagem agendada com sucesso para hoje (" + dataHotel + ")!");
                        System.out.println("Preço: R$" + hotel.calculaPreco());
                        break;
                    case FECHAR_LOJA:
                        System.out.println(petShop.listarServicos());
                        System.out.println("Fechando a loja...");
                        lojaAberta = false;
                        System.out.println("Loja fechada. Até amanhã!");
                        sc.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }


    }

}
