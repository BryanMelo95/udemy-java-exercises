package br.com.udemy.section13.exercicio_fixacao.application;

import br.com.udemy.section13.exercicio_fixacao.entities.Client;
import br.com.udemy.section13.exercicio_fixacao.entities.Order;
import br.com.udemy.section13.exercicio_fixacao.entities.OrderItem;
import br.com.udemy.section13.exercicio_fixacao.entities.Product;
import br.com.udemy.section13.exercicio_fixacao.entities.enums.OrderStatus;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data: ");
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Email: ");
        String email = sc.nextLine();

        Client client = new Client(name, email);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.nextLine());

        Order order = new Order(status, client);

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            System.out.print("Enter #" + (i+1) + " item data: ");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();

            Product product = new Product(productName, productPrice);

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            OrderItem orderItem = new OrderItem(quantity, productPrice, product);

            order.addItem(orderItem);
        }

        System.out.println();
        System.out.println("ORDER SUMMARY");
        sout


        sc.close();
    }

}
