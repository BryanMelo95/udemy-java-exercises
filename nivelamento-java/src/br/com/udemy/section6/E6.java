package br.com.udemy.section6;

import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        float soma = 0f;

        for(int i=0; i<n; i++){
            float valor = sc.nextFloat();
            soma = soma + valor;
        }

        System.out.printf("media = %.1f %n", soma / 3);

        sc.close();
    }
}
