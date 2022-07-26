package entities;

public class Contato {

    private String name;
    private Integer phone;
    private String email;

    public Contato(String name, Integer phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Nome contato: " + getName() + "\n" +
                "Telefone: " + getPhone() + "\n" +
                "Email: " + getEmail() + "\n" +
                "--------------------" + "\n";

    }
}
