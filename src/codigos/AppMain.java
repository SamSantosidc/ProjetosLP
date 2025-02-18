package codigos;

public class AppMain {
    public static void main(String[] args) {
        try {

            BlocoDeNotas bloco = new BlocoDeNotas();


            Anotacao a1 = bloco.addAnotacao("Primeira anotação");
            Anotacao a2 = bloco.addAnotacao("Segunda anotação");


            System.out.println("Anotações criadas:");
            for (Anotacao a : bloco.listar()) {
                System.out.println(a);
            }

            // Buscando uma anotação pelo ID
            System.out.println("\nBuscando anotação com ID 1:");
            System.out.println(bloco.buscaAnotacao(1));

            // Editando uma anotação
            bloco.editarAnotacao(1, "Primeira anotação editada");

            // Exibindo anotações após edição
            System.out.println("\nAnotações após edição:");
            for (Anotacao a : bloco.listar()) {
                System.out.println(a);
            }

            // Deletando uma anotação
            a2.deletar();
            System.out.println("\nAnotações após deletar a segunda:");
            for (Anotacao a : bloco.listar()) {
                System.out.println(a);
            }

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }
}