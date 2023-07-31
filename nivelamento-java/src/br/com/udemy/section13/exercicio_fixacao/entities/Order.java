package br.com.udemy.section13.exercicio_fixacao.entities;

import br.com.udemy.section13.exercicio_fixacao.entities.enums.OrderStatus;

import java.util.Date;

public class Order {

    private Date moment;
    private OrderStatus status;

    public Order(OrderStatus status, Client client) {

    }

    public Order(Date moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addItem(OrderItem item) {
    }
}
