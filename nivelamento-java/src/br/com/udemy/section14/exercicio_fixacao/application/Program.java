package br.com.udemy.section14.exercicio_fixacao.application;

import br.com.udemy.section14.exercicio_fixacao.model.entities.ImportedProduct;
import br.com.udemy.section14.exercicio_fixacao.model.entities.Product;
import br.com.udemy.section14.exercicio_fixacao.model.entities.UsedProduct;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sfd = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> productList = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            System.out.print("Product #" + (i+1) + " data: ");
            System.out.println("Common, used or imported (c/u/i)? ");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            if (type == 'c') {
                productList.add(new Product(name, price));
            }
            else if (type == 'u') {
                System.out.print("Manufacture date: (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                productList.add(new UsedProduct(name, price, date));
            }
            else {
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                productList.add(new ImportedProduct(name, price, customsFee));
            }
        }

        System.out.println();
        System.out.println("ETIQUETAS DE PRECO:");
        for (Product prod : productList) {
            System.out.println(prod.priceTag());
        }


        sc.close();
    }
}
