package codigos;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class BlocoDeNotas {

    private List<Anotacao> blocoDeNotas;

    public BlocoDeNotas() {
        this.blocoDeNotas = new ArrayList<>();
    }

    public BlocoDeNotas(List<Anotacao> blocoDeNotas) {
        this.blocoDeNotas = new ArrayList<>(blocoDeNotas);
    }

    public Anotacao addAnotacao(String texto) throws Exception {
        Anotacao anotacao = new Anotacao(texto, blocoDeNotas.size() + 1);
        blocoDeNotas.add(anotacao);
        return anotacao;
    }

    public Anotacao buscaAnotacao(int id) throws Exception {
        for (Anotacao anotacao : blocoDeNotas) {
            if (anotacao.getId() == id && !anotacao.isDeletada()) {
                return anotacao;
            }
        }
        return null;
    }

    public Anotacao editarAnotacao(int id, String novoTexto) throws Exception {
        Anotacao anotacao = buscaAnotacao(id);
        anotacao.setTexto(novoTexto);
        return anotacao;
    }

    public List<Anotacao> recuperarPorTexto(String busca){
        List<Anotacao> subLista = new ArrayList<>();
        for (Anotacao anotacao : blocoDeNotas) {
            if (anotacao.getTexto().contains(busca) && !anotacao.isDeletada()) {
                subLista.add(anotacao);
            }
        }
        return subLista;
    }

    public List<Anotacao> listar(){
        List<Anotacao> subLista = new ArrayList<>();
        for (Anotacao anotacao : blocoDeNotas) {
            if (!anotacao.isDeletada()) {
                subLista.add(anotacao);
            }
        }
        return subLista;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BlocoDeNotas that = (BlocoDeNotas) o;
        return Objects.equals(blocoDeNotas, that.blocoDeNotas);
    }


    @Override
    public int hashCode() {
        return Objects.hashCode(blocoDeNotas);
    }


    @Override
    public String toString() {
        return "BlocoDeNotas{" +
                "blocoDeNotas=" + blocoDeNotas +
                '}';
    }
}