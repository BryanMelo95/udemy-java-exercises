package br.com.udemy.section6;

import java.util.Scanner;

public class E3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        int opcao = sc.nextInt();

        while (opcao != 4){
                if(opcao == 1){
                    alcool = alcool + 1;
                }
                else if (opcao == 2) {
                    gasolina = gasolina + 1;
                }
                else if (opcao == 3) {
                    diesel = diesel + 1;
                }
                else {
                    System.out.println("OPCAO INVALIDA");
                }

                opcao = sc.nextInt();

        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Total de votos: " + " Alcool: " + alcool + ", Gasolina: " + gasolina + ", Diesel: " + diesel);
        sc.close();
    }
}
