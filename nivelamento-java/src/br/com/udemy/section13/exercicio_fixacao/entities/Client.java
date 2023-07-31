package br.com.udemy.section13.exercicio_fixacao.entities;

import br.com.udemy.section13.exercicio_fixacao.entities.enums.OrderStatus;

import java.util.Date;

public class Client extends Order {

    private String name;
    private String email;


    public Client(Date moment, OrderStatus status, String name, String email, Date birthDate) {
        super(moment, status);
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
