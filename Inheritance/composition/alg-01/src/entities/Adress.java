package entities;

public class Adress {

    private String Logradouro;
    private Integer cep;
    private String refencia;
    private String city;
    private String state;


    public Adress(String logradouro, Integer cep, String refencia, String city, String state) {
        Logradouro = logradouro;
        this.cep = cep;
        this.refencia = refencia;
        this.city = city;
        this.state = state;
    }

    public String getLogradouro() {
        return Logradouro;
    }

    public void setLogradouro(String logradouro) {
        Logradouro = logradouro;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

    public String getRefencia() {
        return refencia;
    }

    public void setRefencia(String refencia) {
        this.refencia = refencia;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
