package br.com.udemy.section10.soma_vectores;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        for (int i=0; i<n; i++) {
            System.out.println("Digite os valores do setor A: ");
            a[i] = sc.nextInt();
        }

        for (int i=0; i<n; i++) {
            System.out.println("Digite os valores do setor B: ");
            b[i] = sc.nextInt();
        }

        for (int i=0; i<n; i++) {
            c[i] = a[i] + b[i];
        }

        System.out.println("VETOR RESULTANTE:");

        for (int i=0; i<n; i++) {
            System.out.printf("%d\n", c[i]);
        }

        sc.close();
    }
}
