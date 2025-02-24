package interfacePolimorfismo;


public class Aviao implements Voador{


    private String modelo;
    private boolean turbinaLigada = false;


    public Aviao(String modelo){
        super();
        this.modelo = modelo;
    }


    public void ligarTurbina(){
        System.out.println("Turbina ligada");
        turbinaLigada = true;
    }


    @Override
    public double voar() {
        System.out.println("Voa voa avião");
        return 0;
    }


    @Override
    public void planar() {
        System.out.println("Plana avião");
    }


    @Override
    public boolean pousar() {
        System.out.println("Pousa avião");
        return true;
    }
}
