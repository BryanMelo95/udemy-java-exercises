package br.com.udemy.section4;

import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codP1, numbP1, codP2, numbP2;
        double valueP1, valueP2;

        System.out.print("Codigo peça 1: ");
        codP1 = sc.nextInt();
        System.out.print("número de peças 1: ");
        numbP1 = sc.nextInt();
        System.out.print("Valor unitário peça 1: ");
        valueP1 = sc.nextDouble();

        double custoP1 = valueP1 * numbP1;

        System.out.print("Codigo peça 2: ");
        codP2 = sc.nextInt();
        System.out.print("número de peças 2: ");
        numbP2 = sc.nextInt();
        System.out.print("Valor unitário peça 2: ");
        valueP2 = sc.nextDouble();

        double custoP2 = valueP2 * numbP2;

        double total = custoP1 + custoP2;


        System.out.print("Peças selecionada: " + codP1 + " e " + codP2 + ", " +
                "Valor a pagar: R$ ");
        System.out.printf("%.2f %n", total);
    }
}
