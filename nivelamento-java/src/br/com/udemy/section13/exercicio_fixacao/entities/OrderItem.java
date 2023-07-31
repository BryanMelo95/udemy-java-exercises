package br.com.udemy.section13.exercicio_fixacao.entities;

import br.com.udemy.section13.exercicio_fixacao.entities.enums.OrderStatus;

import java.util.Date;

public class OrderItem extends Order {

    private Integer quantity;
    private Double price;


    public OrderItem(Date moment, OrderStatus status, Integer quantity, Double price) {
        super(moment, status);
        this.quantity = quantity;
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
