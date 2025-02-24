package interfacePolimorfismo;


import java.util.Random;


public class VoadoresMain {
    public static void main(String[] args) {
        Voador qqVoador = recebeVoador();
        qqVoador.voar();//chamada polimórfica
        qqVoador.planar();//chamada polimórfica
        qqVoador.pousar();//chamada polimórfica
    }


    public static Voador recebeVoador() {
        Random r = new Random();
        if(r.nextBoolean())
            return new GalinhaVoadora();
        else
            return new Drone("do tipo bom!");

    }
}
