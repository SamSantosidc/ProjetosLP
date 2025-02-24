package interfacePolimorfismo;


import java.util.ArrayList;
import java.util.List;


public class RepositorioDeVoadores {
    private List<Voador> voadores = new ArrayList<>();


    public boolean adicionaVoador(Voador voador) {
        return voadores.add(voador);
    }


    public Voador removeVoador(int posicao) {
        return voadores.remove(posicao);
    }


    //Chamada polimórfica
    public void fazVoar(int posicao) {
        voadores.get(posicao).voar();
    }


    //Chamada polimórfica
    public void fazPousar(int posicao) {
        voadores.get(posicao).pousar();


    }


    //Chamada polimórfica
    public void fazPlanar(int posicao) {
        voadores.get(posicao).planar();
    }


    //Chamada polimórfica
    public void fazTodosVoarem() {
        for (Voador voador : voadores) {
            voador.voar();
        }
    }


    //Chamada polimórfica
    public void fazTodosPousarem() {
        for (Voador voador : voadores) {
            voador.pousar();
        }
    }


    //Chamada polimórfica
    public void fazTodosPlanarem() {
        for (Voador voador : voadores) {
            voador.planar();
        }
    }
}
