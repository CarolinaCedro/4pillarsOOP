package entities;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private String name;
    private Contato contato;


    public Agenda() {
    }

    public Agenda(String name, Contato contato) {
        this.name = name;
        this.contato = contato;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }
}
