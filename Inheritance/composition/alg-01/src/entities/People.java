package entities;

import java.util.ArrayList;
import java.util.List;

public class People {

    private String name;
    private Character gender;
    private Integer age;
    private Double peso;

    private Adress adress;
    private Phones phones;


    public People() {
    }

    public People(String name, Character gender, Integer age, Double peso, Adress adress, Phones phones) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.peso = peso;
        this.adress = adress;
        this.phones = phones;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public Phones getPhones() {
        return phones;
    }

    public void setPhones(Phones phones) {
        this.phones = phones;
    }
}
