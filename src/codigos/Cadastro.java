package codigos;

import java.util.ArrayList;
import java.util.Collections;

public class Cadastro {
    private ArrayList<String> itens;

    public Cadastro() {
        this.itens = new ArrayList<>();
    }

    public boolean adiciona(String item) {
        if (item == null) {
            return false;
        }
        return itens.add(item);
    }

    public boolean remove(String item) {
        return itens.remove(item);
    }

    public boolean remove(int index) {
        if (index < 0 || index >= itens.size()) {
            throw new IndexOutOfBoundsException();
        }
        itens.remove(index);
        return true;
    }

    public boolean contem(String item) {
        return itens.contains(item);
    }

    public String recupera(int index) {
        if (index < 0 || index >= itens.size()) {
            throw new IndexOutOfBoundsException();
        }
        return itens.get(index);
    }

    public int recuperaIndice(String item) {
        return itens.indexOf(item);
    }

    public int getNumeroDeItens() {
        return itens.size();
    }

    public void ordena() {
        Collections.sort(itens);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String item : itens) {
            sb.append(item).append("\n");
        }
        return sb.toString();
    }
}