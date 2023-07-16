package br.com.udemy.section5;

import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        System.out.print("digite o valor: ");

        numero = sc.nextInt();
        if (numero % 2 == 0){
            System.out.println("par");
        } else {
            System.out.println("impar");
        }
    }
}
