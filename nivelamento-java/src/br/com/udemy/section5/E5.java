package br.com.udemy.section5;

import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cachorroQuente = 1;
        int xSalada = 2;
        int xBacon = 3;
        int torradaSimples = 4;
        int refrigerante = 5;

        double valor1 = 4.00f;
        double valor2 = 4.50f;
        double valor3 = 5.00f;
        double valor4 = 2.00f;
        double valor5 = 1.50f;

        System.out.print("digite o codigo do pedido: ");
        int pedido = sc.nextInt();
        System.out.print("digite a quantidade de lanches do pedido: ");
        double quant = sc.nextDouble();

        double valorTotal;

        if (pedido == cachorroQuente){
            valorTotal = valor1 * quant;
            System.out.println("Valor Total: " + valorTotal);
        } else if (pedido == xSalada) {
            valorTotal = valor2 * quant;
            System.out.println("Valor Total: " + valorTotal);
        } else if (pedido == xBacon) {
            valorTotal = valor3 * quant;
            System.out.println("Valor Total: " + valorTotal);
        } else if (pedido == torradaSimples) {
            valorTotal = valor4 * quant;
            System.out.println("Valor Total: " + valorTotal);
        } else if (pedido == refrigerante) {
            valorTotal = valor5 * quant;
            System.out.println("Valor Total: " + valorTotal);
        }
    }
}
