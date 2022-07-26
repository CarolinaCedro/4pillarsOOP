package entities;

public class Gato extends Mamifero {
    private String raca;

    public Gato(String nome, String raca) {
        super(nome);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }


    @Override
    public String emitirSom() {
        return "Miau Miau Miau";
    }

    @Override
    public String amamentar() {
        return "Ela mama na gata...";
    }

    @Override
    public String toString() {
        return "Gato" + "\n" +
                "Nome: " + getNome() + "\n" +
                "Raca: " + getRaca() + "\n" +
                "Som que produz: " + emitirSom() + "\n" +
                "Como se alimenta: " + amamentar() + "\n" +
                "---------------------------";
    }
}
