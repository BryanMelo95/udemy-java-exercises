package br.com.udemy.section10.alturas.application;

import br.com.udemy.section10.alturas.entities.Pessoas;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int p = sc.nextInt();
        Pessoas[] pessoas = new Pessoas[p];


        for (int i=0; i<p; i++) {
            System.out.println();
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            pessoas[i] = new Pessoas(nome, idade, altura);
        }

        double alturaTotal = 0.0;
        for (int i=0; i<p; i++) {
            alturaTotal += pessoas[i].getAltura();
        }

        double avg = 0.0;
        avg = alturaTotal / p;
        System.out.printf("MEDIA DE ALTURA: %.2f%n", avg);

        sc.close();
    }
}
