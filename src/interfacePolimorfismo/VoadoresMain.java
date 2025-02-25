package interfacePolimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class VoadoresMain {
    public static void main(String[] args) {
        RepositorioDeVoadores repositorio = new RepositorioDeVoadores();

        for (int i = 0; i < 10; i++) {
            repositorio.adicionaVoador(recebeVoador());
        }

        for (Voador voador : repositorio.getVoadores()) {
            System.out.println("Voador selecionado: " + voador.getClass().getSimpleName());
            voador.voar();
            voador.planar();
            voador.pousar();
            System.out.println();
        }
    }

    public static Voador recebeVoador() {
        Random r = new Random();
        int escolha = r.nextInt(3); 

        switch (escolha) {
            case 0:
                return new GalinhaVoadora();
            case 1:
                return new Drone("do tipo bom!");
            default:
                return new Aviao("Comercial");
        }
    }
}
