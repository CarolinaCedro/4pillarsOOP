package entities;

public class Cachorro extends Mamifero implements AnimaisDomesticos {

    private Double tamanho;
    private String raca;

    public Cachorro(String nome, double tamanho, String raca) {
        super(nome);
        this.tamanho = tamanho;
        this.raca = raca;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String emitirSom() {
        return "AU AU AU";
    }

    @Override
    public String amamentar() {
        return "Ele mama na cachorra..";
    }

    @Override
    public String passearNaPracinha() {
        return "este animal passeia na pracinha";
    }

    @Override
    public String irPetshop() {
        return "este animal vai ao petshop";
    }

    @Override
    public String toString() {
        return "Cachorro" + "\n" +
                "Nome: " + getNome() + "\n" +
                "Raca: " + getRaca() + "\n" +
                "Tamanho: " + getTamanho() + "\n" +
                "Som que produz: " + emitirSom() + "\n" +
                "Como se alimenta: " + amamentar() + "\n" +
                passearNaPracinha() + "\n" +
                irPetshop() + "\n" +
                "---------------------------";
    }


}
