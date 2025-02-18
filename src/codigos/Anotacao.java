package codigos;

import java.time.LocalDate;
import java.util.Objects;


public class Anotacao {


    private String texto;
    private int id;
    private LocalDate dataDeCriacao;
    private boolean deletado;


    public Anotacao(String texto, int id) throws Exception {
        checaTexto(texto);
        checaId(id);

        this.texto = texto;
        this.id = id;
        this.deletado = false;
        dataDeCriacao = LocalDate.now();
    }


    private void checaId(int id) throws Exception {
        if(id <= 0)
            throw new Exception("Id deve ser válido.");
    }

    private void checaTexto(String texto) throws Exception {
        if(texto == null || texto.trim().equals(""))
            throw new Exception("Texto não pode ser vazio ou nulo.");
    }


    public int getId(){
        return id;
    }


    public String getTexto(){
        return texto;
    }


    public LocalDate getDataDeCriacao(){
        return dataDeCriacao;
    }


    public void setTexto(String novoTexto) throws Exception {
        checaTexto(novoTexto);
        this.texto = novoTexto;
    }


    public boolean contemTexto(CharSequence texto){
        //Trecho feito para garantir que ele não seja null antes de chamar contains. Lembrar de tirar dúvida!!!
        return this.texto != null && this.texto.contains(texto);
    }


    public void deletar(){
        this.deletado = true;
    }


    public boolean isDeletada(){
        return deletado;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Anotacao anotacao = (Anotacao) o;
        return id == anotacao.id && Objects.equals(texto, anotacao.texto) && Objects.equals(dataDeCriacao, anotacao.dataDeCriacao);
    }


    @Override
    public int hashCode() {
        return Objects.hash(texto, id, dataDeCriacao);
    }


    @Override
    public String toString() {
        return "Anotacao{" +
                "texto='" + texto + '\'' +
                ", id=" + id +
                ", dataDeCriacao=" + dataDeCriacao +
                ", deletado=" + deletado +
                '}';
    }
}