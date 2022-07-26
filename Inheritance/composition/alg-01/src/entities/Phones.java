package entities;

import java.util.List;

public class Phones {

    private Integer residential;
    private Integer personal;

    public Phones(Integer residential, Integer personal) {
        this.residential = residential;
        this.personal = personal;
    }


    public Integer getResidential() {
        return residential;
    }

    public void setResidential(Integer residential) {
        this.residential = residential;
    }

    public Integer getPersonal() {
        return personal;
    }

    public void setPersonal(Integer personal) {
        this.personal = personal;
    }
}

