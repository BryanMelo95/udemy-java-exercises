package br.com.udemy.section4;

import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor 1: ");
        int valor1 = scanner.nextInt();
        System.out.print("Digite o valor 2: ");
        int valor2 = scanner.nextInt();

        System.out.print("Resultado: " + (valor1 + valor2));
    }
}
