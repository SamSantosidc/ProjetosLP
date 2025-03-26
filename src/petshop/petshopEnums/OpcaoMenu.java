package petshop.petshopEnums;

public enum OpcaoMenu {
    BANHO(1),
    TOSA(2),
    HOTEL(3),
    FECHAR_LOJA(4);

    private final int valor;

    OpcaoMenu(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public static OpcaoMenu fromValor(int valor) {
        for (OpcaoMenu opcao : OpcaoMenu.values()) {
            if (opcao.getValor() == valor) {
                return opcao;
            }
        }
        throw new IllegalArgumentException("Opção inválida: " + valor);
    }

}
