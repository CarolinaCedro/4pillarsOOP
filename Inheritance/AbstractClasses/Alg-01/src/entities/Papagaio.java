package entities;

public class Papagaio extends Ave {

    public Papagaio(String nome) {
        super(nome);
    }

    @Override
    public String emitirSom() {
        return "E ai pessoal !! vamos hablar ? ";
    }

    @Override
    public String voar() {
        return "voando ...";
    }

    public String toString() {
        return "Papagaio" + "\n" +
                "Nome: " + getNome() + "\n" +
                "Som que produz: " + emitirSom() + "\n" +
                "Como se move: " + voar() + "\n" +
                "---------------------------";
    }
}
